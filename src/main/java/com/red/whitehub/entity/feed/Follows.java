

package com.red.whitehub.entity.feed;

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
 * @author alejandro
 */

@Entity
@Table( name = "follows")
public class Follows {
    
    public Follows( ){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="follower_id", referencedColumnName ="id" )
    private User followerId;
    
    @ManyToOne
    @JoinColumn( name ="followed_id", referencedColumnName ="id" )
    private User followedId;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt;
    
    
//--------------------------------------------------------------------------- Setters --------------------------------------------------------------------------------------------    
    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setFollower( User followerId ){
        this.followedId = followerId;
    }
    
    public void setFollowedId( User followedId ){
        this.followedId = followedId;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    
//--------------------------------------------------------------------------- Getters --------------------------------------------------------------------------------------------   
    
    
    public Long getId( ){
        return this.id;
    }
    
   public User getFollowerId( ){
        return this.followedId;
    }
   
   public User getFollowedId( ){
        return this.followedId;
    }
   
   public LocalDateTime setCreatedAt( ){
        return this.createdAt;
    } 
    
}
