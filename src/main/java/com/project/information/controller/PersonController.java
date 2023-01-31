package com.project.information.controller;

import com.project.information.entity.Person;
import com.project.information.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/person/{age}")
    public List<Person> getPersonByBirthDay(@PathVariable int age){
        return personService.getPersonAge(age);
    }

    @GetMapping("/person/all")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();
    }
}
