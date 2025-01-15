// JAVA program to find the number of digits in a given number.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int rem,count = 0;
        while(n>0){
            rem = n%10;
            n = n / 10;
            System.out.println("Digit is :"+rem);
            count = count + 1;
            }
        System.out.println("Number of digits :"+count);
    }
}

/*
OUTPUT:
Enter the number:
45
Number of digits :2
*/
