package com.codecool.termlib;

import java.util.HashMap;
import java.util.Random;

import com.codecool.termlib.gridelements.*;


class Grid {

    /**
     * Creates the main grid table for the game
     */
    private static final Shape[] pipeCharList = {Shape.UPLEFT, Shape.UPRIGHT, Shape.DOWNLEFT, Shape.DOWNRIGHT, Shape.HORIZONTAL, Shape.VERTICAL};
    private static final HashMap<Integer, Shape> numberShapes = new HashMap<>() {{
        put(1, Shape.ONE);
        put(2, Shape.TWO);
        put(3, Shape.THREE);
        put(4, Shape.FOUR);
    }};
    private static final Shape[] alph = {Shape.A, Shape.B, Shape.C, Shape.D};

    private GridElement[][] table = new GridElement[8][8];
    private static Random randNum = new Random();

    GridElement[][] mainGrid() {
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 0 && j > 1 && j < 6) {
                    table[i][j] = new GridElement(numberShapes.get(j - 1));
                } else if (i == 0 && j < 1 || j > 6) {
                    table[i][j] = new GridElement(Shape.SPACE);
                } else if (j == 0 && i > 1 && i < 6) {
                    table[i][j] = new GridElement(alph[i - 2]);
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

    /**
     * Prints the game table grid
     * @param grid
     */
    void printGrid(GridElement[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j].isConnected) {
                    System.out.print((char) 27 + "[34m");
                } else {
                    System.out.print((char) 27 + "[39m");
                }
                System.out.print(grid[i][j].charCode);
            }
            System.out.println();
        }
    }

    /**
     * Gets the grid elements
     * @param field
     * @param grid
     * @return
     */
    GridElement getFieldElement(int[] field, GridElement[][] grid) {
        return grid[field[0]][field[1]];
    }

    /**
     * Rotates the given grid element
     * @param field
     * @param newElement
     * @param grid
     */
    void changeFieldElement(int[] field, GridElement newElement, GridElement[][] grid) {
        grid[field[0]][field[1]] = newElement;
    }

    /**
     * Checks if the grid elements have connection to any nearby element
     * @param grid
     */
    void checkConnectionOfGridElement(GridElement[][] grid) {
        for (int i = 2; i < grid.length - 2; i++) {
            for (int j = 2; j < grid[i].length - 2; j++) {
                grid[i][j].isConnected = false;
                if (grid[i][j].activeDirections.containsKey(Direction.LEFT)) {
                    if (grid[i][j - 1].activeDirections.containsKey(Direction.RIGHT)) {
                        grid[i][j].isConnected = true;
                    }
                }
                if (grid[i][j].activeDirections.containsKey(Direction.RIGHT)) {
                    if (grid[i][j + 1].activeDirections.containsKey(Direction.LEFT)) {
                        grid[i][j].isConnected = true;
                    }
                }
                if (grid[i][j].activeDirections.containsKey(Direction.DOWN)) {
                    if (grid[i + 1][j].activeDirections.containsKey(Direction.UP)) {
                        grid[i][j].isConnected = true;
                    }
                }
                if (grid[i][j].activeDirections.containsKey(Direction.UP)) {
                    if (grid[i - 1][j].activeDirections.containsKey(Direction.DOWN)) {
                        grid[i][j].isConnected = true;
                    }
                }
            }
        }
    }
}


