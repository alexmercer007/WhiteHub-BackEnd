/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.Entity;

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
@Table( name ="community_members" )
public class CommunityMembers {
    
    public CommunityMembers( ){
        
    }
    
    public enum Role  {
    
    ADMIN,
    MODERATOR,
    MEMBER
    
    }
    
    public enum States{
        
        ACTIVE,
        BANNED,
        LEFT
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="group_id", referencedColumnName = "id" )
    private Community communityId;
    
    @ManyToOne
    @JoinColumn( name ="user_id", referencedColumnName = "id" )
    private User userId;
    
    @Enumerated( EnumType.STRING )
    @Column( name = "role")
    private Role role;
    
    @Column( name = "joined_at")
    private LocalDateTime joinedAt;
    
    @Enumerated( EnumType.STRING )
    @Column( name = "status")
    private States status;
    
    
//---------------------------------------------------------------------------- Setters ---------------------------------------------------------------------------------------------    
    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setCommunity( Community communityId ){
        this.communityId = communityId;
    }
    
    public void setUserId( User userId ){
        this.userId = userId;
    }
    
    public void setRole( Role role ){
        this.role = role;
    }
    
    public void setJoinedAt( LocalDateTime joinedAt ){
        this.joinedAt = joinedAt;
    }
    
    public void setStatus( States status ){
        this.status = status;
    }
    
    
//---------------------------------------------------------------------------- Getters ---------------------------------------------------------------------------------------------      
    
    
    public Long getId( ){
        return this.id;
    }
    
    public Community getCommunity( ){
        return this.communityId;
    }
    
    public User getUserId( ){
        return this.userId;
    }
    
    public Role getRole( ){
        return this.role;
    }
    
    public LocalDateTime getJoinedAt( ){
        return this.joinedAt;
    }
    
   public States getStatus( ){
        return this.status;
    } 
    
    
    
    
    
    
}
