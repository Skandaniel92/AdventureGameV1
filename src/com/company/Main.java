package com.company;

import java.util.Scanner;

public class Main {


        startGame();
        printMenu();
        createPlayer();

    public void creatingRooms() {
        Room room1 = new Room("Entrance to the mountain", "You are standing at the entrance to the mountain - decide what you want to do now -->");
        Room room2 = new Room("First room in the mountain", "You are now inside the mountain. It's dark and cold - decide what you want to do next -->");
        Room room3 = new Room("The big room", "You are in a very large and warm room. There is a smell of bonfire and you can hear a crackling sound - decide what you want to do next -->");
        Room room4 = new Room("The cave", "The cave - You have gone down a long stairway and are now in a cave with a lake. You can hear dripping water - decide what you want to do now -->");
        Room room5 = new Room("The mysterious space ", "You are now in a room with a violet light and strange music - decide what you want to do now -->");
        Room room6 = new Room("The room with the stairs ", "This room is completely quiet. There is a bit of reddish light and you can see a staircase - decide what you want to do now -->");
        Room room7 = new Room("The room at the top ", "You have now gone up the stairs, and you are at the top of the mountain - decide what you want to do now -->");
        Room room8 = new Room("Outside ", "You have now come outside and you can walk around the mountain - decide what you want to do now -->");
        Room room9 = new Room("At the end of the mountain ", "You have gone down at the end of the mountain - decide what you want to do now -->");

        room1.setEast(room2);
        room2.setWest(room1);
        room1.setSouth(room4);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room9.setNorth(room6);
        room9.setWest(room8);
        room8.setEast(room9);
        room8.setNorth(room5);
        room8.setWest(room7);
        room5.setSouth(room8);
        room7.setEast(room7);
        room7.setNorth(room4);
        room4.setSouth(room7);
        room4.setNorth(room1);
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
}
