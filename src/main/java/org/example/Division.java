package org.example;

public class Division extends Calculator
{
    Division(double a, double b)
    {
        x = a;
        y = b;
    }

    double calculate()
    {
        return x/y;
    }
}
