package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldInput implements ActionListener {
    JButton submit = new JButton("Enter");
    Word inputValue;
    JTextField field = new JTextField();
    TextFieldInput(JPanel p){
        field.setMaximumSize(new Dimension(500,50));
        p.add(field);
        p.add(submit);
        submit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            inputValue = new Word(field.getText());
        }
    }

    public Word getInputValue(){
        return inputValue;
    }
}
