package com.ian.vehicle_inheritance;

/**
 *
 * @author Ian Tagano
 */


public class Vehicle_Inheritance 
{

    public static void main(String[] args) 
    {
        Car car = new Car("Toyota", "Camry", 2022);
        Truck truck = new Truck("Ford", "F-2022", 2026);
        Bicycle bike = new Bicycle("Neo", "B-1", 2026);
        
        System.out.println("Car: ");
        car.accelerate();
        car.brake();
        car.honk();
        
        System.out.println("Bike: ");
        bike.accelerate();
        bike.brake();
        bike.honk();
        
        System.out.println("Truck: ");
        truck.accelerate();
        truck.brake();
        truck.honk();
    }
}
