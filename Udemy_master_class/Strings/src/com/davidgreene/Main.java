package com.davidgreene;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "this is my string";
        System.out.println("myString is equal to :" + myString);
        myString = myString + ", and this is more. ";
        System.out.println("myString is equal to :" + myString);

        String numString = "149.95";
        numString = numString + "34.95";
        System.out.println("The result is " + numString);

        String lastString = "20";
        int myInt = 50;
        lastString = myInt + myString;
        System.out.println("lastString is equal to " + lastString);
        double mydouble = 120.47;
        lastString = lastString + mydouble;
        System.out.println("The lastString value is equal to : " + lastString);
        //java will automatically convert the "int" to a "string and concatenate

        

    }
}
