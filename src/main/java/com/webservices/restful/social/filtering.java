package com.webservices.restful.social;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class filtering {
    @GetMapping("/filtering")
    public Employee retriveEmployeeDetails(){
        return new Employee("Surya",23,"pwd");
    }
}
