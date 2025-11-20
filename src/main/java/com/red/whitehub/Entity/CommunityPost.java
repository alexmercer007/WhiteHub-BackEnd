/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Table( name ="community_posts" )
public class CommunityPost {
    
    public CommunityPost( ){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="group_id", referencedColumnName = "id" )
    private Community communityId;
    
    @ManyToOne
    @JoinColumn( name ="user_id", referencedColumnName = "id" )
    private User userId;
    
    @Lob
    @Column( name ="content" )
    private String content;
    
    @JoinColumn( name ="media_url" )
    private String mediaUrl;
    
    @JoinColumn( name ="created_at" )
    private LocalDateTime createdAt;
    
    
//--------------------------------------------------------------------------- Setters ----------------------------------------------------------------------------------------    
    
    
    public void setId( Long id ){
        this.id =id;
    }
            
    public void setCommunityId( Community communityId ){
        this.communityId = communityId;
    }
    
    public void setUserId( User userId ){
        this.userId = userId;
    }
    
    public void setContent( String content ){
        this.content = content;
    }
    
    public void setMediaUrl( String mediaUrl ){
        this.mediaUrl = mediaUrl;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
        
    
//--------------------------------------------------------------------------- Getters ----------------------------------------------------------------------------------------       
    
    
    public Long getId( ){
        return this.id;
    }
            
    public Community getCommunityId( ){
        return this.communityId;
    }
    
    public User getUserId( ){
        return this.userId;
    }
    
    public String getContent( ){
        return this.content;
    }
    
    public String getMediaUrl( ){
        return this.mediaUrl;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }
    
    
    
    
    
    
    
    
    
        
}
