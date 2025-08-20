package com.react_project.bill_payment_reminder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/greet")
    public String greet() {
        return "Welcome to Bill Payment Reminder";
    }
}
