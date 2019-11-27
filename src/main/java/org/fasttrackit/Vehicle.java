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

    public double accelerate(double speed, double durationInHours) {
        double mileageMultiplier = 1;

        System.out.println(name + " is accelerating with " + speed + "kph " + " for " + durationInHours + "h ");

        if (speed > maxSpeed) {
            System.out.println("Sorry, not enough horsepower.");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Careful, you reached the max speed.");
        } else {
            System.out.println("Valid max speed.");
        }

        if (fuelLevel < 0){
            System.out.println("No fuel left.");
            return 0;
        }

        if (speed > 120){
            System.out.println("Careful! Increased consumption.");

            // aici am declarat un miltiplicator pentru consum, care zice cu cat creste consumul
            // speed / 100 poate fi 1.2 sau 2 sau 4 sau etc.

            mileageMultiplier = speed / 100;
        }

        //      Variabila locala (declarata inauntrul unei metode).

        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;

        System.out.println("Traveled distance is " + traveledDistance);

        //      Ce am scris mai sus, prescurtat e ce am scris mai jos.
        //  traveledDistance += distance;

        double usedFuelWithStandardMileage = mileage * distance / 100;

        System.out.println("Used fuel with standard mileage." + usedFuelWithStandardMileage);

        double usedFuelWithInIncreasedMileage = usedFuelWithStandardMileage * mileageMultiplier;

        System.out.println("Used fuel with " + usedFuelWithInIncreasedMileage);

        System.out.println("Used fuel = " + usedFuelWithStandardMileage);

        fuelLevel -= usedFuelWithInIncreasedMileage;
        System.out.println("Remaining fuel level: " + fuelLevel);


        return distance;

    }
}
