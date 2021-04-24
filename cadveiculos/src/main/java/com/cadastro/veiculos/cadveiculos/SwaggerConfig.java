package com.cadastro.veiculos.cadveiculos;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cadastro.veiculos.cadveiculos"))
                //.paths(regex("/veiculos.*"))
                .build()
                .apiInfo(metaInfo());
    }
 


	@SuppressWarnings("rawtypes")
	private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "API REST veiculos",
                "API REST de cadastro de veiculos",
                "1.0",
                "Terms of Service",
                new Contact("Silvano Jr", "https://google.com",
                        "email@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }
	
}