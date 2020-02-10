package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.println("Enter choice (1/2/3/4): ");
        Scanner sc = new Scanner(System.in);
        int choice=sc.nextInt();
        double num1,num2;
        switch(choice)
        {
            case 1 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Addition a = new Addition(num1, num2);
                System.out.println(a.calculate());
                break;

            case 2 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Subtraction s = new Subtraction(num1, num2);
                System.out.println(s.calculate());
                break;

            case 3 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Multiplication m = new Multiplication(num1, num2);
                System.out.println(m.calculate());
                break;

            case 4 :
                System.out.println("Enter 1st number : ");
                num1=sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                num2=sc.nextDouble();
                Division d = new Division(num1, num2);
                System.out.println(d.calculate());
                break;

            default :
                System.out.println("Invalid choice");
        }
    }
}
