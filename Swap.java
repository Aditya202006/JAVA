//  Write a Java program to swap the values of two variables a and b and print the values before and after swapping.

import java.util.*;

public class Github {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }
}

/*
The value of a is: 20
The value of b is: 10
*/
