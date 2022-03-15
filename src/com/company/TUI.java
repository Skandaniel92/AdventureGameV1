package com.company;

import java.util.Scanner;

public class TUI {

    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game ___ if you wish to start, please create a player");
        System.out.println("If you wish to exit the game... sad. \n" + "Type exit");
        String userInput = scanner.nextLine();
        if (userInput.equals("exit")) {
            exit();
        }

    }

    public static void help() {
        System.out.println("You have the options to either go \n" + "North \n" + "East \n" + "South \n" + "West \n" +
                "But be carefull! you have to guess where to go!");
    }

    public static void exit() {
        System.out.println("You are now exiting the game...");
        System.exit(0);
    }

    public void lookAround() {
        System.out.println(currentRoom.getDescription);

    }

}
