/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.entity.feed;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandro
 */
@Entity
@Table( name="reaction_type")
public class ReactionType {
    
    public ReactionType(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    
    @Column( name="code")
    private String code;
    
    @Column( name="name")
    private String name;
    
    @Column( name="icon")
    private String icon;
    
    @Column( name="created_at")
    private LocalDateTime createdAt;
    
    
    
//----------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------------------// 

    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setCode( String code ){
        this.code = code;
    }
    
    public void setName( String name ){
        this.name = name;
    }
    
    public void setIcon( String icon ){
        this.icon = icon;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){ 
        this.createdAt = createdAt;
    }
    

//----------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------------//     
    
    
    public Long getId(){
        return this.id;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public String getName( ){
        return this.name;
    }
    
    public String getIcon(){
        return this.icon;
    }
    
    public LocalDateTime setCreatedAt( ){ 
        return this.createdAt; 
    }
    
    
}
