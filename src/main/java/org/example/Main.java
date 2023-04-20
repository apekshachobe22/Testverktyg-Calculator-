package org.example;


import java.util.Scanner;

import static java.lang.System.out;

public class Main {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            out.println("Choose number1 ");
            int number1 = myObj.nextInt();
            myObj.nextLine();

            out.println("Choose operation");
            String operation = myObj.nextLine();

            out.println("Choose number2 ");
            int number2 = myObj.nextInt();

            int result = Calculator.add(number1,number2);
            switch (operation) {
                case "+" -> {
                    result = Calculator.add(number1, number2);
                    break;
                }
                case "-" ->{
                    result = Calculator.sub(number1, number2);
                    break;
                }
                case "*" -> {
                    result = Calculator.mul(number1, number2);
                    break;
                }
                case "/" -> {result= Calculator.div(number1, number2);
                    break;
                }
                default -> {

                }


            }


            System.out.println(" result is : " + result );
        }
    }


