package com.OAuth.Security;

import com.OAuth.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Config extends WebSecurityConfigurerAdapter {

    @Autowired
    SecurityService service;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(service);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/doctor/**").hasAuthority(Constants.DOCTOR_DETAILS_AUTHORITY)
                .antMatchers("/ceo/**").hasAuthority(Constants.CEO_DETAILS_AUTHORITY)
                .antMatchers("/deo/**").hasAuthority(Constants.DEO_DETAILS_AUTHORITY)
                .antMatchers("/schedule/**").hasAuthority(Constants.SCHEDULE_APPOINTMENTS_AUTHORITY)
                .antMatchers("/**").permitAll()
                .and()
                .formLogin();
    }
    
    @Bean
    PasswordEncoder getPassword(){
        
        return new BCryptPasswordEncoder();
    }
}
