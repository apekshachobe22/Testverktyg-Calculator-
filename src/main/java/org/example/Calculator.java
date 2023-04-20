package org.example;

import io.qase.api.annotation.Step;

public class  Calculator {

    @Step("Added the values {number1} and {number2}")
    public static int add(int number1, int number2){
        return number1 + number2 ;
    }
    public static int sub(int number1, int number2){
        return number1- number2;
    }
    public static int mul(int number1, int number2){
        return number1 * number2;
    }
    public static int div(int number1, int number2){return number1 / number2;}

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Calculator <operation> <number1> <number2>");
            System.exit(0);
        }

        String operation = args[0];
        int number1 = Integer.parseInt(args[1]);
        int number2 = Integer.parseInt(args[2]);

        int result;


    }
}






