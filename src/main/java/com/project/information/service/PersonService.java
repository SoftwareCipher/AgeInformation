package com.project.information.service;

import com.project.information.entity.Person;
import com.project.information.repository.PersonRepository;
import com.project.information.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements ServiceImpl {

    PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getPersonAge(int age) {
        return personRepository.byAge(age);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
