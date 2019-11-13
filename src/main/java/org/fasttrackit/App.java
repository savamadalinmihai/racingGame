package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {

//    cu cmd+slash pui comentariu pe o linie

    public static void main(String[] args) {
        System.out.println("Welcome to the race!");

        Car carReference = new Car();
        carReference.name = "Dacia";
        carReference.color = "red";
        carReference.mileage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.doorCount = 5;
        carReference.running = false;

        Car car2 = new Car();
        car2.name = "BMW";
        car2.mileage = 14;
        car2.color = null;

//        Concatenarea e lipirea a doua chestii cu +
        System.out.println("The first car's name is: " + carReference.name);
        System.out.println("Its color is: " + carReference.color);
        System.out.println("Its consumption is: " + carReference.mileage);
        System.out.println("Its fuel capacity is: " + carReference.fuelLevel);
        System.out.println("Its max speed is: " + carReference.maxSpeed);
        System.out.println("Its traveled distance is: " + carReference.traveledDistance);
        System.out.println("Its door count is: " + carReference.doorCount);
        System.out.println("Its running state is: " + carReference.running);

        System.out.println(" ");

        System.out.println("Second car's name is: " + car2.name);
        System.out.println("The color is: " + car2.color);
        System.out.println("Its mileage is: " + car2.mileage);
        System.out.println("The fuel level is: " + car2.fuelLevel);
        System.out.println("Its max speed is: " + car2.maxSpeed);
        System.out.println("The door count is: " + car2.doorCount);
        System.out.println("And its running state is: " + car2.running);

        car2.name = "VW";

        System.out.println("  ");

        System.out.println("The new name of the second car is: " + car2.name + ".");

        System.out.println("  ");

/**    Aici, car 3 devine o telecomanda pentru car 2 si reuseste sa modifice comportamentul pentru car 2,
*      chiar daca el se alfa mai sus decat vine modificarea.
 */
        Car car3 = car2;
        car3.name = "Audi";

        System.out.println("Second car's name: " + car2.name);
        System.out.println("Third car's name: " + car3.name);

        Car car4 = null;
        System.out.println(car4.name);


    }
}