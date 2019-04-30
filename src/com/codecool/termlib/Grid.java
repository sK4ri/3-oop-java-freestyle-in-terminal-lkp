package com.codecool.termlib;

import java.util.Random;

class Grid {

    static char UPRIGHT = (char)9491;
    static char UPLEFT = (char)9487;
    static char DOWNRIGHT = (char)9499;
    static char DOWNLEFT = (char)9495;
    static char HORIZONTAL = (char)9473;
    static char VERTICAL = (char)9475;

    static char[] charList = {UPLEFT, UPRIGHT, DOWNLEFT, DOWNRIGHT, HORIZONTAL, VERTICAL};

    static String[] alph = {"A", "B", "C", "D"};

    static String[][] table = new String[8][8];

    static Random randNum = new Random();

    static String[][] mainGrid () {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 && j > 1 && j < 6) {
                    table[i][j] = Integer.toString(j-1);
                } else if (i == 0 && j < 1 || j > 6) {
                    table[i][j] = " ";
                } else if (j == 0 && i > 1 && i < 6) {
                    table[i][j] = alph[i-2];
                } else if (j == 0 || i < 1 || i > 6) {
                    table[i][j] = " ";
                } else if (i == 1 && j == 1) {
                    table[i][j] = Character.toString(UPLEFT);
                } else if (i == 1 && j == 6) {
                    table[i][j] = Character.toString(UPRIGHT);
                } else if (j == 1 && i == 6) {
                    table[i+1][j] = Character.toString(DOWNLEFT);
                } else if (j == 6 && i == 6) {
                    table[i][j] = Character.toString(DOWNRIGHT);
                } else if (j == 6 || j == 1) {
                    table[i][j] = Character.toString(VERTICAL);
                } else if (i == 6 || i == 1) {
                    table[i][j] = Character.toString(HORIZONTAL);
                } else {
                    table[i][j] = Character.toString(charList[randNum.nextInt(charList.length)]);
                }
            }
        }
    return table;
    }
}

