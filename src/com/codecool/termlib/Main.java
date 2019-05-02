package com.codecool.termlib;

import com.codecool.termlib.gridelements.*;

public class Main {
    public static void main (String[] args) {
        Grid myGridObject = new Grid();
        GridElement[][] myGrid = myGridObject.mainGrid();
        myGridObject.printGrid(myGrid);
        Input firstInput = new Input();
        int[] field = firstInput.getFieldICoordinate();
        GridElement element = myGridObject.getFieldElement(field, myGrid);
        System.out.println(element.myShape);
        myGridObject.changeFieldElement(field, element.getNextPermutation(), myGrid);

        myGridObject.printGrid(myGrid);

    }
}

