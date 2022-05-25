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
        boolean result = false;
        for (boolean b : tab) {
            if (!b) {
                result = true;
                break;
            }
        }
        return result;
    }
}
