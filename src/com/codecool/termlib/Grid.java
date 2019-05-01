package com.codecool.termlib;

import java.util.HashMap;
import java.util.Random;

import com.codecool.termlib.gridelements.*;


class Grid {

    private static final Shape[] pipeCharList = {Shape.UPLEFT, Shape.UPRIGHT, Shape.DOWNLEFT, Shape.DOWNRIGHT, Shape.HORIZONTAL, Shape.VERTICAL};
    private static final HashMap<Integer, Shape> numberShapes = new HashMap<>(){{    put(1, Shape.ONE);
                                                                                     put(2, Shape.TWO);
                                                                                     put(3, Shape.THREE);
                                                                                     put(4, Shape.FOUR);}};
    private static final Shape[] alph = {Shape.A, Shape.B, Shape.C, Shape.D};

    private GridElement[][] table = new GridElement[8][8];
    private static Random randNum = new Random();

    GridElement[][] mainGrid () {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 && j > 1 && j < 6) {
                    table[i][j] = new GridElement(numberShapes.get(j-1));
                } else if (i == 0 && j < 1 || j > 6) {
                    table[i][j] = new GridElement(Shape.SPACE);
                } else if (j == 0 && i > 1 && i < 6) {
                    table[i][j] = new GridElement(alph[i-2]);
                } else if (j == 0 || i < 1 || i > 6) {
                    table[i][j] = new GridElement(Shape.SPACE);
                } else if (i == 1 && j == 1) {
                    table[i][j] = new GridElement(Shape.UPLEFT);
                } else if (i == 1 && j == 6) {
                    table[i][j] = new GridElement(Shape.UPRIGHT);
                } else if (j == 1 && i == 6) {
                    table[i][j] = new GridElement(Shape.DOWNLEFT);
                } else if (j == 6 && i == 6) {
                    table[i][j] = new GridElement(Shape.DOWNRIGHT);
                } else if (j == 6 || j == 1) {
                    table[i][j] = new GridElement(Shape.VERTICAL);
                } else if (i == 6 || i == 1) {
                    table[i][j] = new GridElement(Shape.HORIZONTAL);
                } else {
                    table[i][j] = new GridElement(pipeCharList[randNum.nextInt(pipeCharList.length)]);
                }
            }
        }
    return table;
    }
    void printGrid(GridElement[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j].charCode);
            }
            System.out.println();
        }
    }
    GridElement getFieldElement(int[] field, GridElement[][] grid) {
        return grid[field[0]][field[1]];
    }

    void changeFieldElement(int[] field, GridElement newElement, GridElement[][] grid) {
        grid[field[0]][field[1]] = newElement;
    }
}


