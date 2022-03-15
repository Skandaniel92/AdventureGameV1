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
        while (!input.equals("exit")) {
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
        public void help(){
            System.out.println("You have the options to either go \n" + "North \n" + "East \n" + "South \n" + "West \n" +
                    "But be carefull! you have to guess where to go! \n" + "Where do you choose to go?");
        }

    }
}
