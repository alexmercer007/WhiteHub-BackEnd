

package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */
public interface MediaRepository extends JpaRepository < Media, Long > {
    
}
