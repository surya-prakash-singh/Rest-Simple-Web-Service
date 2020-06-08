package com.webservices.restful.social;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration      //Declare its a config file
@EnableSwagger2     //Enabling Swagger2
public class SwaggerCoonfig {

    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
            "Social Api","Social Network Api's","1.0","urn:tos","Surya Prakash","MIT","mitUrl"
    );
    private static final Set<String> DEFAULT_PRODUCES_CONSUMES = new HashSet<String>(Arrays.asList("application/json","application/xml"));

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_CONSUMES)
                .consumes(DEFAULT_PRODUCES_CONSUMES);
    }

    //Bean Docket
        //Swagger 2
            //All paths
                //All Apis

}
