

package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.BannedUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */
public interface BannedUserRepository extends JpaRepository < BannedUser, Long > {
    
}
