package com.company;

public class Main {

    public static void main(String[] args) {
        AlgorithmMenu.start();
    }
}


/*Your application should include / do the following:
A welcome message that only appears once
A numbered menu system that allows the user to pick between 4 algorithms and one option to exit the program
If a user does not make a valid selection they should have the option to try again until a valid selection is made
When a user completes using an algorithm they should then be asked if they want to use that algorithm tool again, return to the main menu, or exit the program


Each algorithm should be its own class and have a "run" method
Create a CLI class that is responsible for taking user input and returning their input
Create a AlgorithmMenu class that is responsible for the menu system
The AlgorithmMenu class only needs one method called "start"
The Main class / main method should be as bare as possible
It should look like this:
{
    AlgorithmMenu.start()
}



Include the following algorithms into your program
Factorial Calculator (https://edabit.com/challenge/EhGqjXhY9zS7MHjWd)
Title Case A String (https://www.freecodecamp.org/learn/javascript-algorithms-and-data-structures/basic-algorithm-scripting/title-case-a-sentence)
PigLatin Converter (https://edabit.com/challenge/2aajqTB69y7ZSSo9v)
Is it a Factor ( Enter two numbers and the program will tell the user if the second number is a factor of the first )


BONUS Fun challenge: Complete the Mario Stairs Algorithm.*/