package com.mglujoy.security.config;

import com.mglujoy.security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    
    private final UserRepository repository;
    
    @Bean
    public UserDetailsService userDetailsService() {
        return (String username) -> repository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
    
}
