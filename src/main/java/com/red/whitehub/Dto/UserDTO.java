
package com.red.whitehub.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;

/**
 *
 * @author aleja
 */
public record UserDTO (
      
 
 @NotBlank( message = "name not empty")
 @Size(max = 60)
 String name,
 
 @NotBlank( message = "lastName not empty")
 @Size( max = 60 )
 String lastName,
 
 @NotBlank( message = "userName not empty")
 @Size( max = 30 )
  String userName,
 
 @NotBlank( message = "email not empty")
 @Email( message = "invalid email")
 @Size( max = 60 )
  String email,
 
 @NotBlank( message = "password not empty")
 @Size( max = 256 )
 String password,
 
 @NotNull( message = "compulsory age" )
 LocalDate birthdate,
 
 @NotBlank( message = "mandatory phone number")
 @Size( max = 50 )
 String phoneNumber,
 
 String role ){
 
  
}
