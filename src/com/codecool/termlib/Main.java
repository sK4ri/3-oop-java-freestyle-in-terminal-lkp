package com.codecool.termlib;

import com.codecool.termlib.gridelements.*;

public class Main {
    public static void main (String[] args) {
        // Clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Initialize game board
        Grid myGridObject = new Grid();
        Input firstInput = new Input();
        GridElement[][] myGrid = myGridObject.mainGrid();
        myGridObject.printGrid(myGrid);

        // Countdown
        int gameTime = 60;
        new Countdown(gameTime);

        // Game loop
        int[] field;
        while (true) {
            field = firstInput.getFieldICoordinate();
            System.out.print("\033[H\033[2J");
            System.out.flush();
            GridElement element = myGridObject.getFieldElement(field, myGrid);
            myGridObject.changeFieldElement(field, element.getNextPermutation(), myGrid);
            myGridObject.printGrid(myGrid);
        }
    }
}

