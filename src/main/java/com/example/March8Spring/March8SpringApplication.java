package com.example.March8Spring;

import com.example.March8Spring.ioc.Jio;
import com.example.March8Spring.ioc.SimConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class March8SpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(March8SpringApplication.class, args);

//        Jio jio = context.getBean(Jio.class);
//        jio.calling();
//        jio.msg();
//
//        Jio jio1 = context.getBean(Jio.class);
//        jio.calling();
//        jio.msg();
//
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(SimConfig.class);
        Jio jio = context1.getBean(Jio.class);
        jio.calling();
        jio.msg();

//        Jio jio = new Jio();
//        jio.calling();
//        jio.msg();
    }

    @GetMapping("hii")
    public String msg() {
        return "Hello";
    }

}
