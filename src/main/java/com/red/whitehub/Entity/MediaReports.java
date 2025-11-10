

package com.red.whitehub.Entity;

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
@Table(name ="media_repots")
public class MediaReports {
    
    public MediaReports(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name = "media_id", referencedColumnName ="id" )
    private Media media;
    
    @ManyToOne
    @JoinColumn( name = "user_id", referencedColumnName ="id" )
    private User user;
    
    @Column( name ="reason" )
    private String reason;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt;
    
    @Column( name ="resolved" )
    private String resolved;
    
    @Column( name ="resolved_at" )
    private LocalDateTime resolvedAt;
    
    
    
//----------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------------//    
    
    
    
    public void setId( Long id ){
         this.id = id;
     }   
    
    public void setMediaId( Media mediaId ){
        this.media = mediaId;
    }
    
    public void setUserId( User userId ){
        this.user = userId;
    }
    
    public void setReason( String reason ){
        this.reason = reason;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    public void setResolved( String resolved ){
        this.resolved = resolved;
    }
    
    public void setResolvedAt( LocalDateTime resolvedAt ){
        this.resolvedAt = resolvedAt;
    }
    
    
    
//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------//    
    
    
    
    public Long getId( ) {
        return this.id;
    }

    public Media getMediaId( ) {
        return this.media;
    }

    public User getUserId( ) {
        return this.user;
    }

    public String getReason( ) {
        return this.reason;
    }

    public LocalDateTime getCreatedAt( ) {
        return this.createdAt;
    }

    public String getResolved( ) {
        return this.resolved;
    }

    public LocalDateTime getResolvedAt( ) {
        return this.resolvedAt;
    }

    
}
