

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
@Table( name ="" )
public class LegalInfo {
    
    public LegalInfo( ){
        
    }
    
    public enum Visibility{
        
        PRIVATE,
        FRIENDS,
        BEST_FRIENDS,
        PUBLIC
        
    }
    
    public enum MaritalStates{
        
        single,
        IN_RELATIONSHIP,
        married,
        widower,
        DIVORCED  
    
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    
    @ManyToOne
    @JoinColumn( name = "user_id", referencedColumnName ="id" )
    private User userId;
    
    @Enumerated( EnumType.STRING ) 
    @Column( name ="visibility" )
    private Visibility visibility;
    
    @Column( name ="full_name" )
    private String fullName;
    
    @Column( name ="profession" )
    private String profession;
    
    @Column( name ="specialty" )
    private String specialty;
    
    @Enumerated( EnumType.STRING ) 
    @Column( name ="marital_states" )
    private MaritalStates maritalStates;
    
    @Column( name ="birth_place" )
    private String birthPlace;
    
    @Column( name ="address_line1" )
    private String addressLine1;
    
    @Column( name ="address_line2" )
    private String addressLine2;
    
    @Column( name ="postal_code" )
    private String postalCode;
    
    @ManyToOne
    @JoinColumn( name ="country_id", referencedColumnName ="id" )
    private Country countryId;
    
    @ManyToOne
    @JoinColumn( name ="states_id", referencedColumnName ="id" )
    private States statesId;
    
    @ManyToOne
    @JoinColumn( name ="municipality_id", referencedColumnName ="id" )
    private Municipalities municipalitiesId;
    
    @Column( name ="phone_private" )
    private String phonePrivate;
    
    @Column( name ="email_private" )
    private String emailPrivate;
    
    @Column( name ="hobby", columnDefinition="TEXT" )
    private String hobby;
    
    @Column( name ="interests", columnDefinition="TEXT"  )
    private String interest;
    
    @Column( name ="bio", columnDefinition="TEXT"  )
    private String biography;
    
    @Column( name ="website_url" )
    private String websiteUrl;
    
    @Column( name ="linkedin_url" )
    private String linkedinUrl;
    
    @Column( name ="github_url" )
    private String githubUrl;
    
    @Column( name ="portfolio_url" )
    private String portfolioUrl;
    
    @Column( name ="extra", columnDefinition="JSON"  )
    private String extra;
    
    @Column( name ="legal_hold" )
    private short legalHold = 0;
    
    @Column( name ="verified" )
    private short verified = 0;
    
    @Column( name ="verified_at" )
    private LocalDateTime verifiedAt;
    
    @Column( name ="created_at" )
    private LocalDateTime createdAt;
    
    @Column( name ="updated_at" )
    private LocalDateTime updatedAt;
    
    
    
//---------------------------------------------------------------------------- Setters -------------------------------------------------------------------------------//
    
    
    
    public void setId( Long id ){
         this.id = id;
     }
    
    public void setUserId( User userId ){
        this.userId = userId;
    } 
    
    public void setVisibility( Visibility visibility ){
        this.visibility = visibility;
    }
    
    public void setFullName( String fullName ){
        this.fullName = fullName;
    }
    
    public void setProfession( String profession ){
        this.profession = profession;
    }
    
    public void setSpecialty( String specialty ){
        this.specialty = specialty;
    }
    
    public void setMaritalStates( MaritalStates maritalStates){
        this.maritalStates = maritalStates;
    }
    
    public void setBirthPlace( String birthPlace ){
        this.birthPlace = birthPlace;
    }
    
    public void setAddressline1( String addressLine1 ){
        this.addressLine1 = addressLine1;
    }
    
    public void setAddressline2( String addressLine2 ){
        this.addressLine2 = addressLine2;
    }
    
    public void setPostalCode( String postalCode ){
        this.postalCode = postalCode;
    }
    
    public void setCountryId( Country countryId ){
        this.countryId = countryId;
    }
    
