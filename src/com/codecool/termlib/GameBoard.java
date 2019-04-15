package com.codecool.termlib;

class GameBoard {
    private static int WIDTH = 20;
    private static int HEIGHT = 20;
    private static String[][] grid =  new String[HEIGHT][WIDTH];
    private static String fillChar = Character.toString('\u2588');
    public void init() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i == 0 && j > 0 && j < grid.length - 1) {
                    grid[i][j] = "\u001B[31;41m" + fillChar;
                }
                else if (i == grid.length - 1 && j > 0 && j < grid.length - 1) {
                    grid[i][j] = "\u001B[34;44m" + fillChar;
                }
                else if (j == 0 && i > 0 && i < grid.length - 1) {
                    grid[i][j] = "\u001B[33;43m" + fillChar;
                }
                else if (j == grid.length - 1 && i > 0 && i < grid.length - 1) {
                    grid[i][j] = "\u001B[32;42m" + fillChar;
                }
                else { grid[i][j] = "\u001B[30;40m" + fillChar; }
            }
        }
        for (String[] i:grid) {
            for (String j: i) {
                System.out.print(j);
                System.out.print(' ');
            }
            System.out.print("\u001B[0m" + "\n"); // need to reset background for last chars in line
        }
    }
}