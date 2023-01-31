package com.project.information.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "birthday")
    private LocalDate birthDay;

    public Person(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthday;
    }
}