    public void setStateId( States stateId ){
        this.statesId = stateId;
    }
    
    public void setMunicipalityId( Municipalities municipalityId ){
        this.municipalitiesId = municipalityId;
    }
    
    public void setPhonePrivate( String phonePrivate ){
        this.phonePrivate = phonePrivate;
    }
    
    public void setEmailPrivate( String emailPrivate ){
        this.emailPrivate = emailPrivate;
    }
    
    public void setHobby( String hobby ){
        this.hobby = hobby;
    }
    
    public void setInterest( String interest ){
        this.interest = interest;
    }
    
    public void setBiography( String biography ){
        this.biography = biography;
    }
    
    public void setWebSiteUrl( String webSiteUrl ){
        this.websiteUrl = webSiteUrl;
    }
    
    public void setLinkedinUrl( String linkedinUrl ){
        this.linkedinUrl = linkedinUrl;
    }
    
    public void setGithubUrl( String githubUrl ){
        this.githubUrl = githubUrl;
    }
    
    public void setPortfolioUrl( String portfolioUrl ){
        this.portfolioUrl= portfolioUrl;
    }
    
    public void setExtra( String extra ){
        this.extra = extra;
    }
    
    public void setLegalHold( short legalHold ){
        this.legalHold = legalHold;
    }
    
    public void setVerified( short verified ){
        this.verified = verified;
    }
    
    public void setVerifiedAt( LocalDateTime verifiedAt ){
        this.verifiedAt = verifiedAt;
    }
    
    public void setCreatedAt( LocalDateTime createdAt ){
        this.createdAt = createdAt;
    }
    
    public void setUpdatedAt( LocalDateTime updatedAt ){
        this.updatedAt = updatedAt;
    }
       
       
    
//---------------------------------------------------------------------------- Getters -------------------------------------------------------------------------------//   
    
    
    
    public Long getId(){
         return this.id;
     }
    
    public User getUserId( ){
        return this.userId;
    } 
    
    public Visibility getVisibility( ){
        return this.visibility;
    }
    
    public String setFullName( ){
        return this.fullName;
    }
    
    public String getProfession( ){
        return this.profession;
    }
    
    public String getSpecialty( ){
        return this.specialty; 
    }
    
    public MaritalStates getMaritalStates( ){
        return this.maritalStates;
    }
    
    public String getBirthPlace( ){
        return this.birthPlace;
    }
    
    public String getAddressline1( ){
        return this.addressLine1;
    }
    
    public String getAddressline2( ){
        return this.addressLine2;
    }
    
    public String getPostalCode( ){
        return this.postalCode;
    }
    
    public Country setCountryId( ){
        return this.countryId;
    }
    
    public States getStateId( ){
        return this.statesId; 
    }
    
    public Municipalities getMunicipalityId( ){
        return this.municipalitiesId;
    }
    
    public String getPhonePrivate( ){
        return this.phonePrivate;
    }
    
    public String getEmailPrivate( ){
        return this.emailPrivate;
    }
    
    public String getHobby( ){
        return this.hobby;
    }
    
    public String getInterest( ){
        return this.interest;
    }
    
    public String getBiography( ){
        return this.biography;
    }
    
    public String getWebSiteUrl( ){
        return this.websiteUrl;
    }
    
    public String getLinkedinUrl( ){
        return this.linkedinUrl;
    }
    
    public String getGithubUrl( ){
        return this.githubUrl;
    }
    
    public String getPortfolioUrl( ){
        return this.portfolioUrl; 
    }
    
    public String getExtra( ){
        return this.extra;
    }
    
    public short getLegalHold( ){
        return this.legalHold;
    }
    
    public short getVerified( ){
        return this.verified;
    }
    
    public LocalDateTime getVerifiedAt( ){
        return this.verifiedAt;
    }
    
    public LocalDateTime getCreatedAt( ){
        return this.createdAt;
    }
    
    public LocalDateTime getUpdatedAt( ){
        return this.updatedAt;
    }      
    
}
