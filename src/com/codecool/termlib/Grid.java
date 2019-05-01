package com.codecool.termlib;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import com.codecool.termlib.gridelements.GridElement;
import com.codecool.termlib.gridelements.PipeElement;
import com.codecool.termlib.gridelements.Shape;


class Grid {

    static Scanner row = new Scanner(System.in);
    static Scanner column = new Scanner(System.in);


    static Shape[] pipeCharList = {Shape.UPLEFT, Shape.UPRIGHT, Shape.DOWNLEFT, Shape.DOWNRIGHT, Shape.HORIZONTAL, Shape.VERTICAL};
    static HashMap<Integer, Shape> numberShapes = new HashMap<>(){{ put(1, Shape.ONE);
        put(2, Shape.TWO);
        put(3, Shape.THREE);
        put(4, Shape.FOUR);}};

    static Shape[] alph = {Shape.A, Shape.B, Shape.C, Shape.D};

    GridElement[][] table = new GridElement[8][8];
    static Random randNum = new Random();

    GridElement[][] mainGrid () {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 && j > 1 && j < 6) {
                    table[i][j] = new PipeElement(numberShapes.get(j-1));
                } else if (i == 0 && j < 1 || j > 6) {
                    table[i][j] = new GridElement();
                } else if (j == 0 && i > 1 && i < 6) {
                    table[i][j] = new PipeElement(alph[i-2]);
                } else if (j == 0 || i < 1 || i > 6) {
                    table[i][j] = new GridElement();
                } else if (i == 1 && j == 1) {
                    table[i][j] = new PipeElement(Shape.UPLEFT);
                } else if (i == 1 && j == 6) {
                    table[i][j] = new PipeElement(Shape.UPRIGHT);
                } else if (j == 1 && i == 6) {
                    table[i][j] = new PipeElement(Shape.DOWNLEFT);
                } else if (j == 6 && i == 6) {
                    table[i][j] = new PipeElement(Shape.DOWNRIGHT);
                } else if (j == 6 || j == 1) {
                    table[i][j] = new PipeElement(Shape.VERTICAL);
                } else if (i == 6 || i == 1) {
                    table[i][j] = new PipeElement(Shape.HORIZONTAL);
                } else {
                    table[i][j] = new PipeElement(pipeCharList[randNum.nextInt(pipeCharList.length)]); //TODO change to GridElement
                }
            }
        }
        return table;
    }
    void printGrid(GridElement[][] grid) {
        for (GridElement[] row : grid){
            for (GridElement elem : row){
                System.out.print(elem.charCode);
            }
            System.out.println();
        }
        findChar(table);
    }

    void findChar(GridElement[][] tableGrid){

        String rowPick = row.nextLine().toUpperCase();
        String colPick = column.nextLine();

        for (int i = 2; i < tableGrid.length-1; i++) {
            for (int j = 2; j < tableGrid[0].length-1; j++) {
                if (rowPick.indexOf(tableGrid[i][0].charCode) != -1 && colPick.indexOf(tableGrid[0][j].charCode) != -1) {
                    if (tableGrid[i][j].charCode == (char) 9473) {
                        tableGrid[i][j] = new PipeElement(Shape.VERTICAL);
                    } else if (tableGrid[i][j].charCode == (char) 9475) {
                        tableGrid[i][j] = new PipeElement(Shape.HORIZONTAL);
                    } else if (tableGrid[i][j].charCode == (char) 9487) {
                        tableGrid[i][j] = new PipeElement(Shape.UPRIGHT);
                    } else if (tableGrid[i][j].charCode == (char) 9491) {
                        tableGrid[i][j] = new PipeElement(Shape.DOWNRIGHT);
                    } else if (tableGrid[i][j].charCode == (char) 9499) {
                        tableGrid[i][j] = new PipeElement(Shape.DOWNLEFT);
                    } else if (tableGrid[i][j].charCode == (char) 9495) {
                        tableGrid[i][j] = new PipeElement(Shape.UPLEFT);
                    }
                }
            }
        }
        printGrid(tableGrid);
    }
}


