package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private int HP = 100;
    private String playerName;
    private final ArrayList<Item> backpackPlayer = new ArrayList<>();
    private Room currentRoom;

    public void setHp(int HP) {
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public void createPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your player name if you wish to play!");
        String playerName = scanner.nextLine();
        System.out.println("Your chosen player name is: " + playerName);



    }

    public ArrayList<Item> getBackpackInventory() {
        return backpackPlayer;
    }

    public boolean checkEmptyBackpack() {
        boolean result = backpackPlayer.isEmpty();
        return result;
    }


    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
    }
}

