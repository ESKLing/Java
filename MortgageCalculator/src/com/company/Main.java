package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int principal = getPrincipal(scanner);

        float annualInterestRate = getAnnualInterestRate(scanner);
        float monthlyInterestRate = annualInterestRate / 100 / 12;

        int years = getYears(scanner);
        int totalMonthlyPayments = years * 12;

        double mortgageRate = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonthlyPayments))
                                / (Math.pow((1 + monthlyInterestRate), totalMonthlyPayments) - 1));

        String mortgageRateFormatted = NumberFormat.getCurrencyInstance().format(mortgageRate);
        System.out.println("Mortgage Rate: " + mortgageRateFormatted);
    }

    private static int getYears(Scanner scanner) {
        int years;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if (years >= 1 && years <= 30) {
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        return years;
    }

    private static float getAnnualInterestRate(Scanner myScanner) {
        float annualInterestRate;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = myScanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30) {
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }
        return annualInterestRate;
    }

    private static int getPrincipal(Scanner scanner) {
        int principal;
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }
        return principal;
    }
}
