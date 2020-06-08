package com.restful.restwebservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorld {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path="/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("hello World,%s",name));
    }
    @GetMapping(path="/hello-world-internationalized")
    public String HelloWorldInternationalized(@RequestHeader(name= "Accept-Language",required = false) Locale locale){
        return messageSource.getMessage("good.morning.message",null,locale);
    }

//    @GetMapping(path="/hello-world-internationalized")
//    public String HelloWorldInternationalized(){
//        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
//    }
}
