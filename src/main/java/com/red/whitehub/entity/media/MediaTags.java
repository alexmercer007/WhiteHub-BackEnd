

package com.red.whitehub.entity.media;

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
@Table( name ="media_tags" )
public class MediaTags {
    
    public MediaTags(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name = "media_id", referencedColumnName="id" )
    private Media media;
    
    @Column( name ="tag")
    private String tag;
    
    @Column( name = "created_at")
    private LocalDateTime createdAt;
    
    
    
//--------------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------------//    
    
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setMediaId(Media media) {
        this.media = media;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
  
 
 
//--------------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------// 
   
    
    
    public Long getId( ) {
        return this.id;
    }

    public Media getMediaId( ) {
        return this.media;
    }

    public String getTag( ) {
        return this.tag;
    }

    public LocalDateTime getCreatedAt( ) {
        return this.createdAt;
    }
    
    
}
