package com.company;

public class MathOperations {

    public void addition(double firstNumber, double lastNumber){
        System.out.println("Result: " + (firstNumber + lastNumber));
    }

    public void extraction(double firstNumber, double lastNumber){
        System.out.println("Result: " + (firstNumber - lastNumber));
    }

    public void multiplication(double firstNumber, double lastNumber){
        System.out.println("Result: " + (firstNumber*lastNumber));
    }

    public void divide(double firstNumber, double lastNumber){
        try{
           double result = firstNumber / lastNumber;
            System.out.println("Result: " + (result));
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Occurred!");
        }
    }

    public void exponentiation(double firstNumber, double lastNumber){
        if(lastNumber == 0){
            System.out.println(1);
        }
        for(int i=1;i<lastNumber;i++){
            firstNumber *= firstNumber;
        }
        System.out.println("Result: " + (firstNumber));
    }

    public void squareRoot(double number){
        System.out.println("Result: " + (Math.sqrt(number)));
    }

    public void modulo(double number, double mod){
        while(number >= mod){
            number -= mod;
        }
        System.out.println("Result: " + (number));
    }

    public void absoluteValue(double number){
        if(number > 0){
            ;
        }else{
            number = (-1 * number);
        }
        System.out.println("Result: " + (number));
    }

    public void factorial(int number){
        int fact = 1;
        for(int i=1;i<=number;i++){
            fact *= i;
        }
        System.out.println("Result: " + (fact));
    }

    public void derivative(int multiple, int exponent){
        if(multiple == 0){
            System.out.println("f(x)="+multiple+"*x^n, f(x)=0");
        }else{
            System.out.println("f(x)=" + multiple+ "*x^" + exponent);
            System.out.println("f'(x)=" + (multiple * exponent) + "*x^" + (exponent - 1));
        }
    }

    public void integrate(int coefficient, int exponent) {
        int first = ++exponent;
        coefficient /= first;

        System.out.println(coefficient + "x^" + first);
    }

}
