package com.company;

public class TitleCase {

    public static void run() {
        System.out.println("\nWelcome to the Title Case a String Algorithm!\nThis algorithm will take any word or phrase and capitalize the first letter of those words and put the rest to lowercase!\nExample: 'I am a little tea pot' becomes 'I Am A Little Tea Pot.'");
        System.out.print("Input: ");
        String input = CLI.getString();
        titleCase(input);

    }

    public static void titleCase(String input){
        String[] stringArr = input.toLowerCase().split(" "); //creates a string array that will split the user input into an index
        String newString = ""; //this will become the title case string.


        for (int i = 0; i < stringArr.length; i++){
            stringArr[i] = stringArr[i].substring(0,1).toUpperCase() + stringArr[i].substring(1); //substring() will allow me to target the index/range based on the input. It creates a copy of that range, thus why I need to add them together.

           newString = newString.join(" ", stringArr); //join takes the separate elements of the array and joins them into a string w/ spaces.
        }

        System.out.println("---\nYour input: " + input + "\nYour input title cased: " + newString +"\n---");

        proceed();
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
