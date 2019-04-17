package com.codecool.termlib;

public enum ForegroundColor {
    BLACK("30"),
    RED("31"),
    GREEN("32"),
    BLUE("34"),
    MAGENTA("35");
    private final String number;

    private ForegroundColor(String number) {
        this.number = number;
    }

    public String getColorCode() {
        return number;
    }

}
