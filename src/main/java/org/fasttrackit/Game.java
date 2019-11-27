package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start(){
        System.out.println("Starting game.");

        String vehicleName = getVehicleNameFromUser();

        System.out.println("The name you chose is " + vehicleName);

        int numberOfPlayers = getUsersNumber();

        System.out.println("The number of players will be " + numberOfPlayers);

    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getUsersNumber(){
        System.out.println("Please select the number of users.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
