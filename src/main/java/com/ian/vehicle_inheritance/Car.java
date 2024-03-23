package com.ian.vehicle_inheritance;

/**
 *
 * @author Ian Tagano
 */


public class Car extends Vehicle
{
    //since the car class inherited the superclass, he have now the functionality same as the superclass
    public Car(String make, String model, int year)
    {
        //this is super keyword, it is used to pass value to the constructor of the superclass
        super(make, model, year);
    }
    
    
    //below are the abstract methods of the super class but it has now its own functionality
    @Override 
    public void accelerate()
    {
        System.out.println("Car is accelerating");
    }
    
    @Override 
    public void brake()
    {
        System.out.println("Car is braking");
    }
    
    @Override 
    public void honk()
    {
        System.out.println("Car is honking");
    }
}
