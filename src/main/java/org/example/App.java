/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String lengthInput = scanner.nextLine();

        double length = Double.parseDouble(lengthInput);
        System.out.print("What is the width of the room in feet? ");
        String widthInput = scanner.nextLine();

        double width = Double.parseDouble(widthInput);
        String inputInfoMsg = MessageFormat.format("You entered dimensions of {0} feet by {1} feet.", length, width);
        System.out.println(inputInfoMsg);

        final double conversionFactor = 0.09290304;
        double resultInSqMeters = (length * width) * conversionFactor;
        double resultInSqFt = length * width;
        String resultMsg = MessageFormat.format(
            "The area is \n{0} square feet\n{1} square meters", resultInSqFt, resultInSqMeters);
        System.out.println(resultMsg);
    }
}
