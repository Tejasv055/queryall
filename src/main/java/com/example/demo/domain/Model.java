package com.example.demo.domain;

import org.hibernate.annotations.GenerationTime;

import org.hibernate.annotations.Generated;
import javax.persistence.*;

@MappedSuperclass
public abstract class Model {
    @Id
    @Generated(GenerationTime.INSERT)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)

    public Long id;

    public Long getId() {
        return id;
    }
}
