package com.loops;
public class CheckPrimeNo {
    public static void main(String[] args) {
        int n1 = 300;
        int n2 = 400;

        System.out.println("Prime numbers between " + n1 + " and " + n2 + ":");

        for (int num = n1; num <= n2; num++) {
            boolean isPrime = true;
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
