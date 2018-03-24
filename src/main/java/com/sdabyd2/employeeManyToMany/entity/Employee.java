package com.sdabyd2.employeeManyToMany.entity;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id",unique = true)
    private int employeeId;

    @Column(name = "first_name",length = 50)
    private String firstName;

    @Column(name = "last_name",length = 50)
    private String lastName;
}
