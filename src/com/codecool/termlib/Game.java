package com.codecool.termlib;

public class Game {
    public static void main(String[] args) {
        GameBoard myBoard = new GameBoard();
        CreateColoredBlock colorBlock = new CreateColoredBlock();
        String[][] myGrid = myBoard.init();
        colorBlock.placeRandomColoredBlock(myGrid);
        myBoard.printBoard(myGrid);
    }
}
