package org.fasttrackit;

public class Vehicle {

    //  Class variable (proprietate de clasa), care este valabila pentru toata clasa.
    //  Cu aceasta urmarim toate masinile pe care le creem.

    static int totalCount;

    //    Instance variables. Acestea sunt valabile doar pentru obiectul Vehicle.

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours){
        System.out.println(name + " is accelerating with " + speed + "kph " + " for " + durationInHours+ "h ");

    //      Variabila locala declarata inauntrul unei metode.

        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;

    //      Ce am scris mai sus, prescurtat e ce am scris mai jos.
    //  traveledDistance += distance;

        double usedFuel = mileage * distance / 100;

        System.out.println("Used fuel = " + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel level: " + fuelLevel);
        System.out.println("Traveled distance is " + traveledDistance);

        return distance;

    }
}
