package com.labwork2;

/**
 * A class that represents a point in a Cartesian coordinate system.
 */
public class CartesianPoint implements Point {
    /**
     * The x-coordinate of the point.
     */
    private int x;
    /**
     * The y-coordinate of the point.
     */
    private int y;

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
