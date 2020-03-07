package com.company.paint.shape;

import com.company.paint.Board;
import com.company.paint.DisplayDriver;

public class CompoundShape implements Shape {

    private CircleShape circle;
    private Square square;
    private DisplayDriver displayDriver;
    private double x;
    private double y;

    public CompoundShape(Board board, DisplayDriver displayDriver, int x, int y) {
        this.displayDriver = displayDriver;
        circle = new CircleShape(board, displayDriver, x, y);
        square = new Square(board, displayDriver, x + 100, y);
    }

    @Override
    public void draw() {
        displayDriver.setColor("#00F");
        circle.draw();
        square.draw();
    }

    @Override
    public void move() {

    }
}
