package com.dmitry.tkachenko.spring;

import com.dmitry.tkachenko.spring.computer.DellAlienwarePC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DellAlienwarePC myPC = (DellAlienwarePC) context.getBean("myPC");
        myPC.turnOn();
        String info = myPC.toString();
        System.out.println(info);
        myPC.turnOff();
    }
}
