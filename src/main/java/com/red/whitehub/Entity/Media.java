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
@Table( name="media" )
public class Media {
    
    public Media(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name="user_id", referencedColumnName ="id"  )
    private User user;
    
    @Column( name ="file_url_or_src")
    private String file;
    
    @Lob
    @Column( name ="content", columnDefinition = "TEXT")
    private String content;
    
    @Lob
    @Column(name = "metadata", columnDefinition = "json")
    private String metadataJson; // Aquí guardas tu JSON como texto
    
    @Column( name="is_public" )
    private short isPublic = 0;
    
    @Column( name = "created_at" )
    private LocalDateTime createdAt;
    
    @Column( name = "updated_at" )
    private LocalDateTime updatedAt;
    
    
    
//---------------------------------------------------------------------------- Setters ---------------------------------------------------------------------------//



    public void setId( Long id ){
        this.id = id;
    }    
    
    public void setUserId( User userId ){
        this.user = userId;
    }
    
    public void setFileUrlOrSrc( String file ){
        this.file = file;
    }
    
    public void setContent( String content ){
        this.content = content;
    }
    
    public void setMetadata( String metadataJson ){
        this.metadataJson = metadataJson;
    }
    
    public void setIsPublic( short isPublic ){
        this.isPublic = isPublic;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    public void setUpDatedAt( LocalDateTime updateAt ){
        this.updatedAt = updateAt;
    }
    
    
    
//--------------------------------------------------------------------------------- Getters -----------------------------------------------------------------------------//    
    
    
    
    public Long getId( ){
        return this.id;
    }    
    
    public User getUserId( ){
        return this.user;
    }
    
    public String getFileUrlOrSrc( ){
        return this.file;
    }
    
    public String getContent( ){
        return this.content;
    }
    
    public String getMetadata( ){
        return this.metadataJson;
    }
    
    public short getIsPublic( ){
        return this.isPublic;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }
    
    public LocalDateTime setUpDatedAt( ){
        return this.updatedAt;
    }   
    
    
}
