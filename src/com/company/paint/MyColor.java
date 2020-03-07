package com.company.paint;

public enum MyColor {

    RED("#FF0000"), GREEN("#00FF00"), BLUE("#00F"), BLACK("#000"), PURPLE("#b71dcf");

    private String color;

    MyColor(String color) {
        this.color = color;
    }

    public String toHex() {
        return color;
    }

}
