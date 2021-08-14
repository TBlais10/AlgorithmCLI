package com.company;

import java.util.Scanner;

public class CLI {

    public static Scanner scanner = new Scanner(System.in);


    public static void proceed(){
        System.out.println("What would you like to do now? Choose from the following:\n1) Rerun this program\n2) Return to the menu\n3) Quit the program");
        System.out.print("Select by typing the corresponding number! Input: ");
        byte input = scanner.nextByte();

        if (input == 1){
            System.out.println("...rerunning program");
            FactorialCalculator.run();
            //rerun the program in this class
        }
        else if (input == 2){
            System.out.println("...returning to main menu");
            AlgorithmMenu.menu();
        }
        else if (input == 3){
            exit();
        }

    }

    public static void exit(){
        System.out.print("Are you sure you want to quit? Y/N?\nInput: ");
        scanner.nextLine();
        String answer = CLI.scanner.nextLine();
        if (answer == "Yes" || answer == "yes" || answer == "y" || answer == "Y") {
            System.out.println("Exiting program. See you next time!");
        }
        else if (answer == "No" || answer == "no" || answer == "n" || answer == "N") {
            System.out.println("Ok! Returning to main menu.");
            AlgorithmMenu.menu();
        }

    }

}
