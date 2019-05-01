package com.codecool.termlib.gridelements;


public class GridElement {
    /**
     * Character codes for the pipe elements of same shape
     */
    public char charCode;
    /**
     * Coordinates of element
     *  coordinates[0] stands for rows (i)
     * coordinates[1] stands for columns (j)
     */
    int[] coordinates = new int[2];
    /**
     * Character code for default grid element is space " "
     */
    public GridElement() {
        this.charCode = ' ';
    }
}
