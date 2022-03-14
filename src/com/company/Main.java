package com.company;

public class Main {


    public static void main(String[] args) {

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
