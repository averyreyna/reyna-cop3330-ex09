/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */
package org.example;
import java.util.Scanner;

public class App {
    // creating a constant for the gallons of paint
    public static final double constant = 350;

    public static void main(String[] args) {
        // user inputs length and width for gallon computation, but since the example output does not print out
        // the inputs/questions, you just enter the numbers in the terminal to get your answer
        Scanner input = new Scanner(System.in);
        int inputLength = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        int inputWidth = Integer.parseInt(input2.nextLine());

        // math for square feet and used the .ceil method to round up answer for gallons
        int squareFeet = inputLength * inputWidth;
        int roundedGallons = (int)Math.ceil(squareFeet / constant);

        String gallonsNeeded = String.format("You will need to purchase %d gallons of paint to cover %d square feet.", roundedGallons, squareFeet);

        System.out.println(gallonsNeeded);
    }
}