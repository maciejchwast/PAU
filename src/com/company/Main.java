package com.company;

public class Main {

    public static void main(String[] args) {
        GameLayout gl= new GameLayout();
        Game g = new Game(new Word("kubek"),gl);
        g.play();

    }
}
