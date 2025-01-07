// Java program that counts the number of times a digit appears in a given number.

import java.util.*;
class Main{
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the number : ");
          int n = sc.nextInt();
          System.out.println("Enter the digit to check how many no.of times it repeat in given number : ");
          int a = sc.nextInt();
          int count = 0;
          int rem=0;
          while(n > 0){
               rem = n % 10;
               if ( rem == a){
                    count++;
               }
               n/= 10;
          }
          System.out.println(a + " is repeated " + count + " times.");
    }
}

/*
OUTPUT  
  
Enter the number : 
88851
Enter the digit to check how many no.of times it repeat in given number : 
8
8 is repeated 3 times.

*/
