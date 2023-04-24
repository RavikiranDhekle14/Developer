package com.nestedLoops;
import java.util.Scanner;
public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        int sum = 0;
        int power = 1;

        while(temp>0) {
            count++;
            temp = temp/10;
        }
        temp = n;
        while(temp>0) {
            int digit = temp % 10;
//            sum += Math.pow(digit, count);
            for (int i=1; i<=count; i++)
            {
            	power = power*digit;
            }
            count--;
            temp /= 10;
        }
        if ( n == power) {
            System.out.println(n + " is a Disarium number");
        } else {
            System.out.println(n + " is not a Disarium number");
        }
    }
}
