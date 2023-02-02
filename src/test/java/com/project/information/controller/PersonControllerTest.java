package com.project.information.controller;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.project.information.entity.Person;
import com.project.information.repository.PersonRepository;
import com.project.information.service.PersonService;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;

import org.junit.Test;

public class PersonControllerTest {

    @Test
    public void testGetPersonByBirthDay() {
        PersonRepository personRepository = mock(PersonRepository.class);
        ArrayList<Person> personList = new ArrayList<>();
        when(personRepository.byAge(anyInt())).thenReturn(personList);
        List<Person> actualPersonByBirthDay = (new PersonController(new PersonService(personRepository)))
                .getPersonByBirthDay(21);
        assertSame(personList, actualPersonByBirthDay);
        assertTrue(actualPersonByBirthDay.isEmpty());
        verify(personRepository).byAge(anyInt());
    }

//    @Test
//    public void testGetAllPersons() {
//        PersonRepository personRepository = mock(PersonRepository.class);
//        ArrayList<Person> personList = new ArrayList<>();
//        when(personRepository.findAll()).thenReturn(personList);
//        List<Person> actualAllPersons = (new PersonController(new PersonService(personRepository))).getAllPersons();
//        assertSame(personList, actualAllPersons);
//        assertTrue(actualAllPersons.isEmpty());
//        verify(personRepository).findAll();
//    }

}

