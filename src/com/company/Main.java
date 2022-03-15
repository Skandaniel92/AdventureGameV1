package com.company;

import java.util.Scanner;

public class Main {


        startGame();
        printMenu();
        createPlayer();

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
