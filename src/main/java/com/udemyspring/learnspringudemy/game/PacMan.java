package com.udemyspring.learnspringudemy.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements GamingConsole {

    public void up(){
        System.out.println("Move UP");
    }

    public void down(){
        System.out.println("Move DOWN");
    }

    public void left(){
        System.out.println("Move LEFT");
    }

    public void right(){
        System.out.println("Move RIGHT");
    }

}
