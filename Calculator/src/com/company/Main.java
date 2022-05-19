package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MathOperations mathOperations = new MathOperations();
        InterfaceOperations interfaceOperations = new InterfaceOperations();


        int key = 1;
        while(key != 0) {
            interfaceOperations.menu();
            switch (interfaceOperations.takingId()) {
                case 0:
                    System.out.println("Logged out!");
                    key = 0;
                    break;
                case 1:
                    mathOperations.addition(interfaceOperations.takingDoubleNumber(),interfaceOperations.takingDoubleNumber());
                    break;
                case 2:
                    mathOperations.extraction(interfaceOperations.takingDoubleNumber(),interfaceOperations.takingDoubleNumber());
                    break;
                case 3:
                    mathOperations.multiplication(interfaceOperations.takingDoubleNumber(),interfaceOperations.takingDoubleNumber());
                    break;
                case 4:
                    mathOperations.divide(interfaceOperations.takingDoubleNumber(),interfaceOperations.takingDoubleNumber());
                    break;
                case 5:
                    mathOperations.exponentiation(interfaceOperations.takingDoubleNumber(),interfaceOperations.takingDoubleNumber());
                    break;
                case 6:
                    mathOperations.squareRoot(interfaceOperations.takingDoubleNumber());
                    break;
                case 7:
                    mathOperations.derivative(interfaceOperations.takingIntNumber(),interfaceOperations.takingIntNumber());
                    break;
                case 8:
                    mathOperations.integrate(interfaceOperations.takingIntNumber(),interfaceOperations.takingIntNumber());
                    break;
                case 9:
                    mathOperations.factorial(interfaceOperations.takingIntNumber());
                    break;
                case 10:
                    mathOperations.modulo(interfaceOperations.takingDoubleNumber(),interfaceOperations.takingDoubleNumber());
                    break;
                case 11:
                    mathOperations.absoluteValue(interfaceOperations.takingDoubleNumber());
                    break;
                default:
                    System.out.println("Wrong Value, Try Again.");
                    break;

            }
        }
    }
}
