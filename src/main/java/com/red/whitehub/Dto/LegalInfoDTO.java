

package com.red.whitehub.Dto;

import com.red.whitehub.Entity.Country;
import com.red.whitehub.Entity.LegalInfo;
import com.red.whitehub.Entity.Municipalities;
import com.red.whitehub.Entity.States;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author alejandro
 */

public record LegalInfoDTO(
        
    @Column( name ="full_name" )
    String fullName,
    
    @Column( name ="profession" )
     String profession,
    
    @Column( name ="specialty" )
    String specialty,
    
    @Enumerated( EnumType.STRING ) 
    @Column( name ="marital_states" )
    LegalInfo.MaritalStates maritalStates,
    
    @Column( name ="birth_place" )
    String birthPlace,
    
    @Column( name ="address_line1" )
    String addressLine1,
    
    @Column( name ="address_line2" )
    String addressLine2,
    
    @Column( name ="postal_code" )
    String postalCode,
    
    @ManyToOne
    @JoinColumn( name ="country_id", referencedColumnName ="id" )
    Country countryId,
    
    @ManyToOne
    @JoinColumn( name ="states_id", referencedColumnName ="id" )
    States statesId,
    
    @ManyToOne
    @JoinColumn( name ="municipality_id", referencedColumnName ="id" )
    Municipalities municipalitiesId,
    
    @Column( name ="phone_private" )
    String phonePrivate,
    
    @Column( name ="email_private" )
    String emailPrivate,
    
    @Column( name ="hobby", columnDefinition="TEXT" )
    String hobby,
    
    @Column( name ="interests", columnDefinition="TEXT"  )
    String interest,
    
    @Column( name ="bio", columnDefinition="TEXT"  )
    String biography,
    
    @Column( name ="website_url" )
    String websiteUrl,
    
    @Column( name ="linkedin_url" )
    String linkedinUrl,
    
    @Column( name ="github_url" )
    String githubUrl,
    
    @Column( name ="portfolio_url" )
    String portfolioUrl   ) {
    
}
