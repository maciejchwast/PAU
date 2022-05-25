package com.company;

public class Word {
    private int id;
    String word;
    char[] letters = new char[5];

    public Word() {

    }

    public Word(String word) {
        this.word = word;
        letters = word.toCharArray();
    }

    //Funkcja sprawdza, czy istnieje w próbie właściwa litera na właściwym miejscu
    public boolean[] guessCorrectPlace(String str) {
        char[] guessLetters = new char[5];
        guessLetters = str.toCharArray();
        boolean[] result = new boolean[5];
        for (int i = 0; i < 5; i++) {
            result[i] = false;
            if (guessLetters[i] == this.letters[i]) {
                result[i] = true;
            }
        }
        return result;
    }

    //Funkcja sprawdza, czy dana litera w ogóle pojawia się w wyrazie, jeżeli tak zwraca true w jej miejscu
    public boolean[] guessExistsInWord(String str) {
        char[] guessLetters = new char[5];
        guessLetters = str.toCharArray();
        boolean[] result = new boolean[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(guessLetters[j]==this.letters[i]){
                    result[i]=true;
                }
            }
        }
        return result;
    }

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public char[] getLetters() {
        return letters;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setLetters(char[] letters) {
        this.letters = letters;
    }
}
