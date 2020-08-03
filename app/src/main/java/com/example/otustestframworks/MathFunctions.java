package com.example.otustestframworks;

public class MathFunctions {

    public Double plusFunc(Integer a, Integer b, char oper) {
        switch (oper) {
            case '/':
                if (a == 0 || b == 0) {
                    return -1.0;
                }
                return ((double)a / (double)b);

            case '+':
                return Double.valueOf(a + b);

            case 'x':
                return (double) (a * b);

            case '-':
                return Double.valueOf(a - b);
            default:
                throw new RuntimeException("Unsupported operation.");
        }
    }

    public boolean IsOdd(int a) {
        if(a % 2 == 0) {
            return  true;
        } else {
            return false;
        }
    }


}
