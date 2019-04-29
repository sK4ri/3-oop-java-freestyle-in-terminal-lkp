package com.codecool.termlib;

import java.io.IOException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {
        // Timer initialization
        int gameTime = 20;
        new Countdown(gameTime);
        System.out.println("Start Game!");
        Scanner myObj = new Scanner(System.in);

        // Game board initialization
        GameBoard myBoard = new GameBoard();
        CreateColoredBlock colorBlock = new CreateColoredBlock();
        String[][] myGrid = myBoard.init();

        //Game board printing
        colorBlock.placeRandomColoredBlock(myGrid);
        myBoard.printBoard(myGrid);

        Input terminalSetup = new Input();
        terminalSetup.raw();
        String characterPressed = myObj.nextLine();
        System.out.println(characterPressed);
    }
}
