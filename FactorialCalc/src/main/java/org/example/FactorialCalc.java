package org.example;

public class FactorialCalc {
    public int getFactorial(int f) {
        if (f < 0) {
            throw new MyNegativeValueException("Невозможно рассчитать факториал отрицательного числа");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}


