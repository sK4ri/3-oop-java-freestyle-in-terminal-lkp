package com.codecool.termlib.gridelements;

 // not clear why importing is not necessary

public class BorderElement extends GridElement {
    /**
     * Shape of element
     */
    Shape myShape;

    /**
     * Constructor
     * Setting character values
     * @param shape Characters enum name
     */
    public BorderElement(Shape shape) {
        switch (shape) {
            case UPRIGHT:
                this.charCode = (char) 9491;
                break;
            case UPLEFT:
                this.charCode = (char) 9487;
                break;
            case DOWNLEFT:
                this.charCode = (char) 9495;
                break;
            case DOWNRIGHT:
                this.charCode = (char) 9499;
                break;
            case HORIZONTAL:
                this.charCode = (char) 9473;
                break;
            case VERTICAL:
                this.charCode = (char) 9475;
                break;
        }
        this.myShape = shape;
    }
}
