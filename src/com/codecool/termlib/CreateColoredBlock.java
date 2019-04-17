package com.codecool.termlib;

import java.util.Random;

public class CreateColoredBlock {
    private static final String[][] COLORS = new String[][]{{"31", "41"}, {"32", "42"}, {"34", "44"}, {"35", "45"}};
    GameBoard dummyBoard = new GameBoard();

    String[][] placeRandomColoredBlock(String[][] grid) {
        String[] randomColor = randomColor();
        dummyBoard.color2x2(grid,
                            randomColor[0], randomColor[1],
                        grid.length / 2,grid.length / 2);
        return grid;
    }

    private String[] randomColor() {
        int randomIndex = new Random().nextInt(COLORS.length);
        return COLORS[randomIndex];
    }
}

