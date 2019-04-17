package com.codecool.termlib;

public class Game {
    public static void main(String[] args) {
        int gameTime = 6;
        new Countdown(gameTime);
        System.out.println("Start Game!");
        GameBoard myBoard = new GameBoard();
        CreateColoredBlock colorBlock = new CreateColoredBlock();
        String[][] myGrid = myBoard.init();
        colorBlock.placeRandomColoredBlock(myGrid);
        myBoard.printBoard(myGrid);
    }
}
