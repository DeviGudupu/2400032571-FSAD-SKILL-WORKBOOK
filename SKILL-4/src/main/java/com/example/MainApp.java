package com.example;

import com.example.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("=== XML Configuration Demo ===");

        Student s1 = ctx.getBean("studentConstructor", Student.class);
        System.out.println("Constructor Injection: " + s1);

        Student s2 = ctx.getBean("studentSetter", Student.class);
        System.out.println("Setter Injection: " + s2);
    }
}
