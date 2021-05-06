package com.test.demo;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controller {

    @Autowired
    PersonRepo repo;

    @GetMapping(value = "/save/{name}/{id}")
    public void savePerson(@PathVariable("name") String name, 
    @PathVariable("id") int id){
        System.out.println("Name: " + name);
        Person p = new Person();
        p.setName(name);
        p.setId(id);

        repo.save(p);
        
    }
    
}
