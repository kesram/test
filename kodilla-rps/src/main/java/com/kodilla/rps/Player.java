package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Player {
    private String playerName;
    final Scanner scanner = new Scanner(System.in);
    private boolean end;
    private int playerPoints;
    private int compPoints;
    private int maxScore;
    private String nowaGra;

    public String getNowaGra() {
        nowaGra = scanner.nextLine();
        return nowaGra;
    }

    public void isItEnd(){
        if(playerPoints == maxScore){
            System.out.println("Gracz wygrał. Koniec Gry"); // dodać "Gramy od nowa? Y/N"
        } else if(compPoints == maxScore) {
            System.out.println("Komputer wygrał. Koniec gry"); // dodać "Gramy od nowa? Y/N"
        } else System.out.println("Gramy dalej");
    }

    public int getCompPoints() {
        return compPoints;
    }
    public int getPlayerPoints() {
        return playerPoints;
    }

    final String[] moves = new String[3];{
        moves[0] = "Kamień";
        moves[1] = "Papier";
        moves[2] = "Nożyce";
    }

    public Player() {
    }


    public void getName(){
        System.out.println("Wprowadź imię: ");
        String player = scanner.nextLine();
        System.out.println("Wprowadzone imię to: "+ player);
    }

    public int getMaxScore(){
        System.out.println("Do ilu chcesz zagrać?");
        maxScore = scanner.nextInt();
        return maxScore;
    }

    public void gameResult(){
        System.out.println("Punkty komputera: " + compPoints);
        System.out.println("Punkty gracza: " + playerPoints);
    }

    public void generateMove(){
        System.out.println("Proszę wykonj swój ruch:");
        int move = scanner.nextInt();
        Random random = new Random();
        int compResult =random.nextInt(3) +1;

        if(compResult == 1 && move == 1) {
            System.out.println("Ruch komputera to " + moves[0]);
            System.out.println("Twój ruch to " + moves[0]);
            System.out.println("remis - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if(compResult == 1 && move == 3){
            System.out.println("Ruch komputera to " + moves[0]);
            System.out.println("Twój ruch to " + moves[2]);
            System.out.println("Kamień bije nożyce - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if(compResult == 1 && move == 2) {
            System.out.println("Ruch komputera to " + moves[0]);
            System.out.println("Twój ruch to " + moves[1]);
            System.out.println("Kamień przegrywa z papierem - punkt dla Gracza");
            playerPoints += 1;
            gameResult();
        } else if(compResult == 3 && move == 1){
            System.out.println("Ruch komputera to " + moves[2]);
            System.out.println("Twój ruch to " + moves[0]);
            System.out.println("Kamień bije nożyce - punkt dla Gracza");
            playerPoints += 1;
            gameResult();
        } else if(compResult == 2 && move == 1) {
            System.out.println("Ruch komputera to " + moves[1]);
            System.out.println("Twój ruch to " + moves[0]);
            System.out.println("Kamień przegrywa z papierem - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if (compResult == 2 && move == 2){
            System.out.println("Ruch komputera to " + moves[1]);
            System.out.println("Twój ruch to " + moves[1]);
            System.out.println("remis - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if(compResult == 3 && move == 3){
            System.out.println("Ruch komputera to " + moves[2]);
            System.out.println("Twój ruch to " + moves[2]);
            System.out.println("remis - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if(compResult == 3 && move == 2){
            System.out.println("Ruch komputera to " + moves[2]);
            System.out.println("Twój ruch to " + moves[1]);
            System.out.println("Nożyce tną papier - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if(compResult == 2 && move == 3){
            System.out.println("Ruch komputera to " + moves[1]);
            System.out.println("Twój ruch to " + moves[2]);
            System.out.println("Nożyce tną papier - punkt dla Gracza");
            playerPoints += 1;
            gameResult();
        }
    }
}
