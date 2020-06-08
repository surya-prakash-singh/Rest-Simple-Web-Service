package com.webservices.restful.social;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class filtering {
    @GetMapping("/filtering")
    public MappingJacksonValue retriveEmployeeDetails(){
        Employee emp = new Employee("Surya",23,"pwd");
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name");
        FilterProvider filters = new SimpleFilterProvider().addFilter("EmployeeFilter",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(emp);
        mapping.setFilters(filters);

        return mapping;
    }
}
