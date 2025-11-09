

package com.red.whitehub.Entity;

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
@Table( name="post_posibility")
public class PostPosibility {
    
    public PostPosibility(){
        
    }
    
    public enum AccessType {
        ALLOW,
        DENY
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name="post_id", referencedColumnName ="id")
    private Post post;
    
    @ManyToOne
    @JoinColumn( name="viewer_id", referencedColumnName ="id")
    private User user;
    
    @Enumerated( EnumType.STRING)
    @Column( name="access_type" )
    private AccessType accessType;
      
    @Column( name="created_at" )
    private LocalDateTime createdAt;
    
    

//----------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------//    
    
 
   
    public void setId( Long id){
        this.id = id;
    }
    
    public void setPostId( Post post ){
        this.post = post;
    }
    
    public void setViewerId( User user){
        this.user = user;
    }
    
    public void setAccessType( AccessType accessType){
        this.accessType = accessType;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    
    
//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------//     
    
   
    
    public Long getId( ){
        return this.id;
    }
    
    public Post getPostId( ){
       return this.post;
    }
    
    public User getViewerId( ){
        return this.user;
    }
    
    public AccessType getAccessType(){
        return this.accessType;
    }
    
    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }
    
}
