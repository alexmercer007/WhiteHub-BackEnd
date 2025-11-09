
package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.Municipalities;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */

public interface MunicipalitiesRepository extends JpaRepository< Municipalities, Long > {
    
}
