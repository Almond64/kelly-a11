/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //How am I supposed to do all this with a single output statement?
        System.out.println("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        System.out.println("What is the exchange rate? ");
        double rate = input.nextDouble();
        //calculate dollars rounded up to the nearest cent
        double dollars = rate * euros;
        System.out.printf("%.2f euros at an exchange rate of %.4f is %.2f U.S. dollars.\n", euros, rate, Math.ceil(dollars));
    }
}
