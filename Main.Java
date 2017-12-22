package com.company;

import java.util.*;
//for loop for a game
//two dimensional arrays on page 190
public class Main {

    public static void main(String[] args) {

            String blankTTTboard[][] = {{"_", "|", "_", "|", "_"},
                    {"_", "|", "_", "|", "_"},
                    {" ", "|", " ", "|", " "}};
            String TTTboard[][] = blankTTTboard;
            for (; ; ) {
            System.out.println(TTTboard + "\nPick a spot! Type in " +
                    "Top left, top middle, top right, middle, bottom, etc.");
            //might change the keywords of top-right, middle, etc; use substring
            Scanner userInput = new Scanner(System.in);
            String playerResponse = userInput.nextLine();
            for (int i = 0; i <= 1; i++) {
                if (playerResponse.toLowerCase().equals("top left")) {
                    TTTboard[0][0] = "x";

                } else if (playerResponse.toLowerCase().equals("top middle")) {
                    TTTboard[0][2] = "x";
                } else if (playerResponse.toLowerCase().equals("top right")) {
                    TTTboard[0][4] = "x";
                } else if (playerResponse.toLowerCase().equals("middle left")) {
                    TTTboard[0][0] = "x";
                } else if (playerResponse.toLowerCase().equals("middle")) {
                    TTTboard[0][2] = "x";
                } else if (playerResponse.toLowerCase().equals("middle right")) {
                    TTTboard[0][4] = "x";
                } else if (playerResponse.toLowerCase().equals("bottom left")) {
                    TTTboard[0][0] = "x";
                } else if (playerResponse.toLowerCase().equals("bottom middle")) {
                    TTTboard[0][2] = "x";
                } else if (playerResponse.toLowerCase().equals("bottom right")) {
                    TTTboard[0][4] = "x";
                }
            }/*now is time for the computer's turn;
     always go center if player didn't take
     if taken, and failure to find the player
     in a winning situation, pick arandom spot*/
            System.out.println("okie dokie is mine turn");
            if (TTTboard[0][2] != "x" && TTTboard[0][2] != "o") {
                TTTboard[1][2] = "o";

                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[0][0] == "x" && TTTboard[0][2] == "x" && TTTboard[0][4]!= "o") { //16 possible ways for player to be about to win
                TTTboard[0][4] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[0][2] == "x" && TTTboard[0][4] == "x" && TTTboard[0][4]!= "o") {
                TTTboard[0][0] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[1][0] == "x" && TTTboard[1][2] == "x" && TTTboard[0][4]!= "o") { //16 possible ways for player to be about to win
                TTTboard[1][4] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[1][2] == "x" && TTTboard[1][4] == "x" && TTTboard[0][4]!= "o") {
                TTTboard[1][0] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[2][0] == "x" && TTTboard[2][2] == "x" && TTTboard[0][4]!= "o") { //16 possible ways for player to be about to win
                TTTboard[2][4] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[2][2] == "x" && TTTboard[2][4] == "x" && TTTboard[0][4]!= "o") {
                TTTboard[2][0] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[0][0] == "x" && TTTboard[1][2] == "x" && TTTboard[0][4]!= "o") { //16 possible ways for player to be about to win
                TTTboard[3][4] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }

            } else if (TTTboard[1][3] == "x" && TTTboard[2][2] == "x" && TTTboard[0][4]!= "o") {
                TTTboard[0][0] = "o";
                for (int i = 0; i <= 2; i++) { //rows
                    for (int a = 0; a <= 4; a++) { //columns
                        System.out.print(TTTboard[i][a]);
                    }
                    System.out.println("\n");
                }
            }
        /*for (int i = 0; i<=2; i++) { //rows
            for (int a = 0; a <= 4; a++) { //columns
                System.out.print(TTTboard[i][a]);
            }
            System.out.println("\n"); <-- a test*/
        }
    }
}
