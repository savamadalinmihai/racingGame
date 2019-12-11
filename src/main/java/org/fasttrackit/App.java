package org.fasttrackit;

public class App {

    public static void main(String[] args) throws Exception {

        Game firstGame = new Game();
        firstGame.start();

        String a = "test";
        String b = "test";
        String c = new String ("test");

//      compararea a 2 tipuri de date primitive se face mereu cu ==
//        compararea cu unobiect se face cu .equals
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));

////        method implementation taken from object's class,
////        not from the variable's class
//        Vehicle jokerVehicle = new JokerVehicle();
//        jokerVehicle.setName("Joker");
//        jokerVehicle.setFuelLevel(80);
//        jokerVehicle.accelerate(440, 1);
//
//        System.out.println("Joker's total distance is " + jokerVehicle.getTraveledDistance());
//
////        variable's class determines what methods can be called
////        type casting (specifying the type of object jokerVehicle is, so that we can use the method.
//        ((JokerVehicle) jokerVehicle).fly();
//
//        Car carWithDefaultEngine = new Car();
//
//        System.out.println("Welcome to the race!");
//
////    carReference e modul in care pot accesa informatiile despre masina. E telecomanda.
//
//        Engine carEngine = new Engine();
//        carEngine.setManufacturer("Renault");
//        carEngine.setCapacity(1.5);
//
//        Car carReference = new Car(carEngine);
//        carReference.setName("Dacia");
//        carReference.setColor("Ferrari Red");
//        carReference.setMileage(9.8);
//        carReference.setFuelLevel(60);
//        carReference.setMaxSpeed(200);
//        carReference.setDoorCount(5);
//        carReference.setRunning(false);
//
//
//        System.out.println("Engine details...");
//        System.out.println(carReference.engine.getManufacturer());
//        System.out.println(carReference.engine.getCapacity());
//
//        double accelerationDistance = carReference.accelerate(200,1.2);
//        System.out.println("Acceleration distance is: " + accelerationDistance);
//
//        Mechanic mechanic = new Mechanic();
//        mechanic.repairVehicle(carReference);
//        System.out.println("Total traveled distance after repair: " + carReference.getTraveledDistance());
//
//
//        Engine car2Engine = new Engine();
//        car2Engine.setManufacturer("Bayerische Motoren Werks");
//        car2Engine.setCapacity(2);
//
//
//        Car car2 = new Car(car2Engine);
//        car2.setName("BMW");
//        car2.setMileage(14);
//        car2.setColor(null);
//
///**        Concatenarea e lipirea a doua chestii cu +
//
//        System.out.println("The first car's name is: " + carReference.name);
//        System.out.println("Its color is: " + carReference.color);
//        System.out.println("Its consumption is: " + carReference.mileage);
//        System.out.println("Its fuel capacity is: " + carReference.fuelLevel);
//        System.out.println("Its max speed is: " + carReference.maxSpeed);
//        System.out.println("Its traveled distance is: " + carReference.traveledDistance);
//        System.out.println("Its door count is: " + carReference.doorCount);
//        System.out.println("Its running state is: " + carReference.running);
//
// */
//        System.out.println(car2);
// /**
//        System.out.println("Second car's name is: " + car2.name);
//        System.out.println("The color is: " + car2.color);
//        System.out.println("Its mileage is: " + car2.mileage);
//        System.out.println("The fuel level is: " + car2.fuelLevel);
//        System.out.println("Its max speed is: " + car2.maxSpeed);
//        System.out.println("The door count is: " + car2.doorCount);
//        System.out.println("And its running state is: " + car2.running);
//*/
//
////        car2.setName("VW");
//
///**        System.out.println("  ");
//
//        System.out.println("The new name of the second car is: " + car2.name + ".");
//
//        System.out.println("  ");
// */
//
///**    Aici, car 3 devine o telecomanda pentru car 2 si reuseste sa modifice comportamentul pentru car 2,
//*      chiar daca el se afla mai sus decat vine modificarea.
// */
////        Car car3 = car2;
////        car3.setName("Audi");
//
///**        System.out.println("Second car's name: " + car2.name);
//        System.out.println("Third car's name: " + car3.name);
//
//        Example for null pointer exception
//        Car car4 = null;
//        System.out.println(car4.name);
//
//        System.out.println("Modulo example:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//        System.out.println(4 % 2 == 0);
// */
//
////        System.out.println("Studying class variables (static variables)...");
//        Vehicle vehicle1 = new Vehicle();
//        Vehicle vehicle2 = new Vehicle();
//
//        System.out.println("Total vehicle count from vehicle class: " + Vehicle.totalCount);
//

    }
}