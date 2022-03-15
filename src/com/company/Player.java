package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Player {

    private int HP;
    private String name;
    private int maxHP;
    private int xp;
    private int atk;
    private int def;
    private int lvl;
    private int numPotions;

    public static void  createPlayer(){
        Scanner playerName = new Scanner(System.in);
        System.out.println("Enter your player name if you wish tom play!");

        String name = playerName.nextLine();
        System.out.println("Your chosen player name is: " + playerName);


    }

    public Player(){
        HP = maxHP;
        lvl = 1;

    }


    public int getHp(){
        return HP;
    }

    public void setHP(int hp){
        HP = hp;
    }
}
