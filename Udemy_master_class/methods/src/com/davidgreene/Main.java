package com.davidgreene;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        public static void calculateScore(){
            boolean gameOver = true;
            int score = 450;
            int levelCompleted = 5;
            int bonus = 100;
            DecimalFormat df = new DecimalFormat("#,###"); //add commas to int variable

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



