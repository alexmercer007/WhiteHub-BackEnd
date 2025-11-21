

package com.red.whitehub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table( name = "gallery")
public class Gallery {
    
    public Gallery(){
        
    }
    
    public enum FileType {
        
        IMAGE,
        VIDEO,
        AUDIO,
        DOCUMENT
    }
    
    public enum Visibility {

        PUBLIC,
        PRIVATE,
        FRIENDS_ONLY
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name = "media_id", referencedColumnName ="id" )
    private Media mediaId;
    
    @Column( name = "cover_media_id" )
    private Long coverMediaId;
    
    @Column( name = "file_url_or_src" )
    private String fileUrlOrSrc;
    
    @Enumerated( EnumType.STRING )
    @Column( name = "file_type" )
    private FileType fileType;
    
    @Column( name = "title" )
    private String title;
    
    @Lob
    @Column( name = "description" )
    private String description;
    
    @Enumerated( EnumType.STRING )
    @Column( name = "visibility" )
    private Visibility visibility;
    
    @Column( name = "created_at" )
    private LocalDateTime createdAt;
    
    @Column( name = "updated_at" )
    private LocalDateTime upDatedAt;
    
    
//------------------------------------------------------------------------ Setters ------------------------------------------------------------------------------------------------------ 
    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setMediaId( Media mediaId ){
        this.mediaId = mediaId;
    }
    
    public void setCoverMediaId( Long coverMediaId ){
        this.coverMediaId = coverMediaId;
    }
    
    public void setFileUrlOrSrc( String fileUrlOrSrc ){
        this.fileUrlOrSrc = fileUrlOrSrc;
    }
    
    public void setFileType( FileType fileType ){
        this.fileType = fileType;
    }
    
    public void setTitle( String title ){
        this.title = title;
    }
    
    public void setDescription( String description ){
        this.description = description;
    }
    
    public void setVisibility( Visibility visibility ){
        this.visibility = visibility;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    public void setUpDatedAt( LocalDateTime upDatedAt ){
        this.upDatedAt = upDatedAt;
    }
    
    
//------------------------------------------------------------------------ Getters ------------------------------------------------------------------------------------------------------     
    
    
    public Long getId( ){
        return this.id;
    }
    
    public Media getMediaId( ){
        return this.mediaId;
    }
    
    public Long getCoverMediaId( ){
        return this.coverMediaId;
    }
    
     public String getFileUrlOrSrc( ){
        return this.fileUrlOrSrc;
    }
    
    public FileType getFileType( ){
        return this.fileType;
    }
    
    public String getTitle( ){
        return this.title;
    }
    
    public String getDescription( ){
        return this.description;
    }
    
    public Visibility getVisibility( ){
        return this.visibility;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt; 
    }
    
    public LocalDateTime getUpDatedAt( ){
        return this.upDatedAt; 
    }
    
}
