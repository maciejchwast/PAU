package com.company;

import javax.swing.*;
import java.awt.*;

public class LetterPane {
    JLabel all[] = new JLabel[5];
    Word word = new Word();
    public LetterPane(JPanel p){
        for (int i = 0; i<5;i++) {
            all[i] = new JLabel();
            all[i].setHorizontalAlignment(SwingConstants.CENTER);
            all[i].setVerticalAlignment(SwingConstants.CENTER);
            all[i].setBounds(16,16,16,16);
            all[i].setBackground(Color.GRAY);
            all[i].setOpaque(true);
            all[i].setBorder(BorderFactory.createLineBorder(Color.white, 3));
            p.add(all[i]);
        }
    }
    public void update(Word word, BoolTable inWord, BoolTable exactSpot){
        for (int it = 0; it<5;it++) {
            if(exactSpot.getElement(it)){
                all[it].setBackground(Color.GREEN);
            }
            else if(inWord.getElement(it)){
                all[it].setBackground(Color.ORANGE);
            }
            else{
                all[it].setBackground(Color.white);
            }
            all[it].setBorder(BorderFactory.createLineBorder(Color.gray, 3));
            all[it].setText(String.valueOf(word.getLetters()[it]));
            }
    }
}
