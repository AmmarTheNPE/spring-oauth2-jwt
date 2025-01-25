package com.ammarthenpe.spring_oauth2_jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class SpringOauth2JwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOauth2JwtApplication.class, args);
	}

}
