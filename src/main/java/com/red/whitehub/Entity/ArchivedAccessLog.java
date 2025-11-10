

package com.red.whitehub.Entity;

import jakarta.persistence.Column;
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

@Table( name ="archived_access_log" )
public class ArchivedAccessLog {
    
    public ArchivedAccessLog(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="archived_user_id", referencedColumnName ="id" )
    private ArchivedUser archivedUserId;
    
    @Column( name = "actor" )
    private String actor;
    
    @Column( name = "action" )
    private String action;
    
    @Column( name = "action_at" )
    private LocalDateTime actionAt;
    
    @Column( name = "ip_address" )
    private String ipAddress;
    
    @Column( name = "reason" )
    private String reason;
    
    
    
//---------------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------//


    
  public void setId( Long id ){
      this.id = id;
  }  
  
  public void setArchivedUserid( ArchivedUser archivedUserId ){
      this.archivedUserId = archivedUserId;
  }

 public void setActor( String actor ){
     this.actor = actor;
 }

 public void setAction( String action ){
     this.action = action;
 }
 
 public void setActionAt( LocalDateTime actionAt ){
     this.actionAt = actionAt;
 }
 
 public void setIpAddress( String ipAddress ){
     this.ipAddress = ipAddress;
 }
 
 public void setReason( String reason ){
     this.reason = reason;
 }

 

//---------------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------//



  public Long getId( ){
      return this.id;
  }  
  
  public ArchivedUser getArchivedUserid( ){
      return this.archivedUserId;
  }

 public String getActor( ){
     return this.actor;
 }

 public String getAction( ){
     return this.action;
 }
 
 public LocalDateTime getActionAt( ){
     return this.actionAt;
 }
 
 public String getIpAddress( ){
     return this.ipAddress;
 }
 
 public String getReason( ){
     return this.reason;
 }
    
}
