package com.mshr.Dyd_Application_M1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AdminLogin_Security extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth
		  .inMemoryAuthentication()
		      .withUser("admin").password("987654321").roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

			 http
				.authorizeRequests().antMatchers("/প্রশিক্ষণ-ক্যালেন্ডার", "/", "/login").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN")
				
				.and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/admin/index")
				//pblm
				.and().logout()
				.logoutSuccessUrl("/login");


	}

}
