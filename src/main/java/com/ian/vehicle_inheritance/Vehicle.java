package com.ian.vehicle_inheritance;

/**
 *
 * @author Ian Tagano
 */

public abstract class Vehicle 
{
    //private attributes that can be used for all the subclass
    private String make;
    private String model;
    private int year;
    
    
    //constructor for initializing values 
    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    
    //getters 
    public String make()
    {
        return make;
    }
    
    public String model()
    {
        return model;
    }
    
    public int year()
    {
        return year;
    }
    
    
    //abstract methods, it is abstract so that each subclass has thier own unique implementation but same methods
    public abstract void accelerate();
    public abstract void brake();
    public abstract void honk();
    
}
