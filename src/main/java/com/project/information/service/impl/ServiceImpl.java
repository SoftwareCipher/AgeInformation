package com.project.information.service.impl;

import com.project.information.entity.Person;

import java.time.LocalDate;
import java.util.List;

public interface ServiceImpl{
    List<Person> getPersonAge(int age);
}
