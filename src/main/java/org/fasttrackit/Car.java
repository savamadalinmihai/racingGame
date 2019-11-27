package org.fasttrackit;

// Prin comanda extends, preluam toate proprietatile din Vehicle (is-a)

public class Car extends AutoVehicle {

    private int doorCount;

    public Car(Engine engine) {
        super(engine);
    }
//  Asta se numeste constructor overloading. Adaugarea mai multor constructori in aceeasi clasa.
//  Ne ajuta sa scriem mai usor cod. Putem avea un constructor care sa ne oblige sa aduaugam text nou sau
//                          un constructor care sa nu ne oblige, astfel putem sa le folosim pe oricare dintre ele.

    public Car() {
        this(new Engine());
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
