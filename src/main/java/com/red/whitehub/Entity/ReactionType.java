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
import jakarta.persistence.Table;

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
    private String createdAt;
    
    
    
    
    
    
    
    
    
}
