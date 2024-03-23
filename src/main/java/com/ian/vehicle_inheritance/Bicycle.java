package com.ian.vehicle_inheritance;

/**
 *
 * @author Ian Tagano
 */


public class Bicycle extends Vehicle
{
    //constructor
    public Bicycle(String make, String model, int year)
    {
        //passing value to the superclass constructor
        super(make, model, year);
    }
    
    //below are the abstract methods of the super class but it has now its own functionality
    @Override 
    public void accelerate()
    {
        System.out.println("Bicycle is accelerating");
    }
    
    @Override 
    public void brake()
    {
        System.out.println("Bicycle is braking");
    }
    
    @Override 
    public void honk()
    {
        System.out.println("Bicycle is honking");
    }
}
