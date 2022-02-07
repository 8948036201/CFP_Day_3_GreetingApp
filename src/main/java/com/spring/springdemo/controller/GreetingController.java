package com.spring.springdemo.controller;

import com.spring.springdemo.entity.Greeting;
import com.spring.springdemo.entity.User;
import com.spring.springdemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    /*private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();*/

    @Autowired
    private GreetingService greetingService;

    @GetMapping(value = {"","/"})
    public Greeting greeting(@RequestParam(value="fname", defaultValue="World")String fname,
                             @RequestParam(value="lname", defaultValue="")String lname){

 //       return new Greeting(counter.incrementAndGet(), String.format(template, fname, lname));
        User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return greetingService.addGreeting(user);
    }
}
