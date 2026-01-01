package com.mycompany.firstproject.UniversityClass.Lab.Lab08.Q05;

public class Game {
    private int score01;
    private int score02;
    public Game(String player1, String player2) {
       // this.player1 = player1;
       // this.player2 = player2;
        System.out.println("Game Started!");

        while(true){
            score01 += getDiceRoll();
            score02 += getDiceRoll();
            if(score01>=100){
                System.out.println(player1 + " wins!");
                break;
            }
            else if(score02>=100){
                System.out.println(player2 + " wins!");
                break;
            }
        }
        
        //score01 += playerRoll;
    }
    private int getDiceRoll() {
        return (int)(Math.random() * 6) + 1;
    }
}
