/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.red.whitehub.JpaRepository;

import com.red.whitehub.entity.user.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aleja
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByUserName(String userName);
    boolean existsByUserName(String userName);
    
    Optional<User> findByEmail( String email );
            
    Optional<User> findByUserNameAndEmail( String userName, String email );

    boolean existsByEmailIgnoreCase(String email);
    
    boolean existsByEmail(String email);

}
