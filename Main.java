package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dig;
        int sum = 0;
        System.out.println("Enter a number:");
        n = sc.nextInt();

        while (n != 0) {
            dig = n % 10;
            n = n / 10;
            sum = sum + (dig*dig*dig);
        }
        if(sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}
