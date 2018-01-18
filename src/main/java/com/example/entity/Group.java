package com.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "group", schema = "spring_hateoas")
public class Group {
    private String id;
    private String name;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",
            strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
