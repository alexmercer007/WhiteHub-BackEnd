

package com.red.whitehub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandro
 */

@Entity
@Table( name ="community_comments" )
public class CommunityComments {
    
    public CommunityComments( ){
        
    }
            
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @ManyToOne
    @JoinColumn( name ="group_post_id", referencedColumnName = "id" )
    private CommunityPost communityPostId;
    
    @ManyToOne
    @JoinColumn( name ="user_id", referencedColumnName = "id" )
    private User userId;
    
    @Lob
    @Column( name ="content" )
    private String content;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt; 
    
    
//------------------------------------------------------------------------------- Setters --------------------------------------------------------------------------------------    
    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setCommunityPost( CommunityPost communityPostId ){
        this.communityPostId = communityPostId;
    }
    
    public void setUserId( User userId ){
        this.userId = userId;
    }
    
    public void setContent( String content ){
        this.content = content;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    
//------------------------------------------------------------------------------- Getters --------------------------------------------------------------------------------------    
    
    
    public Long getId( ){
        return this.id;
    }
    
    public CommunityPost getCommunityPost( ){
        return this.communityPostId;
    }
    
    public User getUserId( ){
        return this.userId;
    }
    
    public String getContent( ){
        return this.content;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }
      
    
}
