package com.backOffice_electric_cooperative.demo.infastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Permite el acceso a todas las rutas sin autenticación
                )
                .csrf(csrf -> csrf.disable()); // Deshabilita CSRF (opcional, pero recomendado para APIs REST)

        return http.build();
    }
}
