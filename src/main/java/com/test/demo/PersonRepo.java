package com.test.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface PersonRepo extends JpaRepository<Person, Integer>{
    
}
