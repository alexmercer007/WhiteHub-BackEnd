
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
@Table( name ="municipalities" )
public class Municipalities {
    
    public Municipalities(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn(name ="state_id", referencedColumnName="id")
    private States states;
    
    @Column( name ="code")
    private String code;
    
    @Column( name ="name")
    private String name;
    
    @Column( name ="created_at")
    private LocalDateTime createdAt;
    
    
    
//------------------------------------------------------------------------------- Setters -------------------------------------------------------------------------------------------//    
    
    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setStateId( States stateId ){
        this.states = stateId;
    }
    
    public void setCode( String code ){
        this.code = code;
    }
    
    public void setName( String name ){
        this.name = name;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }

    
    
//------------------------------------------------------------------------------- Getters -------------------------------------------------------------------------------------------//    
    
    
    
    public Long getId( ){
        return this.id;
    }
    
    public States getStateId( ){
        return this.states;
    }
    
    public String getCode( ){
        return this.code;
    }
    
    public String getName( ){
        return this.name;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }  
        
}
