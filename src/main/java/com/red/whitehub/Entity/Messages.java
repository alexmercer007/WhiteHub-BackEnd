

package com.red.whitehub.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author alejandro
 */

@Entity
@Table( name = "messages" )
public class Messages {
    
    public Messages(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name ="sender_id", referencedColumnName="id" )
    private User userSender;
    
    @ManyToOne
    @JoinColumn( name ="receiver_id", referencedColumnName="id" )
    private User userReceiver;
    
    @Lob
    @Column( name ="content" )
    private String context;
    
    @Column( name = "is_read")
    private short isRead = 0;
    
    @Column( name = "deleted")
    private short deleted = 0;
    
    @Column( name="created_at" )
    private LocalDateTime createdAt;
    


//-------------------------------------------------------------------------------- Setters ------------------------------------------------------------------------------------//



public void setId( Long id ){
    this.id = id;
}

public void setUserSender( User userId ){
    this.userSender = userId;
}

public void setUserReceiver( User userId ){
    this.userReceiver = userId;
}
        
public void setContent( String content ){
    this.context = content;
}

public void setIsRead( short isRead ){
    this.isRead = isRead;
}

public void setDeleted( short deleted ){
    this.deleted = deleted;
}

public void setCreatedAt( LocalDateTime createdAt ){
    this.createdAt = createdAt;
}



//-------------------------------------------------------------------------------- Getters ------------------------------------------------------------------------------------//


    public Long getId( ) {
        return this.id;
    }

    public User getUserSender( ) {
        return this.userSender;
    }

    public User getUserReceiver( ) {
        return this.userReceiver;
    }

    public String getContent( ) {
        return this.context;
    }

    public short getIsRead( ) {
        return this.isRead;
    }

    public short getDeleted( ) {
        return this.deleted;
    }

    public LocalDateTime getCreatedAt( ) {
        return this.createdAt; 
    }

    
}
