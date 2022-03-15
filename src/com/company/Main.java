package com.company;

public class Main {


    public static void main(String[] args) {
        Room room1 = new Room("1", "blabla");
        Room room2 = new Room("2", "blabla");
        Room room3 = new Room("3", "blabla");
        Room room4 = new Room("4", "blabla");
        Room room5 = new Room("5", "blabla");
        Room room6 = new Room("6", "blabla");
        Room room7 = new Room("7", "blabla");
        Room room8 = new Room("8", "blabla");
        Room room9 = new Room("9", "blabla");

        startGame();
        printMenu();

    }
    //måske noget vi kan bruge
    static void UseCommands() {
        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals("Close")) {
            input = sc.next();
            switch (input) {


                case "commands":
                    PlayerActions.ShowCommands();
                    break;
                case "inventory":
                    PlayerActions.ShowInventory();
                    break;
                case "equipment":
                    PlayerActions.ShowEquipment();
                    break;
                case "spawnItem":
                    Item.SpawnItem();
                    break;
                case "addItem":

                case "close":
                    sc.close();
                    break;
            }
        }

    }
}
