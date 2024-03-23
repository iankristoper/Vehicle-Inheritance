package com.ian.vehicle_inheritance;

/**
 *
 * @author Ian Tagano
 */

public class Truck extends Vehicle
{
    //constructor
    public Truck(String make, String model, int year)
    {
        //passing value to the superclass constructor
        super(make, model, year);
    }
    
    //below are the abstract methods of the super class but it has now its own functionality
    @Override 
    public void accelerate()
    {
        System.out.println("Truck is accelerating");
    }
    
    @Override 
    public void brake()
    {
        System.out.println("Truck is braking");
    }
    
    @Override 
    public void honk()
    {
        System.out.println("Truck is honking");
    }
}
