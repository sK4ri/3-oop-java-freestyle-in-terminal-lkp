package com.codecool.termlib;


class GameBoard {
    private static int WIDTH = 20;
    private static int HEIGHT = 20;
    private static String[][] grid =  new String[HEIGHT][WIDTH];
    private static String fillChar = Character.toString('\u2588');
    public void init() {
        for (int i = 1; i < grid.length; i+=2) {
            for (int j = 1; j < grid.length; j+=2) {
                if (i == 1 && j > 1 && j < grid.length - 2) {
                    grid[i][j] = "\u001B[31;41m" + fillChar;
                    grid[i-1][j] = "\u001B[31;41m" + fillChar;
                    grid[i][j-1] = "\u001B[31;41m" + fillChar;
                    grid[i-1][j-1] = "\u001B[31;41m" + fillChar;
                }
                else if (i == grid.length - 1 && j > 1 && j < grid.length - 2) {
                    grid[i][j] = "\u001B[32;42m" + fillChar;
                    grid[i-1][j] = "\u001B[32;42m" + fillChar;
                    grid[i][j-1] = "\u001B[32;42m" + fillChar;
                    grid[i-1][j-1] = "\u001B[32;42m" + fillChar;
                }
                else if (j == 1 && i > 1 && i < grid.length - 2) {
                    grid[i][j] = "\u001B[35;45m" + fillChar;
                    grid[i][j-1] = "\u001B[35;45m" + fillChar;
                    grid[i-1][j] = "\u001B[35;45m" + fillChar;
                    grid[i-1][j-1] = "\u001B[35;45m" + fillChar;
                }
                else if (j == grid.length - 1 && i > 1 && i < grid.length - 2) {
                    grid[i][j] = "\u001B[34;44m" + fillChar;
                    grid[i][j-1] = "\u001B[34;44m" + fillChar;
                    grid[i-1][j] = "\u001B[34;44m" + fillChar;
                    grid[i-1][j-1] = "\u001B[34;44m" + fillChar;
                }
                else {
                    grid[i][j] = "\u001B[30;40m" + fillChar;
                    grid[i-1][j] = "\u001B[30;40m" + fillChar;
                    grid[i][j-1] = "\u001B[30;40m" + fillChar;
                    grid[i-1][j-1] = "\u001B[30;40m" + fillChar;
                }
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