package com.codecool.termlib.gridelements;

import com.codecool.termlib.Direction;
import static com.codecool.termlib.Direction.*;
import static com.codecool.termlib.gridelements.Shape.*;

class PipeElement extends GridElement {
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
    Shape nextPermutationOfElement;

    /**
     * Constructor
     *
     * @param shape   Characters enum name
     */
    PipeElement(Shape shape) {
        switch (shape) {
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
             default:
                 this.charCode = 100;
                 this.activeDirections = new Direction[]{RIGHT,LEFT};
                 this.nextPermutationOfElement = HORIZONTAL;
        }
        this.myShape = shape;
    }
    /**
     * Get next permutation
     */
    PipeElement getNextPermutation(Shape shape) {
        return new PipeElement(shape);
    }



    public static void main(String[] args) {
        PipeElement a1 = new PipeElement(VERTICAL);
        PipeElement nextShape = a1.getNextPermutation(a1.nextPermutationOfElement);
        System.out.println(a1.charCode);
        System.out.println(nextShape.charCode);
    }
}
