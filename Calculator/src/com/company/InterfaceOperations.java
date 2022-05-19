package com.company;

import java.util.Scanner;

public class InterfaceOperations {

    Scanner input = new Scanner(System.in);

    public void menu(){

        System.out.println("----------------------------");
        System.out.println(" 0 Exit \n " +
                "1 Addition \n " +
                "2 Extraction \n " +
                "3 Multiplication \n " +
                "4 Division \n " +
                "5 Exponential Number \n " +
                "6 SquareRoot \n " +
                "7 Derivatization \n " +
                "8 Integral \n " +
                "9 Factorial \n " +
                "10 Modulo Operator \n " +
                "11 Absolute Value");
        System.out.println("----------------------------");
        System.out.println("Select the math operation Id: ");
    }

    public int takingId(){
        int Id = input.nextInt();
        return Id;
    }

    public double takingDoubleNumber(){
        printNumbers();
        double doubleNumber = input.nextDouble();
        return doubleNumber;
    }

    public int takingIntNumber(){
        printNumbers();
        int intNumber = input.nextInt();
        return intNumber;
    }

    public void printNumbers(){
        System.out.println("Enter the number: ");
    }
}
