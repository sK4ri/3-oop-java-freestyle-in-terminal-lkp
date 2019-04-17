package com.codecool.termlib;

public class Game {
    public static void main(String[] args) {
        // Timer initialization
        int gameTime = 6;
        new Countdown(gameTime);
        System.out.println("Start Game!");

        // Game board initialization
        GameBoard myBoard = new GameBoard();
        CreateColoredBlock colorBlock = new CreateColoredBlock();
        String[][] myGrid = myBoard.init();

        //Game board printing
        colorBlock.placeRandomColoredBlock(myGrid);
        myBoard.printBoard(myGrid);
        Input checkInputs = new Input();
        System.out.print(checkInputs);

    }
}
