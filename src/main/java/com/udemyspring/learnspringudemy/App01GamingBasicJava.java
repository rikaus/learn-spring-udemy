package com.udemyspring.learnspringudemy;

import com.udemyspring.learnspringudemy.game.GameRunner;
import com.udemyspring.learnspringudemy.game.PacMan;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        var game = new SuperContra();
        //var game = new MarioGame();

        var game = new PacMan();  // Creating a object
        var gameRunner =  new GameRunner(game);  //Object creation + Wiring of dependency
        gameRunner.run();

    }
}
