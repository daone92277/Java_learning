package com.davidgreene;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 450;
        int levelCompleted = 5;
        int bonus = 100;
        DecimalFormat df = new DecimalFormat("#,###"); //add commas to int variable

        if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score was  less than 5000 but greater than 1000");
        }
        else if (score >= 1000) {
            System.out.println("your score was not 5000, it was : " + df.format(score));
        } else {
            System.out.println("Your score was less than 1000");
        }

        if (gameOver == true){
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score is : " + finalScore);
        }

        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;


        if (gameOver == true) {
            int finalScore = score + (levelCompleted + bonus);
            System.out.println("Your final score is : " + df.format(finalScore));
        }


    }
}
