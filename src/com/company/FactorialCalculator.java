package com.company;

public class FactorialCalculator {

    public static void run(){
        System.out.println("\nWelcome to the Factorial Calculator!\nThe Factorial Calculator takes a number and multiplies each positive number that is less than or equal to that number\nExample: The number is 3. Factorial is 1 * 2 * 3 = 6.");
        System.out.print("Input: ");
        int input = CLI.scanner.nextInt();
        factorial(input);

    }

    public static int factorial(int num) {
        int count = 1;

        if (num < 0) {
            System.out.println("Your test number cannot be less than 0! Please try again");
            run();
        }
        else if (num == 0){
            System.out.println("The factorial of 0 is 0");
        }
        else if (num >= 0){
            for (int i = 1; i <= num; i++){
                count *= i;
            }

            System.out.println("---\nThe factorial of " + num + " is " + count +"!\n---");
        }

        CLI.proceed();
        return count;
    }

}
