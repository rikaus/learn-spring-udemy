package com.udemyspring.learnspringudemy.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContra implements GamingConsole {

    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Crouch");
    }
    public void left(){
        System.out.println("Slow Walk");
    }
    public void right(){
        System.out.println("Shoot");
    }
}
