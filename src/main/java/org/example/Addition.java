package org.example;

public class Addition extends Calculator
{
    Addition(double a, double b)
    {
        x = a;
        y = b;
    }

    double calculate()
    {
        return x+y;
    }
}
