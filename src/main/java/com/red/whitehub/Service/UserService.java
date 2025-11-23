

package com.red.whitehub.Service;

import com.red.whitehub.Dto.UserDTO;
import com.red.whitehub.Entity.User;
import com.red.whitehub.JpaRepository.UserRepository;
import com.red.whitehub.Security.Role;
import exception.EmailFoundException;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alejandro
 */
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    
    public UserService(PasswordEncoder passwordEncoder, UserRepository userRepository){
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }
    
    public User register(UserDTO userDto) throws EmailFoundException {

        if (userRepository.existsByEmailIgnoreCase(userDto.email())) {
            throw new EmailFoundException("El email ya está registrado");
        }
        
       User user = new User();

       user.setName(userDto.name());
       user.setLastName(userDto.lastName());
       user.setUserName(userDto.userName());
       user.setEmail(userDto.email());
       user.setPassword(passwordEncoder.encode(userDto.password()));
       user.setBirthdate(userDto.birthdate());
       user.setPhoneNumber(userDto.phoneNumber());
       user.setCreatedAt(LocalDateTime.now());

       user.setRole(Role.ROLE_USER_GUEST);


        return userRepository.save(user);
    }
    
}
