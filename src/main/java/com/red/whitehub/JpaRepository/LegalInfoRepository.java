

package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.LegalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */

public interface LegalInfoRepository extends JpaRepository < LegalInfo, Long > { 
    
}
