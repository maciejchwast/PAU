package com.company;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Word {
    private int id;
    String word;
    char[] letters = new char[5];

    public Word(){

    }

    public Word(String word) {
        this.word = word;
        letters = word.toCharArray();
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
