package com.restful.restwebservices;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

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
}
