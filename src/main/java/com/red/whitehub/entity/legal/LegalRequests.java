

package com.red.whitehub.entity.legal;

import com.red.whitehub.entity.archive.ArchivedUser;
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
@Table( name="legal_requests" )
public class LegalRequests {
    
    public LegalRequests (){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="archived_user_id", referencedColumnName ="id" )
    private ArchivedUser archivedUserId;
    
    @Column( name ="requested_by" )
    private String requestedBy;
    
    @Column( name ="request_date" )
    private LocalDateTime requestDate;
    
    @Column( name ="request_document" )
    private String requestDocument;
    
    @Column( name ="granted" )
    private short granted;
    
    @Column( name ="accessed_by" )
    private String accessedBy;
    
    @Column( name ="accessed_at" )
    private LocalDateTime accessedAt;
    
    @Lob
    @Column( name ="requested_by" )
    private String notes;
    
    
//-------------------------------------------------------------------------------- Setters --------------------------------------------------------------------------------------------      
    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setArchivedId( ArchivedUser archivedUserId ){
        this.archivedUserId = archivedUserId;
    }
    
    public void setRequestBy( String requestedBy ){
        this.requestedBy = requestedBy;
    }
    
    public void setRequestDate( LocalDateTime requestDate ){
        this.requestDate = requestDate;
    }
    
    public void setRequestDocument( String requestDocument ){
        this.requestDocument = requestDocument;
    }
    
    public void setGranted( short granted ){
        this.granted = granted;
    }
    
    public void setAccessedBy( String accessedBy ){
        this.accessedBy = accessedBy;
    }
    
    public void setAccessedAt( LocalDateTime accessedAt ){
        this.accessedAt = accessedAt;
    }
    
    public void setNotes( String notes ){
        this.notes = notes;
    }
    
    
//-------------------------------------------------------------------------------- Getters --------------------------------------------------------------------------------------------      
    
    
    public Long getId( ){
        return this.id;
    }
    
    public ArchivedUser getArchivedId( ){
        return this.archivedUserId;
    }
    
    public String getRequestBy( ){
        return this.requestedBy;
    }
    
    public LocalDateTime getRequestDate(  ){
        return this.requestDate;
    }
    
    public String getRequestDocument( ){
        return this.requestDocument;
    }
    
    public short getGranted( ){
        return this.granted;
    }
    
    public String getAccessedBy( ){
        return this.accessedBy;
    }
    
    public LocalDateTime getAccessedAt( ){
        return this.accessedAt;
    }
    
    public String getNotes( ){
        return this.notes;
    }
    
    
}
