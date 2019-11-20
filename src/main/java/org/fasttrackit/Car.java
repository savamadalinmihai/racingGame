package org.fasttrackit;

// Prin comanda extends, preluam toate proprietatile din Vehicle (is-a)

public class Car extends AutoVehicle {

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }
}
