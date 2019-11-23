package org.fasttrackit;

public class AutoVehicle    extends Vehicle{

    //      Relatia de tip extends este de tip has-a
    Engine engine;

    //      Aceasta este o constrangere.
    public AutoVehicle(Engine engine) {
        this.engine = engine;
        System.out.println("Creating an auto-vehicle");
    }
}

