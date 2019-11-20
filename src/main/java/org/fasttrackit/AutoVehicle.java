package org.fasttrackit;

public class AutoVehicle    extends Vehicle{

//    has-a relationship
    Engine engine;

//    aceasta este o constrangere.
    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Creating an auto-vehicle");
    }
}

