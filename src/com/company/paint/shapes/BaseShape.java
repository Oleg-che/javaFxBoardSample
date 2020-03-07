package com.company.paint.shapes;

import com.company.paint.DisplayDriver;

import java.util.Random;

public abstract class BaseShape implements Shape {

    protected DisplayDriver displayDriver;
    protected double x;
    protected double y;
    protected double size;
    protected double xSpeed;
    protected double ySpeed;

    public BaseShape(DisplayDriver displayDriver, int x, int y) {
        this.displayDriver = displayDriver;
        this.x = x;
        this.y = y;
        Random random = new Random();
        xSpeed = random.nextInt(5) + 2;
        ySpeed = random.nextInt(2) + 3;
        size = 100;
    }

    @Override
    public void move() {
        if (x <= 0) {
            xSpeed = Math.abs(xSpeed);
        } else if (x + size >= displayDriver.getWidth()) {
            xSpeed = -Math.abs(xSpeed);
        }
        if (y <= 0) {
            ySpeed = Math.abs(ySpeed);
        } else if (y + size >= displayDriver.getHeight()) {
            ySpeed = -Math.abs(ySpeed);
        }
        x += xSpeed;
        y += ySpeed;
    }

}
