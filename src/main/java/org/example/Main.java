package org.example;

public class Main {
    public static void main(String[] args) {

        //Inform about a soccer
        String GameInform = Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
        System.out.println(GameInform);
    }
}
