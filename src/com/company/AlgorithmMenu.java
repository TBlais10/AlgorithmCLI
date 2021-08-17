package com.company;

public class AlgorithmMenu {

    public static void start() {
        System.out.println("Hello! Welcome to Taylor's Algorithm CLI.");
        menu();
    }

    public static void menu() {
        System.out.print("\nMain Menu!\nChoose from the following Algorithms by typing the corresponding numbers!\n---\n1) Factorial Calculator\n2) Title case a String\n3) PigLatin Converter\n4) Is it a factor?\n5) Quit\nSelection: ");
      int selection = CLI.getInt();

        if (selection == 1) {
            FactorialCalculator.run();
        } else if (selection == 2) {
            TitleCase.run();
        } else if (selection == 3) {
            System.out.println("!!!\nThis algorithm is under construction! Returning too main menu...\n!!!");
            menu();
            //PigLatin.run();
        } else if (selection == 4) {
            IsAFactor.run();
        } else if (selection == 5) {
            CLI.exit();
        } else {
            System.out.println("Invalid input! Please try again.");
            menu();
        }

    }

//    public static void proceed(){
//        System.out.println("What would you like to do now? Choose from the following:\n1) Rerun this program\n2) Return to the menu\n3) Quit the program");
//        System.out.print("Select by typing the corresponding number! Input: ");
//        int input = CLI.getInt();
//
//        if (input == 1){
//            System.out.println("...rerunning program");
//            //rerun the program in this class
//        }
//        else if (input == 2){
//            System.out.println("...returning to main menu");
//            AlgorithmMenu.menu();
//        }
//        else if (input == 3){
//            CLI.exit();
//        }
//
//    }

}
