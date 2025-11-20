

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
@Table( name = "community" )
public class Community {
    
    public Community( ){
        
    }
    
    public enum Visibility {
        
        PUBLIC,
        CLOSED,
        PRIVATE
        
    }
    
    public enum JoinPolicy {
        
        OPEN,
        REQUEST,
        INVITE_ONL
        
    }
    
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @Column( name ="name" )
    private String name;
    
    @Column( name ="slug" )
    private String slug;
    
    @Lob
    @Column( name ="description" )
    private String description;
    
    @Column( name ="cover_image_url" )
    private String coverImageUrl;
    
    @Column( name ="icon_url" )
    private String iconUrl;
    
    @ManyToOne
    @JoinColumn( name ="created_by", referencedColumnName = "id" )
    private User userId;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt; 
    
    @Column( name ="updated_at" ) 
    private LocalDateTime upDatedAt; 
    
    
//----------------------------------------------------------------------------- Setters -------------------------------------------------------------------------------------    
    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setName( String name ){
        this.name = name;
    }
    
    public void setSlug( String slug ){
        this.slug = slug;
    }
    
    public void setDescription( String description ){
        this.description = description;
    }
    
    public void setCoverImageUrl( String coverImageUrl ){
        this.coverImageUrl = coverImageUrl;
    }
    
    public void setIconUrl( String iconUrl ){
        this.iconUrl = iconUrl;
    }
    
    public void setUserId( User userId ){
        this.userId = userId;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    public void setUserId( LocalDateTime upDatedAt ){
        this.upDatedAt = upDatedAt;
    }
    
    
    
//----------------------------------------------------------------------------- Getters -------------------------------------------------------------------------------------     
    
 
    public Long getId( ){
        return this.id;
    }
    
    public String getName( ){
        return this.name;
    }
    
    public String getSlug( ){
        return this.slug ;
    }
    
    public String getDescription( ){
        return this.description;
    }
    
    public String getCoverImageUrl( ){
        return this.coverImageUrl;
    }
    
    public String getIconUrl( ){
        return this.iconUrl;
    }
    
    public User getUserId( ){
        return this.userId;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }
    
    public LocalDateTime getUpDateAt( ){
        return this.upDatedAt; 
    }  
    
    
}
