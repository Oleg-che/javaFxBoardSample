package com.company.paint;

import com.company.Const;
import com.company.paint.shape.CircleShape;
import com.company.paint.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final DisplayDriver displayDriver;

    private List<Shape> shapes = new ArrayList<>();

    public Board(DisplayDriver displayDriver) {
        this.displayDriver = displayDriver;
        for (int i = 0; i < Const.SHAPE_COUNT; i++) {
            shapes.add(new CircleShape(this, displayDriver, 10, 10));
        }
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

    public List<Shape> getShapes() {
        return shapes;
    }
}
