package com.company;

import java.util.Scanner;

public class CLI {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(){
        int num = scanner.nextInt();
        return num;
    }

    public static float getFloat(){
        float num = scanner.nextFloat();
        return num;
    }

    public static String getString(){
        String userStr = scanner.nextLine();
        return userStr;
    }

    public static void exit(){
            System.out.println("Exiting program. See you next time!");
    }

        public static void main(String[] args) {
       // exit();
    }

    public static void proceed(){
        System.out.println("What would you like to do now? Choose from the following:\n1) Rerun this program\n2) Return to the menu\n3) Quit the program");
        System.out.print("Select by typing the corresponding number! Input: ");
        byte input = scanner.nextByte();

        if (input == 1){
            System.out.println("...rerunning program");
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

}

/*Original exit method. would resolve else statement always. Hidden character issue? Likely
public static void exit(){
        System.out.print("Are you sure you want to quit? Y/N?\nInput: ");
        String answer = CLI.scanner.nextLine().trim();
        String trimmedAnswer = answer.substring(0,1).toUpperCase();
        System.out.println("---" + trimmedAnswer + "---This is the answer");
        if (trimmedAnswer == "Y") {
            System.out.println("Exiting program. See you next time!");
        }
        else if (trimmedAnswer == "N") {
            System.out.println("Ok! Returning to main menu.");
            AlgorithmMenu.menu();
        } else {
            System.out.println("Invalid input! Please try again.\n");
            exit();
        }

    }*/