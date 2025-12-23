
package com.red.whitehub.entity.location;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author aleja
 */

@Entity
@Table( name = "countries")
public class Country {
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO) 
    private Long id;
    
    @Column( name = "name")
    private String name;
    
    
//----------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------------------// 
    
    
    public void setName( String name){
        this.name = name;    
    }
    
    
//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------------//     
    
    
    public Long getid( ){
        return this.id;    
    }
    
    public String getName( ){
        return this.name;    
    }
     
    
}
