package com.company;

import java.util.Scanner;

public class Game {
    Word solution;
    Word[] words = new Word[6];
    BoolTable[] existingInWords = new BoolTable[6];
    BoolTable[] exactLocations = new BoolTable[6];
    public Game(Word solution) {
        this.solution = solution;
    }
    Input playerInput = new Input();
    public void play(){

        String guess;
        int iterator = 0;
        do {
            guess = playerInput.get();
            words[iterator] = new Word(guess);
            existingInWords[iterator] = new BoolTable(words[iterator].guessExistsInWord(solution.getWord()));
            exactLocations[iterator] = new BoolTable(words[iterator].guessCorrectPlace(solution.getWord()));
            System.out.print("Is this letter in correct place?  ");
            exactLocations[iterator].printTab();
            System.out.print("\nIs this anywhere in the word?     ");
            existingInWords[iterator].printTab();
            System.out.println("\n\n");
            iterator++;
        }
        while (exactLocations[iterator-1].allTrue() || iterator>=5);
        if(iterator>=5){
            System.out.println("You lost!");
        }
        else {
            System.out.println("You won!");
        }
    }
}
