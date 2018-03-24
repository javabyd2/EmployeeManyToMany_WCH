package com.sdabyd2.employeeManyToMany.entity;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id",unique = true)
    private int projetId;

    @Column(name = "title",length = 50)
    private String title;



}
