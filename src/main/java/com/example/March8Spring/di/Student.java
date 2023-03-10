package com.example.March8Spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Subject subject;

    public void callSubject() {
        subject.getSubject();
    }

}
