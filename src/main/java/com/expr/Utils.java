package com.expr;

import org.apache.commons.math3.fraction.Fraction;

public class Utils {
    public static double pow(double a, double n) {
        double result;

        if (n == 0 && a == 0) {
            throw new ArithmeticException();
        }
        //a<0 && ( 0<n<1)
        else if (a < 0 && n > 0 && n < 1) {
            Fraction nn = new Fraction(n);
            int num = nn.getNumerator();
            int den = nn.getDenominator();
            if (num == 1 && den % 2 == 1) {
                return -pow(-a, n);
            } else {
                throw new ArithmeticException();
            }
        } else {
            result = Math.pow(a, n);
        }
        return result;
    }
}
