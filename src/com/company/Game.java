package com.company;

public class Game {
    Logger gameLogger = new Logger();
    Word solution;
    Word[] words = new Word[6];
    BoolTable[] existingInWords = new BoolTable[6];
    BoolTable[] exactLocations = new BoolTable[6];
    GameLayout layout;
    public Game(Word solution, GameLayout _layout) {
        gameLogger.log_info("Solution for this game is "+solution.getWord());
        this.solution = solution;
        this.layout = _layout;
    }
    Input playerInput = new Input();
    public void play(){
        gameLogger.log_info("Beginning new game");
        String guess;
        int iterator = 0;
        do {
            gameLogger.log_info("Round "+(iterator+1));
            guess = playerInput.get();
            gameLogger.log_info("Player guessed "+guess);
            words[iterator] = new Word(guess);
            existingInWords[iterator] = new BoolTable(words[iterator].guessExistsInWord(solution.getWord()));
            exactLocations[iterator] = new BoolTable(words[iterator].guessCorrectPlace(solution.getWord()));
            layout.update(iterator, existingInWords[iterator], exactLocations[iterator], new Word(guess));
            System.out.print("Is this letter in correct place?  ");
            exactLocations[iterator].printTab();
            System.out.print("\nIs this anywhere in the word?     ");
            existingInWords[iterator].printTab();
            System.out.println("\n\n");
            iterator++;
        }
        while (!exactLocations[iterator-1].allTrue() && iterator<=5);
        if(iterator>=5){
            System.out.println("You lost!");
        }
        else {
            System.out.println("You won!");
        }
    }
}
