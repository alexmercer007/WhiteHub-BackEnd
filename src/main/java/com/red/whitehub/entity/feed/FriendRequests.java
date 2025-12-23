

package com.red.whitehub.entity.feed;

import com.red.whitehub.entity.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table( name = "friend_requests" )
public class FriendRequests {
    
    public FriendRequests(){
        
    }
    
    public enum Status {
        
        PENDING,
        ACCEPTED,
        REJECTED
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name = "sender_id", referencedColumnName = "id" )
    private User senderId;
    
    @ManyToOne
    @JoinColumn( name = "receiver_id", referencedColumnName = "id" )
    private User receiverId;
    
    @Enumerated( EnumType.STRING )
    private Status status;
    
    @Column( name = "created_at" )
    private LocalDateTime createdAt;
    
    @Column( name = "responded_at" )
    private LocalDateTime respondedAt;
    
    
//-------------------------------------------------------------------------- Setters ----------------------------------------------------------------------------------------------------    
     
   
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setSenderId( User senderId ){
        this.senderId = senderId;
    }
    
    public void setReceiverId( User receiverId ){
        this.receiverId = receiverId;
    }
    
    public void setStatus( Status status ){
        this.status = status;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    public void setRespondedAt( LocalDateTime respondedAt ){
        this.respondedAt = respondedAt;
    }
    
    
//-------------------------------------------------------------------------- Getters ----------------------------------------------------------------------------------------------------     
    
    
    public Long getId( ){
        return this.id;
    }
    
    public User getSenderId( ){
        return this.senderId;
    }
    
    public User getReceiverId( ){
        return this.receiverId;
    }
    
    public Status getStatus( ){
        return this.status;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }
    
    public LocalDateTime getRespondedAt( ){
        return this.respondedAt;
    }
    
}
