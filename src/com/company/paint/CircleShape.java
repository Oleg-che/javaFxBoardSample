package com.company.paint;

import java.util.Random;

public class CircleShape implements Shape {

    private DisplayDriver displayDriver;
    private double x;
    private double y;
    private double diameter = 100;

    private double xSpeed;
    private double ySpeed;

    public CircleShape(DisplayDriver displayDriver, int x, int y) {
        this.displayDriver = displayDriver;
        this.x = x;
        this.y = y;
        Random random = new Random();
        xSpeed = random.nextInt(5) + 2;
        ySpeed = random.nextInt(2) + 3;
    }

    @Override
    public void draw() {
        displayDriver.setColor("#F00");
        displayDriver.drawCircle(x, y, diameter);
    }

    @Override
    public void move() {
        if (x <= 0) {
            xSpeed = Math.abs(xSpeed);
        } else if (x + diameter >= displayDriver.getWidth()) {
            xSpeed = -Math.abs(xSpeed);
        }
        if (y <= 0) {
            ySpeed = Math.abs(ySpeed);
        } else if (y + diameter >= displayDriver.getHeight()) {
            ySpeed = -Math.abs(ySpeed);
        }
        x += xSpeed;
        y += ySpeed;
    }

}
