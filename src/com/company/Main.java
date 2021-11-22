package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        // input a scanner to identify the input
        Scanner scanner = new Scanner(System.in);
        // make sure it's an int
        while(true) {
            System.out.print("Input a number: ");
            input = scanner.nextInt();
            if (scanner.hasNextInt())
                break;
            System.out.print("Input a number: ");
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
