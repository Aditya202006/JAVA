// Java program that generates the Fibonacci sequence up to the nth term.

import java.util.*;
class Main{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the number of terms to generate in the Fibonacci sequence: ");
          int n = sc.nextInt();
          int a = 0;
          int b = 1;
          int count = 1;
          
          while (count <= n) {
               int temp = b;
               b += a;
               a = temp;
               count ++;
               System.out.println(a);
          }
     }
}

/*
OUTPUT

Enter the number of terms to generate in the Fibonacci sequence: 
7
1
1
2
3
5
8
13

*/
