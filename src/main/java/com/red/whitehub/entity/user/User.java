

package com.red.whitehub.entity.user;

import com.red.whitehub.entity.location.Country;
import com.red.whitehub.Security.Role;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name ="User")
public class User {
    
 
 @Id 
 @GeneratedValue( strategy = GenerationType.AUTO )
 private Long id;


 //-- Usuario
 @Column( name = "name")
 private String name;
 
 @Column( name ="lastName")
 private String lastName;
 
 @Column( name = "userName")
 private String userName;
 
 @Column( name = "email")
 private String email;
 
 @Column( name = "password")
 private String password;
 
 @Column( name = "birthdate")
 private LocalDate birthdate;
 
 @Column( name = "phone_number")
 private String phoneNumber;
 
 @ManyToOne
 @JoinColumn( name = "country_id") 
 private Country country;
 
 
 //-- Estado de cuenta
 @Column( name = "email_verified")
 private boolean emailVerified = false;
 
 @Column( name = "email_verified_at")
 private LocalDateTime emailVerifiedAt;
 
 @Column( name = "verification_token")
 private String verificationToken;
 
 
 //-- Auditoría
 @Column( name = "created_ip")
 private String createdIp;
 
 @Column( name = "created_at")
 private LocalDateTime createdAt;
 
@Column( name = "updated_at")
private LocalDateTime updatedAt;


//-- Estado de usuario
@Column( name = "banned", nullable = false)
private boolean banned = false;

@Column( name = "banned_at")
private LocalDateTime bannedAt;

@Column( name = "temporary_ban", nullable = false)
private boolean temporaryBan = false;

@Column( name = "temporary_ban_at")
private LocalDateTime temporaryBanAt;

@Column( name = "deleted")
private boolean deleted;

@Column( name = "deleted_at")
private LocalDateTime deletedAt;


//-- Seguridad
@Column( name = "reset_token")
private String resetToken;

@Column( name = "reset_token_expires")
private LocalDateTime resetTokenExpires;

@Column( name = "last_login_at")
private LocalDateTime lastLoginAt;

@Column( name = "present_login_ip")
private String presentLoginIp;

@Column( name = "present_login_ip_time")
private LocalDateTime presentLoginIpTime;

@Column( name = "last_login_ip")
private String lastLoginIp;

@Column( name = "last_login_ip_time")
private LocalDateTime lastLoginIpTime;

@Column( name = "failed_attempts")
private int failedAttempts = 0;

@Column( name = "locked_until")
private LocalDateTime locked_until; 


//-- Roles y privilegios
@Column( name = "role")
@Enumerated(EnumType.STRING)
private Role role;


//-- Monetización
@Column( name = "is_premium")
private boolean isPremium;

@Column( name = "premium_expires_at")
private LocalDateTime premiumExpiresAt;


//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------------// 


    //-- Usuario
  public Long getId(){
     return this.id;
 } 
 
  public String getName(){
     return this.name;
 }
 
  public String getLastName(){
     return this.lastName;
 }
  
  public String getUserName(){
     return this.userName;
 }
  
  public String getEmail(){
     return this.email;
 }
   
  public String getPassword(){
     return this.password;
 }
 
 public LocalDate getbirthdate(){
     return this.birthdate;
 }
 
 public String getPhoneNumber(){
     return this.phoneNumber;
 }
 
 public Country getCountry(){
     return this.country;
 }


    //-- Estado de cuenta
 public boolean getEmailVerified (boolean emailVerified ){
      return this.emailVerified = emailVerified;
 }

 public LocalDateTime getEmailVerifiedAt( LocalDateTime emailVerifiedAt ){
      return this.emailVerifiedAt ;
 }

 public String getVerificationToken( ) {
      return this.verificationToken;
 }


    //-- Auditoría
 public String getCreatedIp( String createdIp ){
      return this.createdIp = createdIp;
 }

 public LocalDateTime getCreatedAt(){
     return this.createdAt; 
 }

 public LocalDateTime getUpdatedAt(){
     return this.updatedAt; 
 }


    //-- Estado de usuario
 public Boolean isBanned(){
     return this.banned; 
 }

 public LocalDateTime isBannedAt(){
     return this.bannedAt;
 }
 
 public Boolean isTemporaryBan(){
     return this.temporaryBan; 
 }

 public LocalDateTime isTemporaryBanAt(){
     return this.temporaryBanAt;
 }

 public Boolean getDeleted(){
     return this.deleted;
 }

 public LocalDateTime getDeletedAt(){
     return this.deletedAt; 
 }


    //-- Seguridad
    public String getResetToken( ){
      return this.resetToken;
    }
 
 public Role getRole(){
     return this.role; 
 } 
 
 
//----------------------------------------------------------------------------- Setters------------------------------------------------------------------------------------------// 
  
 
  public void setName( String name ){
      this.name = name;
 }
 
  public void setLastName( String lastName){
     this.lastName = lastName;
 }
  
  public void setUserName( String userName ){
     this.userName = userName;
 }
  
  public void setEmail( String email){
      this.email = email;
 }
   
  public void setPassword( String password ){
    this.password = password;
 }
 
 public void setBirthdate( LocalDate birthdate ){
      this.birthdate = birthdate;
 }
 
  public void setPhoneNumber( String phoneNumber ){
     this.phoneNumber = phoneNumber;
 }
 
 public void setCountry( Country country){
      this.country = country;
 }
 
  public void setCreatedAt( LocalDateTime createdAt ){
     this.createdAt = createdAt; 
 }

 public void setUpdatedAt( LocalDateTime updatedAt ){
     this.updatedAt = updatedAt; 
 }

 public void setBanned( Boolean banned ){
     this.banned = banned; 
 }

 public void setBannedAt( LocalDateTime bannedAt ){
     this.bannedAt = bannedAt;
 }

 public void setDeleted( Boolean deleted ){ 
     this.deleted = deleted;
 }

 public void setDeletedAt( LocalDateTime deletedAt ){
     this.deletedAt = deletedAt; 
 } 
 
 public void setRole( Role role){
     this.role = role; 
 } 

 
}
