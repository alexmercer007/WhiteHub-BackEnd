

package com.red.whitehub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandro
 */

@Entity
@Table( name = "notifications")
public class Notifications {
    
    public Notifications(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name="user_id", referencedColumnName = "id")
    private User user;
    
    @ManyToOne
    @JoinColumn( name="actor_id", referencedColumnName = "id")
    private User userActor;
    
    @Column( name="notifications_type")
    private String notificationsType;
    
    @Column( name="entity_id")
    private Long entityId = null;
    
    @Column( name="is_read")
    private byte isRead = 0;
    
    @Column( name="created_at" )
    private LocalDateTime createdAt;
    
    
    
//------------------------------------------------------------------------- Setters -----------------------------------------------------------------------------------------//


    
  public void setId( Long id ){
      this.id = id;
  }          
            
  public void setUserId( User user ){
      this.user = user;
  }            
            
  public void setUserActorId( User userActor ){
      this.userActor = userActor;
  } 
  
  public void setId( String notificationsType ){
      this.notificationsType = notificationsType; 
  } 
  
  public void setEntityId( Long id ){
      this.entityId = id;
  } 
  
  public void setIsRead( byte isRead ){
      this.isRead = isRead;
  } 
  
  public void setCreatedAt( LocalDateTime createdAt ){
      this.createdAt = createdAt;
  } 
  
  
  
//------------------------------------------------------------------------- Setters -----------------------------------------------------------------------------------------//
   
  
  
  public Long getId( ){
      return this.id;
  }          
            
  public User getUserId( ){
      return this.user;
  }            
            
  public User getUserActorId( ){
      return this.userActor;
  } 
  
  public String getNotificationsType( ){
      return this.notificationsType; 
  } 
  
  public Long getEntityId( ){
      return this.entityId;
  } 
  
  public byte getIsRead( ){
      return this.isRead;
  } 
  
  public LocalDateTime getCreatedAt( ){
      return this.createdAt;
  } 
  
}
