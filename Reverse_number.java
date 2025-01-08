// Java program that reverses a number. 

import java.util.*;
class A{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
            System.out.println("Enter a number to reverse : ");
          int n = sc.nextInt();
          int rem=0;
          String rev="";
          while(n > 0){
               rem = n % 10;
               rev += rem;
               n /= 10;
               //ans = ans * 10 + rem;
          }
     System.out.println("Reversed number is : " + rev);
     }
}
