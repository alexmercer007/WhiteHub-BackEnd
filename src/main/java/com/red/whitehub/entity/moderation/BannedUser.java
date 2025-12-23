
package com.red.whitehub.entity.moderation;

import com.red.whitehub.entity.user.User;
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
 * @author aleja
 */

@Entity
@Table( name="banned_user")
public class BannedUser {
    
    public BannedUser(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    public Long id;
    
    @ManyToOne
    @JoinColumn( name ="user_id", referencedColumnName ="id" )
    private User userId;
    
    @Column( name="reason")
    private String reason;
    
    @Column( name = "banned_at" )
    private LocalDateTime bannedAt;
    
    
    
//------------------------------------------------------------------------------- Setters ---------------------------------------------------------------------------//    
    
    
    
    public void setId( Long id ){
        this.id = id;
    } 
    
    public void setUserId( User userId ){
        this.userId = userId;
    }
    
    public void setReason( String reason ){
        this.reason= reason;
    }
    
    public void setBannedAt( LocalDateTime bannedAt ){
        this.bannedAt = bannedAt;
    }
    
    
    
//------------------------------------------------------------------------------- Getters ---------------------------------------------------------------------------//      
    
    
    
    public Long getId( ){
        return this.id;
    } 
    
    public User getUserId( ){
        return this.userId;
    }
    
    public String getReason( ){
        return this.reason;
    }
    
    public LocalDateTime setBannedAt( ){
        return this.bannedAt;
    }
    
}
