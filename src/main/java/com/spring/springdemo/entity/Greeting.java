package com.spring.springdemo.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
@Getter
public class Greeting {
    @Id
    private final long id;
    private final String message;

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }


    public Greeting() {
        id = 0;
        message = "";
    }
}
