package com.company;

public class IsAFactor {

    public static void run() {
        System.out.println("\nWelcome to the Is a Factor Algorithm!\nThis algorithm will accept two numbers as the second number you provide will be checked against the first number you provided. If the first number is divided by the second one and it returns a number divisible by 2, it is a factor!\nExample: 18 / 9 = 2 ... 2 is a remainder of 0, so 9 is a factorial of 18");
        System.out.print("First Number: ");
        float firstNum = CLI.getFloat();
        System.out.print("Second Number: ");
        float secondNum = CLI.getFloat();
        isAFactor(firstNum, secondNum);
    }

    public static void isAFactor(float firstNum, float secondNum){

        float answer = firstNum / secondNum;

        System.out.println("\n---\n" + (int)firstNum + " / " + (int)secondNum + " is equal to " + answer);

        if (firstNum % secondNum == 0){
            System.out.println((int)secondNum + " is a factor of " + (int)firstNum + "!" + "\n---");

        } else {
            System.out.println((int)secondNum + " is not a factor of " + (int)firstNum + "!" + "\n---");

        }
        proceed();
    }

    public static void proceed(){
        System.out.println("What would you like to do now? Choose from the following:\n1) Rerun this program\n2) Return to the menu\n3) Quit the program");
        System.out.print("Select by typing the corresponding number! Input: ");
        int input = CLI.getInt();

        if (input == 1){
            System.out.println("...rerunning program");
            run();//rerun the program in this class
        }
        else if (input == 2){
            System.out.println("...returning to main menu");
            AlgorithmMenu.menu();
        }
        else if (input == 3){
            CLI.exit();
        }

    }

    public static void main(String[] args) {
        run();
    }

}
