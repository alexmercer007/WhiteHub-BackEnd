
package com.red.whitehub.security;

import com.red.whitehub.dto.auth.UserLoginDTO;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class CustomUserDetails implements UserDetails {
    
    UserLoginDTO userDto = new UserLoginDTO();
    
    public CustomUserDetails (UserLoginDTO userDto){ 
        this.userDto = userDto;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // Suponiendo que userDto.getRole() devuelve "USER" o "ADMIN"
    return List.of(new SimpleGrantedAuthority("ROLE_" + userDto.getRole()));
    }

    @Override
    public String getPassword() {
       return userDto.getPassword();
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired(); 
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked(); 
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired(); 
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled(); 
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
