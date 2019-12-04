package org.fasttrackit;

import com.sun.codemodel.internal.JArray;

import java.util.Scanner;

public class Game {
    private Track[]tracks = new Track[3];

    public void start(){
        System.out.println("Starting game.");

        initializeTracks();
        displayTracks();

        String vehicleName = getVehicleNameFromUser();

        System.out.println("The name you chose is " + vehicleName);

        int numberOfPlayers = getUsersNumber();

        System.out.println("The number of players will be " + numberOfPlayers);

    }

    private void initializeTracks(){
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLength(4.2);
        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Eboladrome");
        track2.setLength(542);
        tracks[1] = track2;
    }

    private void displayTracks(){
        System.out.println("Available tracks: ");

//        for loop
         for (int i = 0; i < tracks.length; i++){
             if (tracks[i] != null) {
                 System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLength() + "km.");
             }

         }
    }

    private String getVehicleNameFromUser(){
        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getUsersNumber(){
        System.out.println("Please select the number of users.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
