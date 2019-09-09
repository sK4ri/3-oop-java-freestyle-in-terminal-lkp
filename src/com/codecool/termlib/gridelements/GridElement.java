package com.codecool.termlib.gridelements;


import com.codecool.termlib.Direction;

import java.util.HashMap;

import static com.codecool.termlib.Direction.*;
import static com.codecool.termlib.gridelements.Shape.*;
import static com.codecool.termlib.gridelements.Shape.HORIZONTAL;

public class GridElement {
    /**
     * Character codes for the pipe elements of same shape
     */
    public char charCode;
    /**
     * Character code for default grid element is space " "
     */
    /**
     * Directions in which the element is connected
     * The arrays first element are the directions in which the element is connected
     * 0 is LEFT, 1 is UP, 2 is RIGHT, 3 is DOWN
     */
    public HashMap<Direction, Direction> activeDirections;
    /**
     * Shape of element
     */
    public Shape myShape;
    /**
     * Next permutation of pipe element
     */
    public Shape nextPermutationOfElement;
    /**
     * Tells if element is connected
     */
    public boolean isConnected = false;
    /**
     * Constructor
     * Setting character values, next permutation shapes and active directions
     * @param shape   Characters enum name
     */
    public GridElement(Shape shape) {
        switch (shape) {
            case SPACE:
                this.charCode = ' ';
                break;
            case UPRIGHT:
                this.charCode = (char)9491;
                this.activeDirections = new HashMap<>(){{put(LEFT, RIGHT);put(DOWN,UP);}};
                this.nextPermutationOfElement = UPLEFT;
                break;
            case UPLEFT:
                this.charCode = (char)9487;
                this.activeDirections = new HashMap<>(){{put(RIGHT, LEFT);put(DOWN,UP);}};
                this.nextPermutationOfElement = DOWNLEFT;
                break;
            case DOWNLEFT:
                this.charCode = (char)9495;
                this.activeDirections = new HashMap<>(){{put(RIGHT, LEFT);put(UP,DOWN);}};
                this.nextPermutationOfElement = DOWNRIGHT;
                break;
            case DOWNRIGHT:
                this.charCode = (char)9499;
                this.activeDirections = new HashMap<>(){{put(LEFT, RIGHT);put(UP,DOWN);}};
                this.nextPermutationOfElement = UPRIGHT;
                break;
            case HORIZONTAL:
                this.charCode = (char)9473;
                this.activeDirections = new HashMap<>(){{put(RIGHT, LEFT);put(LEFT,RIGHT);}};
                this.nextPermutationOfElement = VERTICAL;
                break;
            case VERTICAL:
                this.charCode = (char)9475;
                this.activeDirections = new HashMap<>(){{put(UP,DOWN);put(DOWN,UP);}};
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
