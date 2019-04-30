package com.codecool.termlib.gridelements;

import com.codecool.termlib.Direction;
import static com.codecool.termlib.Direction.*;
import static com.codecool.termlib.gridelements.Shapes.*;

class PipeElement extends GridElement {
    /**
     * Directions in which the element is connected
     * The arrays first element are the directions in which the element is connected
     * 0 is LEFT, 1 is UP, 2 is RIGHT, 3 is DOWN
     */
    Direction[] activeDirections;
    /**
     * Next permutation of pipe element
     */
    private PipeElement nextPermutationOfElement;

    /**
     * Constructor
     *
     * @param shape   Characters enum name
     */
    PipeElement(Shapes shape) {
        switch (shape) {
            case UPRIGHT:
                this.charCode = (char)9491;
                this.activeDirections = new Direction[]{LEFT,DOWN};
                this.nextPermutationOfElement = new PipeElement(UPLEFT);
            case UPLEFT:
                this.charCode = (char)9487;
                this.activeDirections = new Direction[]{RIGHT,DOWN};
                this.nextPermutationOfElement = new PipeElement(DOWNLEFT);
            case DOWNLEFT:
                this.charCode = (char)9495;
                this.activeDirections = new Direction[]{RIGHT,UP};
                this.nextPermutationOfElement = new PipeElement(DOWNRIGHT);
            case DOWNRIGHT:
                this.charCode = (char)9499;
                this.activeDirections = new Direction[]{LEFT,UP};
                this.nextPermutationOfElement = new PipeElement(UPRIGHT);
            case HORIZONTAL:
                this.charCode = (char)9473;
                this.activeDirections = new Direction[]{UP,DOWN};
                this.nextPermutationOfElement = new PipeElement(VERTICAL);
            case VERTICAL:
                this.charCode = (char)9475;
                this.activeDirections = new Direction[]{RIGHT,LEFT};
                this.nextPermutationOfElement = new PipeElement(HORIZONTAL);
        }
    }
    /**
     * Get next permutation
     */
    PipeElement getNextPermutation() {
        return nextPermutationOfElement;
    }



    public static void main(String[] args) {


    }
}
