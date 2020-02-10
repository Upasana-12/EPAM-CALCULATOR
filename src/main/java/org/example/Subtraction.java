package org.example;

public class Subtraction extends Calculator
{
    Subtraction(double a, double b)
    {
        x = a;
        y = b;
    }

    double calculate()
    {
        return x-y;
    }
}
