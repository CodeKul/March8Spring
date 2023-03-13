package com.example.March8Spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")//singleton
public class Student {

    @Autowired
    private Subject subject;

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

//    public Student(Subject subject){
//        this.subject = subject;
//    }

    public Student(){
        System.out.println("In const");
    }
    public void callSubject() {
        subject.getSubject();
    }
}
