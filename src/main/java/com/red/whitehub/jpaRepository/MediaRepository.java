

package com.red.whitehub.JpaRepository;

import com.red.whitehub.entity.media.Media;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */
public interface MediaRepository extends JpaRepository < Media, Long > {
    
}
