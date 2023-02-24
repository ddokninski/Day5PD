package org.example;

public abstract class Vehicle implements Mobile{
    private int maxSpeed;

    protected Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    protected int getMaxSpeed() {
        return maxSpeed;
    }
    @Override
    public void move() {
        System.out.println("My max speed is " + maxSpeed);
    }

}
