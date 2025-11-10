

package com.red.whitehub.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */
public interface BannedUserRepository extends JpaRepository < BannedUser , Long> { 
    
}
