package com.company.paint.shapes;

import com.company.paint.Board;
import com.company.paint.DisplayDriver;

public class CircleShape extends BaseShape implements Shape {

    public CircleShape(Board board, DisplayDriver displayDriver, int x, int y) {
        super(board, displayDriver, x, y);
    }

    @Override
    public void draw() {
        displayDriver.setColor("#F00");
        displayDriver.drawCircle(x, y, size);
    }

}
