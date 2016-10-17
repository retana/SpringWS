package org.retana.agendaws;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@EnableAutoConfiguration(exclude = { WebMvcAutoConfiguration.class })
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		// @formatter:off
		/*	auth.jdbcAuthentication().dataSource(dataSource).withUser("dave")
					.password("secret").roles("USER");
			// @formatter:on
		*/
	}

}
