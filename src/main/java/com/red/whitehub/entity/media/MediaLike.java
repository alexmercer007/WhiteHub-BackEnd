

package com.red.whitehub.entity.media;

import com.red.whitehub.entity.feed.ReactionType;
import com.red.whitehub.entity.user.User;
import com.red.whitehub.entity.media.Media;
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
@Table( name ="media_likes" )
public class MediaLike {
    
    public MediaLike(){
        
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name = "media_id", referencedColumnName ="id" )
    private Media media;
    
    @ManyToOne
    @JoinColumn( name = "user_id", referencedColumnName ="id" )
    private User user;
    
    @ManyToOne
    @JoinColumn( name = "reaction_type_id", referencedColumnName ="id" )
    private ReactionType reactionType;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt;
    
    
    
//-------------------------------------------------------------------------- Setters --------------------------------------------------------------------------------//    
    
    
    
     public void setId( Long id ){
         this.id = id;
     }    
    
     public void setMediaId( Media mediaId ){
         this.media = mediaId;
     }
    
     public void setUserId(User userId ){
         this.user = userId;
     }
     
     public void setReactionTypeId( ReactionType reactionType ){
         this.reactionType = reactionType;
     }
    
     public void setCreatedAt( LocalDateTime createdAt ){
         this.createdAt = createdAt;
     }
    
    
    
    
    
    
    
    
    
    
}
