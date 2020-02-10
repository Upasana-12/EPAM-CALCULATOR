package org.example;

public class Multiplication extends Calculator
{
    Multiplication(double a, double b)
    {
        x = a;
        y = b;
    }

    double calculate()
    {
        return x*y;
    }
}
