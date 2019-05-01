package com.codecool.termlib.gridelements;


import com.codecool.termlib.Direction;
import static com.codecool.termlib.Direction.*;
import static com.codecool.termlib.gridelements.Shape.*;

public class PipeElement {
    /**
     * Directions in which the element is connected
     * The arrays first element are the directions in which the element is connected
     * 0 is LEFT, 1 is UP, 2 is RIGHT, 3 is DOWN
     */
    Direction[] activeDirections;
    /**
     * Shape of element
     */
    Shape myShape;
    /**
     * Next permutation of pipe element
     */
    public Shape nextPermutationOfElement;

    /**
     * Constructor
     * Setting character values, next permutation shapes and active directions
     * @param shape   Characters enum name
     */

}
