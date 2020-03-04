package com.company;

import com.company.paint.DisplayDriver;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DisplayDriverImpl implements DisplayDriver {

    private final GraphicsContext gc;

    public DisplayDriverImpl(GraphicsContext gc) {
        this.gc = gc;
    }

    @Override
    public void setColor(String hex) {
        gc.setFill(Color.web(hex));
    }

    @Override
    public void drawCircle(double x, double y, double diameter) {
        gc.fillOval(x, y, diameter, diameter);
    }

    @Override
    public double getWidth() {
        return gc.getCanvas().getWidth();
    }

    @Override
    public double getHeight() {
        return gc.getCanvas().getHeight();
    }

}
