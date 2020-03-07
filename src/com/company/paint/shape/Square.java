package com.company.paint.shape;

import com.company.paint.Board;
import com.company.paint.DisplayDriver;

public class Square extends BaseShape {

    public Square(Board board, DisplayDriver displayDriver, int x, int y) {
        super(board, displayDriver, x, y);
    }

    @Override
    public void draw() {
        displayDriver.setColor("#0F0");
        displayDriver.drawSquare(x, y, size);
    }

}
