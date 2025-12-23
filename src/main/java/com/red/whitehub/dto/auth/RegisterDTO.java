/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.dto.auth;

import com.red.whitehub.Security.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 *
 * @author Alejandro
 */
public class RegisterDTO {
    
    
  @NotBlank( message = "name not empty")
 @Size( max = 100 )
  private String name;
  
  @NotBlank( message = "lastName not empty")
 @Size( max = 100 )
 private String lastName;
 
 @NotBlank( message = "userName not empty")
 @Size( min = 3, max = 50 )
 private String userName;
    
 @NotBlank( message = "email not empty")
 @Email( message = "invalid email")
 @Size( max = 255 )
  private  String email;
 
 @NotBlank( message = "password not empty")
 @Size( max = 255 )
 private String password;
 
 private Role role;
    
   public RegisterDTO( String name, String userName, String email, String password ){
   
   this.name = name;
   this.userName = userName;
   this.email = email;
   this.password = password; 
   
   } 
    
   
//----------------------------------------------------------------------------- Setters ---------------------------------------------------------------------------------
 
 
public void setName( String name ){
    this.name = name;
}

public void setlastName( String lastName ){
    this.lastName = lastName;
}

public void setUserName( String userName ){
    this.userName = userName;
}   
   
public void setEmail( String email ){
    this.email = email;
}

public void setPassword( String password ){
    this.password = password;
}

public void setRole( Role role ){
    this.role = role;
}


//----------------------------------------------------------------------------- Getters ---------------------------------------------------------------------------------


public String getName( ){
    return this.name;
}

public String getLastName( ){
    return this.lastName;
}

public String getUserName( ){
    return this.userName;
}  

public String getEmail( ){
    return this.email;
}

public String getPassword(){
    return this.password;
}

public Role getRole( ){
    return this.role;
}
      
    
    
}
