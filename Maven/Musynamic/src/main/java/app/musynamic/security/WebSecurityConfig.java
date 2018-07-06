package app.musynamic.security;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

@Order(65)
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
       .and().httpBasic()
       .and().csrf().disable()
	   .addFilterBefore(new WebSecurityCorsFilter(), ChannelProcessingFilter.class);
    		}
//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//      http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
//              .antMatchers("/api/**").permitAll().anyRequest().authenticated().and().httpBasic().and().csrf()
//              .disable().exceptionHandling().and().addFilterBefore(new WebSecurityCorsFilter(), ChannelProcessingFilter.class);
//  }
  
  
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
      return new NoEncodingEncoder();
  }
 
  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
       auth.userDetailsService(authenticationService).passwordEncoder(passwordEncoder());
  }
}
