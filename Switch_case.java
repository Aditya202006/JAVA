// Java program that identifies and describes fruits based on user input.

import java.util.*;

     public class A {
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a fruit :");
             String fruit = sc.next();
             switch (fruit) {
                 case "Mango" -> System.out.println("king of fruits");
                 case "Apple" -> System.out.println("A sweet red fruit");
                 case "Orange" -> System.out.println("Round fruit");
                 case "Grapes" -> System.out.println("Small Fruits");
                 default -> System.out.println("please enter a valid fruit");
             }
         }
     }
