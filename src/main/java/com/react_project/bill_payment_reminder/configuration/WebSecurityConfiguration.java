package com.react_project.bill_payment_reminder.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csfr -> csfr.disable())
                .authorizeHttpRequests((request) -> {
                    request.requestMatchers("/api/**").permitAll();
                    request.anyRequest().authenticated();
                })
                .formLogin(formLogin -> formLogin.disable())
                .oauth2Login(oauth2 -> {
                    oauth2.defaultSuccessUrl("http://localhost:5173/dashboard", true);
                })
                .build();
    }


}
