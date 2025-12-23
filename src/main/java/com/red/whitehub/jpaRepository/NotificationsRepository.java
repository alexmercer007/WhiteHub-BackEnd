
package com.red.whitehub.JpaRepository;

import com.red.whitehub.entity.notification.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */


public interface NotificationsRepository extends JpaRepository< Notifications, Long > {
    
    
}
