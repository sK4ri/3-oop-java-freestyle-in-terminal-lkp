package com.codecool.termlib;

import com.codecool.termlib.gridelements.GridElement;
import com.codecool.termlib.gridelements.PipeElement;
import com.codecool.termlib.gridelements.Shape;

import java.util.Scanner;

public class Main {

    static Grid tableGrid = new Grid();

    public static void main(String[] args) {
        tableGrid.mainGrid();
        tableGrid.printGrid(tableGrid.table);
    }
        //System.out.println(new PipeElement(Grid.pipeCharList[1]).charCode);
        //System.out.println(tableGrid[7][7].charCode);
}



