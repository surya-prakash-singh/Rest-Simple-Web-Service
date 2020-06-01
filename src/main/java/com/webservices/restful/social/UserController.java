package com.webservices.restful.social;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.Servlet;
//import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAOService service;

    @GetMapping(path = "/users")
    public List<User> getUsers(){
        return service.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User getUserById(@PathVariable int id){
        User usr = service.findById(id);
        if(usr == null){
            throw new UserNotFoundException("User Not Found");
        }
        return service.findById(id);
    }

    @GetMapping(path = "/delete/{id}")
    public List<User> deleteById(@PathVariable int id){
        List<User> usr = service.deleteUser(id);

        if(usr == null){
            throw new UserNotFoundException("User Not Found");
        }
        return usr;
    }

    @PostMapping(path = "/createUser")
    public ResponseEntity createUser(@RequestBody User usr){


        User savedUsr = service.saveUser(usr);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUsr.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

}
