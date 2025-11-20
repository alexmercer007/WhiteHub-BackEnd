

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
@Table( name ="legal_info_access_log" )
public class LegalInfoAccessLog {
    
    public LegalInfoAccessLog(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="legal_info_id", referencedColumnName ="id" )
    private LegalInfo legalInfoId;
    
    @ManyToOne
    @JoinColumn( name ="actor_id", referencedColumnName ="id" )
    private User userId;
    
    @Column( name ="actor_role" )
    private String actorRole;
    
    @Column( name ="action" )
    private String action;
    
    @Column( name ="action_at" )
    private LocalDateTime actionAt;
    
    @Column( name ="ip_address" )
    private String ipAddress;
    
    @Column( name ="action_at" )
    private String reason;
    
    
    
//-------------------------------------------------------------------------------- Setters --------------------------------------------------------------------------------------------    
    
   
    public void setId( Long id ){
        this.id = id;        
    }
    
    public void setLegalInfo( LegalInfo legalInfoId ){
        this.legalInfoId = legalInfoId;        
    }
    
    public void setUserId( User userId ){
        this.userId = userId;        
    }
    
    public void setActorRole( String actorRole ){
        this.actorRole = actorRole;        
    }
    
    public void setAction( String action ){
        this.action = action;        
    }
    
    public void setId( LocalDateTime actionAt ){
        this.actionAt =actionAt;         
    }
    
    public void setIpAddress( String ipAddress ){
        this.ipAddress = ipAddress;        
    }
    
    public void setReason( String reason ){
        this.reason = reason;        
    }   
    
    
//-------------------------------------------------------------------------------- Getters -------------------------------------------------------------------------------------------    
    
    
    public Long  getId( ){
        return this.id;        
    }
    
    public LegalInfo getLegalInfoId( ){
        return this.legalInfoId;        
    }
    
    public User getUserId( ){
        return this.userId;        
    }
    
    public String getActorRole( ){
        return this.actorRole;        
    }
    
    public String getAction( ){
        return this.action;        
    }
    
    public LocalDateTime getActionAt(  ){
        return this.actionAt;         
    }
    
    public String getIpAddress( ){
        return this.ipAddress;        
    }
    
    public String getReason( ){
        return this.reason;        
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
