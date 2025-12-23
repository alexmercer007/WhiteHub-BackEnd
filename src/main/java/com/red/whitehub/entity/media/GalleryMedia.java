
package com.red.whitehub.entity.media;

import com.red.whitehub.entity.media.Media;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandro
 */

@Entity
@Table( name = "gallery_media")
public class GalleryMedia {
    
    public GalleryMedia(){
        
    }
    
    @ManyToOne
    @JoinColumn( name = "gallery_id", referencedColumnName = "id" )
    private Gallery galleryId;
    
    @ManyToOne
    @JoinColumn( name = "media_id", referencedColumnName = "id" )
    private Media mediaId;
    
    @Column( name = "added_at" )
    private LocalDateTime addedAt;
    
    
//----------------------------------------------------------------------- Setters -------------------------------------------------------------------------------------------------    
    
    
    public void setGalleryId( Gallery galleryId ){
        this.galleryId = galleryId;
    }
    
    public void setMediaId( Media MediaId ){
        this.mediaId = mediaId;
    }
    
    public void setAddedAt( LocalDateTime addedAt ){
        this.addedAt = addedAt;
    }
    
    
//----------------------------------------------------------------------- Getters -------------------------------------------------------------------------------------------------      
    
    
  public Gallery getGalleryId( ){
        return this.galleryId;
    }
    
    public Media getMediaId( ){
        return this.mediaId;
    }
    
    public LocalDateTime getAddedAt( ){
        return this.addedAt; 
    }  
    
}
