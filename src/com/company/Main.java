package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new com.company.Main().execute();

    }

    static void UseCommands() {
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals("exit")) {
            input = sc.next();
            switch (input) {

                case "help":
                    TUI.help();
                    break;
                case "look":
                    TUI.lookAround();
                    break;
                case "exit":
                    TUI.exit();
                    break;
            }
        }

    }

    public void execute() {

        startGame();
        TUI.printMenu();
        Player.createPlayer();
        Room.creatingRooms();

    }
}
