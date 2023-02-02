package com.project.information.service;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.project.information.entity.Person;
import com.project.information.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {PersonService.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PersonServiceTest {
    @MockBean
    private PersonRepository personRepository;

    @Autowired
    private PersonService personService;

    @Test
    public void testGetPersonAge() {
        ArrayList<Person> personList = new ArrayList<>();
        when(personRepository.byAge(anyInt())).thenReturn(personList);
        List<Person> actualPersonAge = personService.getPersonAge(21);
        assertSame(personList, actualPersonAge);
        assertTrue(actualPersonAge.isEmpty());
        verify(personRepository).byAge(anyInt());
    }

//    @Test
//    public void testGetAllPersons() {
//        ArrayList<Person> personList = new ArrayList<>();
//        when(personRepository.findAll()).thenReturn(personList);
//        List<Person> actualAllPersons = personService.getAllPersons();
//        assertSame(personList, actualAllPersons);
//        assertTrue(actualAllPersons.isEmpty());
//        verify(personRepository).findAll();
//    }
}

