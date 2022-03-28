package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class TUI {

    private static Player player;
    private static Map map;
    private boolean isAlive;

    public static void printMenu() {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Welcome to the Adventure game! \nIf you wish to start, please create a player");
        player.setPlayerName(playerName);
        System.out.println("If you wish to exit the game... sad. \n" + "Type exit");
        String userInput = scanner.nextLine();
        if (userInput.equals("exit")) {
            exit();
        }

    }

    public static void useCommands() {
        System.out.println("COMMANDS:");
        System.out.println("\"Look\" ");
        System.out.println("\"Take\" take any item avaliable");
        System.out.println("\"Drop\" drop your item");
        System.out.println("\"Inventory\" See what in your backpack");
        System.out.println("\"Health\"  Health status");
        System.out.println("\"Show command bar\" Game instructions");
        System.out.println("\"Exit\" Quit game");
        System.out.println("Directions:\n\"Go north\"\n\"Go south\"\n\"Go east\"\n\"Go west\"");

    }


    public static void startGame() {
        map = new Map();
        player = new Player();
        map.createRooms();
        printMenu();
        useCommands();
        player.setCurrentRoom(map.getCurrentRoom());
    }


        public static void exit () {
            System.out.println("You are now exiting the game...");
            System.exit(0);
        }

        public static void lookAround () {
            System.out.println(player.getCurrentRoom().getName());
            System.out.println(player.getCurrentRoom().getDescription());

            boolean result = player.getCurrentRoom().getItems().isEmpty();
            if (result == true) {
                System.out.println("There is no items in this room");
            } else
                System.out.println("There is the following items:");

            //StringBuilder sb = new StringBuilder();
            //for (Item item : player.getCurrentRoom().getItems()) {
            //   String itemNameFirstLetterCapitalised = capitaliseFirstLetterItem(item) + ": " + item.getDescription() + "\n";
            //   sb.append(itemNameFirstLetterCapitalised);
        }
        //System.out.println(sb);


        public void showBackpackInventory (ArrayList < Item > backpackPlayer) {
            for (Item item : backpackPlayer) {
                //sout?
            }
        }

    }



