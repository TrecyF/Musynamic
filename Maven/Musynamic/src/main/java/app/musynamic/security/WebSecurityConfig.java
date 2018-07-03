package app.musynamic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
  @Autowired
  AuthenticationService authenticationService;
 
  @Override
  protected void configure(HttpSecurity http) throws Exception {
	   http
       .sessionManagement()
       .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
       .and()
       .authorizeRequests()
       .antMatchers("/**")
       .permitAll()
       .anyRequest()
       .authenticated()
       .and()
       .httpBasic()
       .and()
       .csrf()
       .disable();
    		}
  
//  .authorizeRequests()
//  .antMatchers("/resources/**", "/signup", "/about").permitAll()
//  .antMatchers("/admin/**").hasRole("ADMIN")
//  .antMatchers("/db/**").access("hasRole('ROLE_ADMIN') and hasRole('ROLE_DBA')")
//  .anyRequest().authenticated()
//  .and()
//  .formLogin()
//  .loginPage("/login")
//  .permitAll();
 
  @Bean
  public PasswordEncoder passwordEncoder() {
     return new BCryptPasswordEncoder();
  }
 
  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
       auth.userDetailsService(authenticationService).passwordEncoder(passwordEncoder());
  }
}