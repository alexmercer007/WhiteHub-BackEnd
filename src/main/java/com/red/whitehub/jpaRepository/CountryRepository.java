/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.red.whitehub.JpaRepository;

import com.red.whitehub.entity.location.Country;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author aleja
 */
public interface CountryRepository extends JpaRepository<Country, Long>{
    
    Optional<Country> foundByCountry(String country);
    
}
