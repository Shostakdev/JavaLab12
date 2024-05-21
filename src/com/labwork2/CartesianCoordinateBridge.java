package com.labwork2;

/**
 * Class that implements the CoordinateBridge interface and provides methods for converting polar coordinates to Cartesian coordinates.
 */
public class CartesianCoordinateBridge implements CoordinateBridge {
    /**
     * Point object that stores the Cartesian coordinates.
     */
    private Point point;

    /**
     * Constructor that initializes the point object.
     * @param point Point object that stores the Cartesian coordinates.
     */
    public CartesianCoordinateBridge(Point point) {
        this.point = point;
    }

    @Override
    public void setRo(double ro) {
        int x = (int) (ro * Math.cos(getPhi()));
        int y = (int) (ro * Math.sin(getPhi()));
        point.setX(x);
        point.setY(y);
    }

    @Override
    public void setPhi(double phi) {
        double ro = getRo();
        int x = (int) (ro * Math.cos(phi));
        int y = (int) (ro * Math.sin(phi));
        point.setX(x);
        point.setY(y);
    }

    @Override
    public double getRo() {
        return Math.sqrt(point.getX() * point.getX() + point.getY() * point.getY());
    }

    @Override
    public double getPhi() {
        return Math.atan2(point.getY(), point.getX());
    }
}
