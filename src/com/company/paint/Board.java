package com.company.paint;

import com.company.paint.shapes.CircleShape;
import com.company.paint.shapes.Shape;
import com.company.paint.shapes.SquareShape;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final DisplayDriver displayDriver;

    private List<Shape> shapes = new ArrayList<>();

    public Board(DisplayDriver displayDriver) {
        this.displayDriver = displayDriver;
        shapes.add(new CircleShape(displayDriver, 10, 10));
        shapes.add(new SquareShape(displayDriver, 50, 100));
        shapes.add(new CircleShape(displayDriver, 100, 300));
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
