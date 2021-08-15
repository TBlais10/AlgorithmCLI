package com.company;

public class PigLatin {

    public static void run() {
        System.out.println("Welcome to the Pig Latin Algorithm!\nThis algorithm will take a word or phrase and translate it to...well pig latin!\nExample: 'This is the way' becomes 'Histay Siway Hetay Ayway'");
        System.out.print("Input: ");
        CLI.scanner.nextLine();
        String input = CLI.scanner.nextLine();
        pigLatin(input);
    }

    public static void pigLatin(String input) {
        String[] stringArr = input.toLowerCase().split(" ");
        String [] vowels = {"a", "e", "i", "o", "u"};
        String newString = "";

        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (stringArr[i].substring(0, 1) != vowels[j]) {
                    stringArr[i] = stringArr[i].substring(1, 2).toUpperCase() + stringArr[i].substring(2) + stringArr[i].substring(0, 1) + "ay";

                } else {
                    stringArr[i] = stringArr[i] + "way";

                }

            }

            newString = newString.join(" ", stringArr);
        }
        System.out.println("---\nYour original input: " + input + "\nYour PigLatin translation: " + newString + "\n---");
        proceed();
    }

    public static void proceed() {
        System.out.println("What would you like to do now? Choose from the following:\n1) Rerun this program\n2) Return to the menu\n3) Quit the program");
        System.out.print("Select by typing the corresponding number! Input: ");
        byte input = CLI.scanner.nextByte();

        if (input == 1) {
            System.out.println("...rerunning program");
            //rerun the program in this class
            run();
        } else if (input == 2) {
            System.out.println("...returning to main menu");
            AlgorithmMenu.menu();
        } else if (input == 3) {
            CLI.exit();
        }

    }

    public static void main(String[] args) {
        pigLatin("a needs to have way added only");
    }


}