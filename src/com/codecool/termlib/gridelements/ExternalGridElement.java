package com.codecool.termlib.gridelements;


public class ExternalGridElement extends GridElement {
    /**
     * Shape of element
     */
    Shape myShape;

    /**
     * Constructor
     * Setting character values
     * @param shape Characters enum name
     */
    public ExternalGridElement(Shape shape) {
        switch (shape) {
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
}
