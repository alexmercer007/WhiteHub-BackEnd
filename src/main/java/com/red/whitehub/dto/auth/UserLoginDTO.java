
package com.red.whitehub.dto.auth;

import com.red.whitehub.Security.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author aleja
 */
public class UserLoginDTO {
 
 @NotBlank( message = "email not empty")
 @Email( message = "invalid email")
 @Size( max = 60 )
  private  String email;
 
 @NotBlank( message = "password not empty")
 @Size( max = 256 )
 private String password;
 
 private Role role;
 
 public UserLoginDTO(){
     
 }

 public UserLoginDTO( String email, String password, Role role ){
 
 this.email = email;
 this.password = password;
 this.role = role;
 
 }

 
 //----------------------------------------------------------------------------- Setters ---------------------------------------------------------------------------------
 
 
public void setEmail( String email ){
    this.email = email;
}

public void setPassword( String password ){
    this.email = password;
}

public void setRole( Role role ){
    this.role = role;
}


//----------------------------------------------------------------------------- Getters ---------------------------------------------------------------------------------


public String getEmail( ){
    return this.email;
}

public String getPassword(){
    return this.email;
}

public Role getRole( ){
    return this.role;
}



















 
 
  
}
