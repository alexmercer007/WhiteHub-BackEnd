/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.entity.feed;

import com.red.whitehub.entity.feed.ReactionType;
import com.red.whitehub.entity.user.User;
import com.red.whitehub.entity.feed.Post;
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
@Table(name="reactions")
public class Reactions {
    
    public Reactions(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="post_id", referencedColumnName="id")
    private Post post;
    
    @ManyToOne
    @JoinColumn( name ="user_id", referencedColumnName="id")
    private User user;
    
    @ManyToOne
    @JoinColumn( name ="reaction_type_id", referencedColumnName="id")
    private ReactionType reactionType;
    
    @Column( name ="created_at")
    private LocalDateTime created_at;
    
    
    
//--------------------------------------------------------------------------------------- Setters-------------------------------------------------------------------------------------------//       
  
    
    
    public void setId(Long id){
        this.id = id;
    }
    
    public void setPost(Post post){
        this.post = post;
    }
    
    public void setUser( User user ){
        this.user = user;
    }
    
    public void setReactionType(ReactionType reactionType){
        this.reactionType = reactionType;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.created_at = createdAt;
    }
    
    
    
//--------------------------------------------------------------------------------------- Getters-------------------------------------------------------------------------------------------//        
    
    
    
    public Long getId(){
        return this.id;
    }
    
    public Post getPost(){
        return this.post;
    }
    
    public User getUser(){
        return this.user;
    }
    
    public ReactionType getReactionType(){
        return this.reactionType;
    }
    
    public LocalDateTime getCreatedAt() {
        return this.created_at;
    }
    
}
