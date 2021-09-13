/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String principle = scan.nextLine();
        System.out.print("Enter the rate of interest: ");
        String rateInterest = scan.nextLine();
        System.out.print("Enter the number of years: ");
        String numYears = scan.nextLine();
        System.out.print("Enter the number of times interest is compounded: ");
        String compound = scan.nextLine();

        double princ = Double.parseDouble(principle);
        double roi = Double.parseDouble(rateInterest);
        double years = Double.parseDouble(numYears);
        double comp = Double.parseDouble(compound);
        double investment = princ*(Math.pow(1+(roi*.01)/comp,comp*years));

        princ = Math.round(princ * 100.0) / 100.0;
        investment = Math.round(investment * 100.0) / 100.0;

        String invest= String.format("$%.2f",investment);
        String prin= String.format("$%.2f",princ);

        System.out.print(String.format("%s invested at %.1f%% for %.0f years compounded %.0f times per year is %s",prin,roi,years,comp,invest));
    }
}