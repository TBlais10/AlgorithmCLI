package com.company;

public class FactorialCalculator {

    public static void run(){
        System.out.println("\nWelcome to the Factorial Calculator!\nThe Factorial Calculator takes a number and multiplies each positive number that is less than or equal to that number\nExample: The number is 3. Factorial is 1 * 2 * 3 = 6.");
        System.out.print("Input: ");
        int input = CLI.getInt();
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

        proceed();
        return count;
    }
    public static void proceed(){
        System.out.println("What would you like to do now? Choose from the following:\n1) Rerun this program\n2) Return to the menu\n3) Quit the program");
        System.out.print("Select by typing the corresponding number! Input: ");
        int input = CLI.getInt();

        if (input == 1){
            System.out.println("...rerunning program");
            //rerun the program in this class
            run();
        }
        else if (input == 2){
            System.out.println("...returning to main menu");
            AlgorithmMenu.menu();
        }
        else if (input == 3){
            CLI.exit();
        }

    }

}
