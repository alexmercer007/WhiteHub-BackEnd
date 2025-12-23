

package com.red.whitehub.mapping.auth;


import com.red.whitehub.dto.auth.RegisterDTO;
import com.red.whitehub.dto.auth.UserLoginDTO;
import com.red.whitehub.security.CustomUserDetailsService;
import com.red.whitehub.service.auth.RegisterService;
import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aleja
 */
@RestController
@RequestMapping("/api/users")
public class AuthController {

    private final RegisterService registerService;
    private final CustomUserDetailsService customUserDetailsService;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(
            CustomUserDetailsService customUserDetailsService,
            RegisterService registerService,
            PasswordEncoder passwordEncoder) {
        this.registerService = registerService;
        this.customUserDetailsService = customUserDetailsService;
        this.passwordEncoder = passwordEncoder;
        
    }

    @PostMapping("/login")
    public ResponseEntity<String> getLogin(@RequestBody UserLoginDTO userLoginDto) {


        return ResponseEntity.status(401).body("Credenciales incorrectas");
    }

   @PostMapping("/register")
    public ResponseEntity<?> register( @Valid @RequestBody RegisterDTO registerDto  ) {

       registerService.setUserRegister(registerDto);

        // registro OK
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "User registered successfully"));
    }

    
}



















































