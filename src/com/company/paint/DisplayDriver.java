package com.company.paint;

public interface DisplayDriver {
    void setColor(String hex);
    void drawCircle(double x, double y, double diameter);
    double getWidth();
    double getHeight();
}
