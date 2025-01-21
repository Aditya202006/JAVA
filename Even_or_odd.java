// JAVA program to check whether a number is even or odd

import java.util.*;
class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println(i + " is even.");
        } else {
            System.out.println(i + " is odd.");
        }
    }
}

/*
OUTPUT

Enter a number: 
4
4 is even.

Enter a number: 
7
7 is odd.
*/
