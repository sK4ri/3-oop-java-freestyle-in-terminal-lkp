package com.codecool.termlib;

import java.lang.*;
import java.util.Random;


class Grid {

    static char UPRIGHT = (char)9491;
    static char UPLEFT = (char)9487;
    static char DOWNRIGHT = (char)9499;
    static char DOWNLEFT = (char)9495;
    static char HORIZONTAL = (char)9473;
    static char VERTICAL = (char)9475;

    static char[] charList = {UPLEFT, UPRIGHT, DOWNLEFT, DOWNRIGHT, HORIZONTAL, VERTICAL};

    static Random randNum = new Random();

    static void mainGrid () {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(UPLEFT);
                } else if (i == 0 && j == 6) {
                    System.out.print(UPRIGHT);
                } else if (j == 0 && i == 6) {
                    System.out.print(DOWNLEFT);
                } else if (j == 6 && i == 6) {
                    System.out.print(DOWNRIGHT);
                } else if (j == 6 || j == 0) {
                    System.out.print(VERTICAL);
                } else if (i == 6 || i == 0){
                    System.out.print(HORIZONTAL);
                } else {
                    System.out.print(charList[randNum.nextInt(charList.length)]);
                }
            }
            System.out.println();
        }
    }
}

