package com.davidgreene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get earth weight from user
        Scanner user_input = new Scanner(System.in);
        System.out.println("Please enter in your weight in lbs.");
        int earth_weight = user_input.nextInt();
        System.out.println("Your weight on earth is : " + earth_weight);

        //display Mercury weight
        double mercuryWeight = (earth_weight * .378);
        System.out.println("Your weight on Mercury is : " + mercuryWeight);

        //display Moon weight
        double moonWeight = (earth_weight * .166);
        System.out.println("Your weight on the Moon is : " + moonWeight);

        //display jupiter  weight
        double jupiterWeight = (earth_weight * 2.364);
        System.out.println("Your weight on Jupiter is : " + jupiterWeight + " damn, you need to lose some weight sir!");

        //display Venus  weight
        double venusWeight = (earth_weight * .907);
        System.out.println("Your weight on Venus is : " + venusWeight);

        int x = 2;
        int y = 4;

        int squaredResult = (x*x)+(y*y);
        System.out.println("the result of xy sqaured is " + squaredResult);
    }
}
