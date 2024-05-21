package com.labwork2;

/**
 * Circle class that uses the CoordinateBridge to draw a circle using polar coordinates.
 */
public class Circle {
    /**
     * The CoordinateBridge that the Circle uses to draw itself.
     */
    private CoordinateBridge coordinateBridge;

    /**
     * Constructor that sets the CoordinateBridge for the Circle.
     * @param coordinateBridge The CoordinateBridge to use for drawing the Circle.
     */
    public Circle(CoordinateBridge coordinateBridge) {
        this.coordinateBridge = coordinateBridge;
    }

    /**
     * Sets the Ro value of the Circle's CoordinateBridge.
     * @param ro The Ro value to set.
     */
    public void setRo(double ro) {
        coordinateBridge.setRo(ro);
    }

    /**
     * Sets the Phi value of the Circle's CoordinateBridge.
     * @param phi The Phi value to set.
     */
    public void setPhi(double phi) {
        coordinateBridge.setPhi(phi);
    }

    /**
     * Gets the Ro value of the Circle's CoordinateBridge.
     * @return The Ro value of the Circle's CoordinateBridge.
     */
    public double getRo() {
        return coordinateBridge.getRo();
    }

    /**
     * Gets the Phi value of the Circle's CoordinateBridge.
     * @return The Phi value of the Circle's CoordinateBridge.
     */
    public double getPhi() {
        return coordinateBridge.getPhi();
    }

    /**
     * Draws the Circle using the CoordinateBridge.
     */
    public void draw() {
        System.out.println("Drawing Circle at Ro: " + getRo() + ", Phi: " + getPhi());
    }
}
