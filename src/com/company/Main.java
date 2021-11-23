package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Input a number: ");
                input = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Not a valid input. It needs to be a number");
                scanner.nextLine();
                continue;
            }
        }

        if (input % 3 == 0)
            System.out.println("Buzz");
        else if (input % 5 ==0)
            System.out.println("Fizz");
        else if (input % 3 == 0 && input % 5 == 0)
            System.out.println("FizzBuzz");
        else
            System.out.println(input);
    }
}
