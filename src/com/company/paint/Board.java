package com.company.paint;

import com.company.paint.shape.CircleShape;
import com.company.paint.shape.CompoundShape;
import com.company.paint.shape.Shape;
import com.company.paint.shape.Square;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final DisplayDriver displayDriver;

    private List<Shape> shapes = new ArrayList<>();

    public Board(DisplayDriver displayDriver) {
        this.displayDriver = displayDriver;
        shapes.add(new CircleShape(this, displayDriver, 10, 10));
        shapes.add(new CircleShape(this, displayDriver, 10, 200));
        shapes.add(new CircleShape(this, displayDriver, 100, 20));
    }

    public void drawFrame() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void move() {
        for (Shape shape : shapes) {
            shape.move();
        }
    }

}
