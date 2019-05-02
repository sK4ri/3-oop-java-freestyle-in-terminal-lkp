package com.codecool.termlib;

import com.codecool.termlib.gridelements.*;

public class Main {
    public static void main (String[] args) {
        Grid myGridObject = new Grid();
        Input firstInput = new Input();
        GridElement[][] myGrid = myGridObject.mainGrid();

        myGridObject.printGrid(myGrid);

        int[] field = firstInput.getFieldICoordinate();
        GridElement element = myGridObject.getFieldElement(field, myGrid);
        myGridObject.changeFieldElement(field, element.getNextPermutation(), myGrid);
        myGridObject.printGrid(myGrid);

    }
}

