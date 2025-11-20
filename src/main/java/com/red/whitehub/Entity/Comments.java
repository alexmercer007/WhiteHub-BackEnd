

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
@Table( name ="comments" )
public class Comments {
    
    public Comments( ){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="post_it", referencedColumnName = "id" )
    private Post postId;
    
    @ManyToOne
    @JoinColumn( name ="user_it", referencedColumnName = "id" )
    private User userId;
    
    @Lob
    @Column( name ="content" )
    private String content;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt;
    
    
    
//---------------------------------------------------------------------------- Setters -------------------------------------------------------------------------------------    
   
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setPostId( Post postId ){
        this.postId = postId;
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
 
    
//---------------------------------------------------------------------------- Getters -------------------------------------------------------------------------------------      
 
    
    public Long getId( ){
        return this.id;
    }
    
    public Post getPostId( ){
        return this.postId;
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
