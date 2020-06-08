package com.webservices.restful.social;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"pwd","name"})
public class Employee {

    private static String name;

//    @JsonIgnore
    private String pwd;

    private Integer age;

    public Employee(String name, Integer age, String pwd) {
        super();
        this.name = name;
        this.age = age;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
