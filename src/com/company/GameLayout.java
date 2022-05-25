package com.company;

import javax.swing.*;
import java.awt.*;

public class GameLayout {
    JFrame f = new JFrame();
    LetterPane[] lines = new LetterPane[6];
    GameLayout(){

        for(int i =0; i<6;i++){
            lines[i] = new LetterPane(f);
        }

        f.setLayout(new GridLayout(6,5));
        f.setSize(500,1000);
        f.setVisible(true);
    }
    public void update(int roundNumber, BoolTable inWord, BoolTable correctPlace, Word guess){
        lines[roundNumber].update(guess,inWord,correctPlace);
    }
}
