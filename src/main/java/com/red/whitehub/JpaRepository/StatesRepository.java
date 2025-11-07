/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.JpaRepository;

import com.red.whitehub.Entity.States;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alejandro
 */
public interface StatesRepository extends JpaRepository <States, Long> {
    
    
}
