package com.company;

import javax.swing.*;
import java.awt.*;

public class GameLayout {
    JFrame f = new JFrame("Wordle!");
    JPanel windows = new JPanel();
    JPanel bottom = new JPanel();
    TextFieldInput input = new TextFieldInput(bottom);
    LetterPane[] lines = new LetterPane[6];
    GameLayout(){

        for(int i =0; i<6;i++){
            lines[i] = new LetterPane(windows);
        }

        bottom.setMaximumSize(new Dimension(500,40));
        bottom.setLayout(new GridLayout(2,1));
        windows.setLayout(new GridLayout(6,5));
        windows.setSize(500,800);
        f.setSize(500,900);
        f.setLayout(new GridLayout(2,1));
        f.add(windows);
        f.add(bottom);
        f.setVisible(true);
    }
    public void update(int roundNumber, BoolTable inWord, BoolTable correctPlace, Word guess){
        lines[roundNumber].update(input.getInputValue(),inWord,correctPlace);
    }
}
