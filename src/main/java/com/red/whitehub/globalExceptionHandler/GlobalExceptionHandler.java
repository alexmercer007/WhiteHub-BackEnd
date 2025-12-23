/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.red.whitehub.GlobalExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author Alejandro
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity<?> handleUserNotFound(UsernameNotFoundException ex) {

        Map<String, Object> body = new HashMap<>();
        body.put("error", "USER_NOT_FOUND");
        body.put("message", ex.getMessage());
        body.put("timestamp", LocalDateTime.now());

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(body);
    }
}
