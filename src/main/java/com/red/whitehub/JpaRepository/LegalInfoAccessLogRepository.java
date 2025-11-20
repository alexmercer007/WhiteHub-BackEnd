

package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.LegalInfoAccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */

public interface LegalInfoAccessLogRepository extends JpaRepository < LegalInfoAccessLog, Long >{ 
    
}
