
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
 * @author aleja
 */

@Entity
@Table( name ="archived_user")
public class ArchivedUser {
    
    public ArchivedUser( ){
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "original_user_id", referencedColumnName = "id")
    private User originalUser;

    @Column(name = "archived_at")
    private LocalDateTime archivedAt;

    @Column(name = "archived_by")
    private String archivedBy;

    @Column(name = "reason")
    private String reason;

    @Column(name = "snapshot", columnDefinition = "JSON")
    private String snapshot;

    @Column(name = "retention_expires_at")
    private LocalDateTime retentionExpiresAt;

    @Column( name ="legal_hold" )
    private short legalHold;    
    
    @Column( name ="access_count" )
    private int accessCount;
    
    @Column( name ="last_access_at" )
    private LocalDateTime lastAccessAt;
    
    
    
//--------------------------------------------------------------------------- Setters -----------------------------------------------------------------------------//



    public void setId( long id ){
        this.id = id;
    }
    
    public void setOriginalUserId( User originalUserId ){
        this.originalUser = originalUserId;
    }

    public void setArchivedAt( LocalDateTime archivedAt ){
        this.archivedAt = archivedAt;
    }
    
    public void setArchivedBy( String archivedBy ){
        this.archivedBy = archivedBy;
    }

    public void setReason( String reason ){
        this.reason = reason;
    }
   
    public void setSnapshot( String snapshot ){
        this.snapshot = snapshot;
    }
            
    public void setRetentionExpiresAt( LocalDateTime retentionExpiresAt  ){
        this.retentionExpiresAt = retentionExpiresAt;
    }
 
    public void setLegalHold( short legalHold ){
        this.legalHold = legalHold;
    }

    public void setAccessCount( int accessCount ){
        this.accessCount = accessCount;
    }
    
    public void setLastAccessAt( LocalDateTime lastAccessAt ){
        this.lastAccessAt = lastAccessAt;
    }

    

//--------------------------------------------------------------------------- Getters -----------------------------------------------------------------------------//

    
 
    public Long getId( ){
        return this.id;
    }
    
    public User getOriginalUserId( ){
        return this.originalUser;
    }

    public LocalDateTime getArchivedAt( ){
        return this.archivedAt;
    }
    
    public String getArchivedBy( ){
        return this.archivedBy;
    }

    public String getReason( ){
        return this.reason;
    }
   
    public String getSnapshot( ){
        return this.snapshot;
    }
            
    public LocalDateTime getRetentionExpiresAt( ){
        return this.retentionExpiresAt;
    }
 
    public short getLegalHold( ){
        return this.legalHold;
    }

    public int getAccessCount(){
        return this.accessCount;
    }
    
    public LocalDateTime getLastAccessAt( ){
        return this.lastAccessAt;
    }   
    
}
