package org.fasttrackit;

public class Vehicle {

    //  Class variable (proprietate de clasa), care este valabila pentru toata clasa.
    //  Cu aceasta urmarim toate masinile pe care le creem.

    static int totalCount;

    //    Instance variables. Acestea sunt valabile doar pentru obiectul Vehicle.

    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed){
        return accelerate(speed, 1);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() { return maxSpeed; }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
