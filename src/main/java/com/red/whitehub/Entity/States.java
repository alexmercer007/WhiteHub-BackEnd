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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandro
 */
@Entity
@Table(name="states")
public class States {
    
    public States(){
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    
    // Relación con la entidad Country
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;
    
    @Column(name="code")
    private String code;
    
    @Column(name="name")
    private String name;
    
    @Column(name="created_at")
    private LocalDateTime created_at;
    
    
    
//--------------------------------------------------------------------------------------- Setters-------------------------------------------------------------------------------------------//    
    
    
    
    public void setId( Long Id){     
        this.Id = Id;      
    }
    
    public void setCountry( Country country){
      this.country = country;  
    }
    
    public void setCode( String code ){
        this.code = code;
    }
    
    public void setName( String name ){
        this.name = name;
    }
    
    public void setCreatedAt( LocalDateTime created_at ){
        this.created_at = created_at;
    }

    
    
//------------------------------------------------------------------------------------------ Getters ----------------------------------------------------------------------------------------// 
    
    
    
    public Long getId(){
        return this.Id;
    }
    
    public Country getCountry(){
        return this.country;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public String setName(){
       return this.name;  
    }
    
    public LocalDateTime getCreated_At(){
        return this.created_at;
    }
  
}
