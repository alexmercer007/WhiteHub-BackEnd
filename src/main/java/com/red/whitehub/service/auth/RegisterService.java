

package com.red.whitehub.service.auth;

import com.red.whitehub.dto.auth.RegisterDTO;
import com.red.whitehub.entity.user.User;
import com.red.whitehub.JpaRepository.UserRepository;
import com.red.whitehub.Security.Role;
import exception.EmailAlreadyExistsException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Alejandro
 */


public class RegisterService {
    
    private UserRepository userRepository;
    
    public RegisterService( UserRepository userRepository ){
        this.userRepository = userRepository;
    }
    
    public ResponseEntity<String> setUserRegister(RegisterDTO registerDto){
        
       boolean existe = userRepository.existsByEmail(registerDto.getEmail());
        
        if(existe){
            
             throw new EmailAlreadyExistsException("El email ya está registrado");
                      
        } else {
            
            User user = new User();
            
            user.setName(registerDto.getName());
            user.setLastName(registerDto.getLastName());
            user.setUserName(registerDto.getUserName());
            user.setEmail(registerDto.getEmail());
            user.setPassword(registerDto.getPassword());
            user.setRole(Role.ROLE_USER_GUEST);
            
            userRepository.save(user);
            
        }
              
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario registrado correctamente");
    }   
    
}
