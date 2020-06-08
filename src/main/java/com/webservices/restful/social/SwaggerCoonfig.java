package com.webservices.restful.social;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration      //Declare its a config file
@EnableSwagger2     //Enabling Swagger2
public class SwaggerCoonfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2);
    }

    //Bean Docket
        //Swagger 2
            //All paths
                //All Apis

}
