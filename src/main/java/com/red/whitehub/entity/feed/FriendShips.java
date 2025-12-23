/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.entity.feed;

import com.red.whitehub.entity.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table( name ="friendships" )
public class FriendShips {
    
    public FriendShips( ){
        
    }
    
    public enum Status {
        
        pending,
        accepted,
        blocked,
        deleted,
        best_friend
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="user_id", referencedColumnName = "id" )
    private User userId;
    
    @ManyToOne
    @JoinColumn( name ="friend_id", referencedColumnName = "id" )
    private User friendId;
    
    @Enumerated( EnumType.STRING)
    private Status status;
    
    @Column( name = "blocked_at" )
    private LocalDateTime blockedAt;
    
    @Column( name = "deleted_at" )
    private LocalDateTime deletedAt;
    
    @Column( name = "best_friend_at" )
    private LocalDateTime bestFriendAt;
    
    @Column( name = "created_at" )
    private LocalDateTime createdAt;
    
    
//--------------------------------------------------------------------------- Setters ---------------------------------------------------------------------------------------------    
    
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public void setFriendId(User friendId) {
        this.friendId = friendId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setBlockedAt(LocalDateTime blockedAt) {
        this.blockedAt = blockedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public void setBestFriendAt(LocalDateTime bestFriendAt) {
        this.bestFriendAt = bestFriendAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

//--------------------------------------------------------------------------- Getters -------------------------------------------------------------------------------------------    
    public Long getId() {
        return this.id;
    }

    public User getUserId() {
        return this.userId;
    }

    public User getFriendId() {
        return this.friendId;
    }

    public Status getStatus() {
        return this.status;
    }

    public LocalDateTime getBlockedAt() {
        return this.blockedAt;
    }

    public LocalDateTime getDeletedAt() {
        return this.deletedAt;
    }

    public LocalDateTime getBestFriendAt() {
        return this.bestFriendAt;
    }

    public LocalDateTime setCreatedAt() {
        return this.createdAt;
    }

}
