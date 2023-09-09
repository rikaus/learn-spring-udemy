package com.udemyspring.learnspringudemy;

import com.udemyspring.learnspringudemy.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.udemyspring.learnspringudemy.game")
public class App02GamingBasicJava {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(App02GamingBasicJava.class);
        context.getBean(GameRunner.class).run();



//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));

    }
}