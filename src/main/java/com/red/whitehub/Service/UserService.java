

package com.red.whitehub.Service;

import com.red.whitehub.Dto.UserDTO;
import com.red.whitehub.Entity.User;
import com.red.whitehub.JpaRepository.UserRepository;
import com.red.whitehub.Utilities.Role;
import exception.EmailFoundException;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro
 */
@Service
public class UserService extends Role {
    
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public User register(UserDTO userDto) throws EmailFoundException {  
        
        Optional<User> userOptional = userRepository.findByEmail(userDto.getEmail());
        
        if(userOptional.isPresent()){
            throw new EmailFoundException("El email ya está registrado: " + userDto.getEmail());     
        }
        
       User user = new User(); 
       
       user.setName(userDto.getName());
       user.setLastName(userDto.getLastName());
       user.setUserName(userDto.getUserName());
       user.setEmail(userDto.getEmail());
       user.setPassword(userDto.getPassword());
       user.setbirthdate(userDto.getBirthdate());
       user.setPhoneNumber(userDto.getPhoneNumber());
       user.setCreatedAt(LocalDateTime.now());
       user.setRole(Role.ROLE_USER_GUEST);
        
        return userRepository.save(user);
    }
    
}
