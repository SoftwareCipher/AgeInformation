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
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name = "birthday")
    private LocalDate birthDate;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthDate = birthday;
    }
}
