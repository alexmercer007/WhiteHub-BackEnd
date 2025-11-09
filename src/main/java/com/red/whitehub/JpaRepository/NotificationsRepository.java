
package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */


public interface NotificationsRepository extends JpaRepository< Notifications, Long > {
    
    
}
