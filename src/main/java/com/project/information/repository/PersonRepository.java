package com.project.information.repository;

import com.project.information.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByBirthDayBetween(LocalDate from, LocalDate to);

    default List<Person> byAge(int years) {
        return findByBirthDayBetween(
                LocalDate.now().minusYears(years),
                LocalDate.now().minusYears(years - 1)
        );
    }
}
