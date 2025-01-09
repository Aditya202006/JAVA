// JAVA program to check wheather the program is ARMSTRONG or NOT.

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check whether the number is Armstrong or not : ");
        int n = sc.nextInt();
        int temp = n;
        int temp2=n;
        int rem=0;
        int q;
        int count = 0;
        int sum=0;
        while(temp>0){
            rem = temp % 10;
            q = temp /10;
            temp = q;
            count++;
        }
        while(temp2>0){
            rem = temp2 %10;
            sum += Math.pow(rem,count);
            q = temp2/10;
            temp2=q;
        }
        if (n == sum){
            System.out.println(n + " is a Armstrong");
        }
        else{
            System.out.println(n + " is not an Armstrong");
        }
    }
}

/*
OUTPUT

Enter a number to check whether the number is Armstrong or not : 
153
153 is a Armstrong

*/
