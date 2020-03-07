package com.company.paint.shapes;

import com.company.paint.DisplayDriver;

public class CircleShape extends BaseShape implements Shape {

    public CircleShape(DisplayDriver displayDriver, int x, int y) {
        super(displayDriver, x, y);
    }

    @Override
    public void draw() {
        displayDriver.setColor("#F00");
        displayDriver.drawCircle(x, y, size);
    }

}
