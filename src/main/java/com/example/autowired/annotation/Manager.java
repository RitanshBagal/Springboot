package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Autowired// here it is used for field injection by IOC, makes the code cleaner but constructor injection is preferred as it gives more clarity.
    @Qualifier("employee")// this annotation is used when there are multiple beans of the same type
    private Employee employee;


    // @Autowired here, is used for constructor injection
//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
