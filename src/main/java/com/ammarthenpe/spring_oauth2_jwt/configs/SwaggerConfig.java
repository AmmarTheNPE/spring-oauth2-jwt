package com.ammarthenpe.spring_oauth2_jwt.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;

@Configuration
@EnableSwagger2 // or @EnableSwagger3
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()

                .apis(RequestHandlerSelectors.basePackage("com.ammarthenpe.spring_oauth2_jwt.controllers"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(getInfo());
    }

    private ApiInfo getInfo() {
        return new ApiInfo("Auth2 with JWT",
                "This service is developed by AmmarTheNPE",
                "v1", null,
                new Contact("WS", "https://ws.com.pk/",
                        "auth2@ws.com.pk"),
                "License", "License",
                Collections.emptyList());
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/api-docs", "/swagger-ui/index.html");
    }
}