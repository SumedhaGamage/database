package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controller {

    @Autowired
    PersonRepo repo;

    @GetMapping(value = "/save")
    public void savePerson(){
        Person p = new Person();
        p.setName("sumedha");
        p.setId(1);

        repo.save(p);
        
    }
    
}
