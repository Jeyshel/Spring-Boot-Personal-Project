package com.example.demo.student;

import java.time.LocalDate;

public class Student {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthDate;
    private String email;

    public Student(long id, String firstName, String middleName, String lastName, LocalDate birthDate, String email) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
    }
}
