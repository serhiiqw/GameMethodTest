package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static String writeNumOfPlayersPerTeam(GameType game) {
        switch (game) {
            case SOCCER:
                createFile("socсer.txt");
                writeToFile("Soccer", "Number of players 11");
                break;
            case HOCKEY:
                createFile("hockey.txt");
                writeToFile("Hockey", "Number of players 6");
                break;
            case RUGBY:
                createFile("rugby.txt");
                writeToFile("Rugby", "Number of players 15");
                break;
            default:
                System.out.println("Type of sport is not in the list");
        }
        return game.name();
    }



    public static void createFile(String nameOfGame) {
        File file = new File(nameOfGame);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String nameOfGame, String text) {

        try {
            FileWriter fileWriter = new FileWriter(nameOfGame);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


