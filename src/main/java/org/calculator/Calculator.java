package org.calculator;

public class Calculator {
    public String message=null;

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if(num2==0)
        {
            this.message="cannot divide with zero";
            return 0;
        }
        return num1/num2;
    }
}
