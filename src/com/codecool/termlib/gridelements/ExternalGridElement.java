package com.codecool.termlib.gridelements;


public class ExternalGridElement  {
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

        this.myShape = shape;
    }
}
