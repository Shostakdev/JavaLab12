package com.labwork2;

/**
 * Main
 */
public class Main {
    /**
     * Main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Point point = new CartesianPoint();
        CoordinateBridge bridge = new CartesianCoordinateBridge(point);
        Circle circle = new Circle(bridge);

        circle.setRo(5.0);
        circle.setPhi(Math.PI / 4);

        circle.draw();  // Output: Drawing Circle at Ro: 5.0, Phi: 0.7853981633974483

        // The point can still be used in Cartesian coordinates
        // Output: Point X: 3, Y: 3
        System.out.println("Point X: " + point.getX() + ", Y: " + point.getY());
    }
}