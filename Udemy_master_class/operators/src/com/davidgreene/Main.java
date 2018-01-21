package com.davidgreene;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2 " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 " + result);

        previousResult = result;

        result = result /5;
        System.out.println(previousResult + " / 5 " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " / 3 " + result);

        previousResult = result;

        result = result + 1;

        System.out.println("Result is now " + result);
        result = result--;
        System.out.println("Result is now " + result);

        result = result += 2;
        System.out.println("Result is now " + result);
        result = result *= 10;
        System.out.println("Result is now " + result);
        result = result -= 10;
        System.out.println("Result is now " + result);
        result = result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = true;
            if (isAlien != false)
                System.out.println("I am an Alien!");
        int topScore = 100;
        if (topScore > 100)
                System.out.println("You have the high score!");

        int secondTopScore = 220;
        if ((topScore < secondTopScore) && (topScore > 100))
                System.out.println("less than second top score and greater than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
                System.out.println("One of these tests is true ");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This would be an error if you didnt have double ==");

        // boolean wasCar = isCar ? true : false;

        double myDouble = 20;
        double mySecondDouble = 80;
        double myDoubleTotal = ((myDouble + mySecondDouble) * 25);
        System.out.println("The total of my two doubles is : " + myDoubleTotal) ;

        double remainder = myDoubleTotal % 40;
        System.out.println("Remainder is : " + remainder);
        if (remainder <= 20);
            System.out.println("total was over the limit");



    }
}
