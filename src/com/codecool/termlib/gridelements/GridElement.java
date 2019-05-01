package com.codecool.termlib.gridelements;


import com.codecool.termlib.Direction;

import static com.codecool.termlib.Direction.*;
import static com.codecool.termlib.gridelements.Shape.*;
import static com.codecool.termlib.gridelements.Shape.HORIZONTAL;

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
    /**
     * Directions in which the element is connected
     * The arrays first element are the directions in which the element is connected
     * 0 is LEFT, 1 is UP, 2 is RIGHT, 3 is DOWN
     */
    Direction[] activeDirections;
    /**
     * Shape of element
     */
    public Shape myShape;
    /**
     * Next permutation of pipe element
     */
    public Shape nextPermutationOfElement;

    /**
     * Constructor
     * Setting character values, next permutation shapes and active directions
     * @param shape   Characters enum name
     */
    public GridElement(Shape shape) {
        switch (shape) {
            case SPACE:
                this.charCode = ' ';
            case UPRIGHT:
                this.charCode = (char)9491;
                this.activeDirections = new Direction[]{LEFT,DOWN};
                this.nextPermutationOfElement = UPLEFT;
                break;
            case UPLEFT:
                this.charCode = (char)9487;
                this.activeDirections = new Direction[]{RIGHT,DOWN};
                this.nextPermutationOfElement = DOWNLEFT;
                break;
            case DOWNLEFT:
                this.charCode = (char)9495;
                this.activeDirections = new Direction[]{RIGHT,UP};
                this.nextPermutationOfElement = DOWNRIGHT;
                break;
            case DOWNRIGHT:
                this.charCode = (char)9499;
                this.activeDirections = new Direction[]{LEFT,UP};
                this.nextPermutationOfElement = UPRIGHT;
                break;
            case HORIZONTAL:
                this.charCode = (char)9473;
                this.activeDirections = new Direction[]{UP,DOWN};
                this.nextPermutationOfElement = VERTICAL;
                break;
            case VERTICAL:
                this.charCode = (char)9475;
                this.activeDirections = new Direction[]{RIGHT,LEFT};
                this.nextPermutationOfElement = HORIZONTAL;
                break;
            case A:
                this.charCode = 'A';
                break;
            case B:
                this.charCode = 'B';
                break;
            case C:
                this.charCode = 'C';
                break;
            case D:
                this.charCode = 'D';
                break;
            case ONE:
                this.charCode = '1';
                break;
            case TWO:
                this.charCode = '2';
                break;
            case THREE:
                this.charCode = '3';
                break;
            case FOUR:
                this.charCode = '4';
                break;
        }
        this.myShape = shape;
    }
    /**
     * Get next permutation
     */
    public GridElement getNextPermutation() {
        return new GridElement(nextPermutationOfElement);
    }
}
