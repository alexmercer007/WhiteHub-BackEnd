

package com.red.whitehub.security;

import com.red.whitehub.security.CustomUserDetails;
import com.red.whitehub.dto.auth.UserLoginDTO;
import com.red.whitehub.entity.user.User;
import com.red.whitehub.JpaRepository.UserRepository;
import java.util.Optional;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author aleja
 */
public class CustomUserDetailsService implements UserDetailsService {
    
    private final UserRepository userRepository;
    
    public CustomUserDetailsService(UserRepository userRepository) { 
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        User user = userRepository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("Usuario no encontrado"));
        
        UserLoginDTO userDto = new UserLoginDTO();  
        
        if (user.isBanned()) throw new DisabledException("Usuario bloqueado");
        if (user.getDeleted()) throw new DisabledException("Usuario eliminado");
        if (user.isTemporaryBan()) throw new LockedException("Usuario bloqueado temporalmente");
        
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());   
      
        return new CustomUserDetails(userDto); 
    }
   
}
