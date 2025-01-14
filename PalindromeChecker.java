//  Write a program to check the given number is Palindrom or not. 

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()   
 - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;   

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");   

        }
    }
}

/*
OUTPUT:

Enter a string: madam
madam is a palindrome.

Enter a string: hello
hello is not a palindrome.

*/
