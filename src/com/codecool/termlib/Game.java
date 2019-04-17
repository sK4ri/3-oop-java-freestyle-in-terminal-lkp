package com.codecool.termlib;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Timer initialization
        int gameTime = 20;
        new Countdown(gameTime);
        System.out.println("Start Game!");
        Scanner myObj = new Scanner(System.in);
        String characterPressed = myObj.nextLine();

        // Game board initialization
        GameBoard myBoard = new GameBoard();
        CreateColoredBlock colorBlock = new CreateColoredBlock();
        String[][] myGrid = myBoard.init();

        //Game board printing
        colorBlock.placeRandomColoredBlock(myGrid);
        myBoard.printBoard(myGrid);

    }
}
