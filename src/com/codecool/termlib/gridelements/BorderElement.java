package com.codecool.termlib.gridelements;

 // not clear why importing is not necessary

public class BorderElement  {
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
        this.myShape = shape;
    }
}
