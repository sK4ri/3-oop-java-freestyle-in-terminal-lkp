package com.codecool.termlib;

class GameBorad {
    private static int WIDTH = 50;
    private static int HEIGHT = 50;
    private static String[][] grid = String[HEIGHT][WIDTH];
    public void init() {
        for (int i=0;i<grid.length;i++) {
            for (int j=0;grid[j].length;j++) {
                if (i==0 || i==grid.length || j==0 || j==grid.length) {
                    grid[i][j] = Character.toString(0x2586);
                }
            }
        }
    public static void main(String[] args) {
        init();
    }
}