package com.company;

import java.util.Scanner;

public class Input {
    Scanner scn = new Scanner(System.in);
    public String get(){
        String result = scn.nextLine();
        if(result.length()==5){
            return result;
        }
        else if(result.length()<5){
            for(int i = 0; i<(5-result.length());i++){
                result = result+"*";
                return result;
            }
        }
        return result;
    }
}
