package com.codecool.termlib;

public class Main {
    public static void main (String[] args) {
        for (int i = 0; i < Grid.mainGrid().length; i++) {
            for (int j = 0; j < Grid.mainGrid()[i].length; j++){
                System.out.print(Grid.mainGrid()[i][j]);
            }
        System.out.println();
        }
    }
}
