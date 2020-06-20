// Copyright (C) 2020
// All rights reserved
package labcodingstandards;

import java.util.Scanner;
/**
 * @author Stefanny
 */
public class Calculator {
    // CHECKSTYLE: OFF/
    /**
    * Main Method.
    * @param args
    */
    public static void main(final String[] args) {
        // CHECKSTYLE: ON
        Scanner reader = new Scanner(System.in);

        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");

        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        while (true) {
            System.out.print("Enter first number: ");
            input = reader.nextLine();

            try {
                first = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
              System.out.println("Not valid!");
            }
        }

        while (true) {
            System.out.print("Enter second number: ");
            input = reader.nextLine();

            try {
                second = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
              System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.calculate(first, second, operator);

        System.out.printf(result);
        reader.close();
    }

     /**
     * This method can execute the operation.
     * @param f the first operator.
     * @param s the second operator.
     * @param o the operation to execute.
     * @return String value
     */
     private String calculate(final double f, final double s, final char o) {
        double result = 0;
        switch (o) {
        case '1':
            result = f + s;
            break;
         case '2':
            result = f - s;
            break;
         case '3':
            result = f * s;
            break;
         case '4':
            result = f / s;
            break;
        default:
            return "Error! operator is not correct";
        }
        return "The result is: " + result;
    }
}
