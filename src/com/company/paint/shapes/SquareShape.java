package com.company.paint.shapes;

import com.company.paint.DisplayDriver;

public class SquareShape extends BaseShape implements Shape {

    public SquareShape(DisplayDriver displayDriver, int x, int y) {
        super(displayDriver, x, y);
    }

    @Override
    public void draw() {
        displayDriver.setColor("#0F0");
        displayDriver.drawSquare(x, y, size);
    }

}
