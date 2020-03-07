package com.company.paint.shape;

import com.company.paint.Board;
import com.company.paint.DisplayDriver;

import java.util.Random;

public class CircleShape extends BaseShape implements Shape {

    public CircleShape(Board board, DisplayDriver displayDriver, int x, int y) {
        super(board, displayDriver, x, y);
    }

    @Override
    public void draw() {
        displayDriver.setColor(color.toHex());
        displayDriver.drawCircle(x, y, size);
    }

}
