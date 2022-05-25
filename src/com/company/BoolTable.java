package com.company;

public class BoolTable {
    private final boolean[] tab;

    public BoolTable(boolean[] tab) {
        this.tab = tab;
    }
    public void printTab(){
        for (boolean b : tab) {
            System.out.print(b + " ");
        }
    }
    public boolean allTrue(){
        boolean result = true;
        for (boolean b : tab) {
            if (!b) {
                result = false;
                break;
            }
        }
        return result;
    }
    public boolean getElement(int elem){
        return tab[elem];
    }
}
