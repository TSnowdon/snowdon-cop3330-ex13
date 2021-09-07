import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {
    public static void main(String[] args) {
        double principal;
        double rate;
        double years;
        double amount;
        double compoundAmount;
        Scanner reader = new Scanner(System.in);
        try {
            // Input
            System.out.print("What is the principal amount? ");
            principal = Double.parseDouble(reader.nextLine());
            System.out.print("What is the rate? ");
            rate = Double.parseDouble(reader.nextLine());
            rate /= 100;
            System.out.print("What is the number of years? ");
            years = Double.parseDouble(reader.nextLine());
            System.out.print("What is the number of times the interest is compounded per year? ");
            compoundAmount = Double.parseDouble(reader.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input! Please restart the program and try again.");
            return;
        }
        // Processing
        // A = P(1 + r/n)^(n*t)
        // amount = principal * (1 + (rate / compoundAmount)) ^ (compoundAmount * years)
        amount = principal * Math.pow((1 + (rate / compoundAmount)), (compoundAmount * years));
        // Output
        System.out.printf("$%.2f invested at %.2f%% for %.0f years compounded %.0f times per year is $%.2f.\n", principal, (rate * 100), years, compoundAmount, amount);
    }
}
