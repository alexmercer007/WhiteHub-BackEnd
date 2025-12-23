

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
@Table( name="posts")
public class Post {
    
    public Post(){
        
    }
    
    public enum Visibility {
        PUBLIC,
        PRIVATE,
        FRIEND,
        BEST_FRIENDS    
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO ) 
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="user_id", referencedColumnName="id" )
    private User user;
    
    @Column( name="content", nullable = false, columnDefinition = "TEXT")
    private String content;
    
    @Column( name="url_or_src" )
    private String urlOrSrc;
 
    @Enumerated(EnumType.STRING)
    @Column( name="visibility", nullable = false)
    private Visibility visibility;
    
    @Column( name="created_at", updatable = false )
    private LocalDateTime createdAt;
    
    @Column( name="update_at", updatable = false )
    private LocalDateTime upDateAt;
    
    
    
//----------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------------------// 
    
    
  
    public void setId( Long id ){
        this.id = id;
    } 
    
    public void setUser( User user ){
        this.user = user;
    }
    
    public void setContent( String content ){
        this.content = content;
    }
    
    public void setUrlOrSrc( String urlOrSrc ){
        this.urlOrSrc = urlOrSrc;
    }
    
    public void setVisibility( Visibility visibility ){
        this.visibility = visibility;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    public void setUpDateAt( LocalDateTime upDateAt ){
        this.upDateAt = upDateAt;
    }
    
    
    
//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------------// 
   
    
    
   public Long getId(  ){
        return this.id;
    } 
    
    public User getUser( ){
        return this.user;
    }
    
    public String getContent( ){
        return this.content;
    }
    
    public String getUrlOrSrc( ){
        return this.urlOrSrc;
    }
    
    public Visibility getVisibility( ){
        return this.visibility;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }   
    
    public LocalDateTime getUpDateAt( ){
        return this.upDateAt;
    }
    
    
}
