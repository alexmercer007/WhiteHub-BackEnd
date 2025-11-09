

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
@Table( name="message_file" )
public class MessageFile {
    
    public MessageFile(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id; 
    
    @ManyToOne
    @JoinColumn( name ="message_id" )
    private User userMessage;
    
    @Column( name ="file_url" )
    private String fileUrl;
    
    @Column( name ="file_type" )
    private String fileType;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt;
    
    
    
//------------------------------------------------------------------------- Setters --------------------------------------------------------------------------//

    
    
    public void setId( Long id ){
        this.id = id;
    }
    
    public void setUserMessageId( User userMessageId ){
        this.userMessage = userMessageId;
    }

    public void setFileUrl( String fileUrl ){
        this.fileUrl = fileUrl;
    }
    
    public void setFileType( String fileType ){
        this.fileType = fileType;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){ 
        this.createdAt = createdAt;
    }
    
    
    
//-------------------------------------------------------------------------- Getters -------------------------------------------------------------------------------//    
    
    
    
    public long setId( ){
        return this.id;
    }
    
    public User getUserMessageId( ){
        return this.userMessage;
    }

    public String getFileUrl( ){
        return this.fileUrl;
    }
    
    public String getFileType( ){
        return this.fileType;
    }
    
    public LocalDateTime getCreatedAt( ){ 
        return this.createdAt;
    }
  
}
