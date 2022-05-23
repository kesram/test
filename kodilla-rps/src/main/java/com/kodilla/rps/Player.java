package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Player {
    final Scanner scanner = new Scanner(System.in);
    private int playerPoints;
    private int compPoints;
    private int maxScore;
    private boolean end;

    final String[] moves = new String[3];{
        moves[0] = "Kamień";
        moves[1] = "Papier";
        moves[2] = "Nożyce";
    }

    public boolean getEnd(){
        return end;
    }

    public void getName() {
        System.out.println("Wprowadź imię: ");
        String playerName = scanner.nextLine();
        System.out.println("Wprowadzone imię to: " + playerName);
    }

    public int getMaxScore() {
        System.out.println("Do ilu chcesz zagrać?");
        String score = scanner.nextLine();
        maxScore = Integer.parseInt(score);
        return maxScore;
    }

    public void gameResult () {
        System.out.println("Punkty komputera: " + compPoints);
        System.out.println("Punkty gracza: " + playerPoints);
    }

    public int getCompPoints () {
        return compPoints;
    }

    public int getPlayerPoints () {
        return playerPoints;
    }

    public void isItEnd () {
        if (playerPoints == maxScore) {
            System.out.println("Gracz wygrał. Koniec Gry");
            end = true;
        } else if (compPoints == maxScore) {
            System.out.println("Komputer wygrał. Koniec gry");
            end = true;
        } else System.out.println(" ");
    }

    public void generateMove() {
        System.out.println("Instrukcja: 1-kamień, 2-papier, 3-nożyce, x-koniec gry, n-nowa gra");
        System.out.println("Wykonj swój ruch:");
        String input = scanner.nextLine().toUpperCase();
        Random random = new Random();
        int compResult = random.nextInt(3) + 1;

        String yesNo;
        if (input.equals("N")) {
            System.out.println("Nowa gra. Potwierdz TAK/NIE");
            yesNo = scanner.nextLine().toUpperCase();
            if (yesNo.equals("TAK")) {
                System.out.println("zaczynamy nową grę");
                playerPoints = 0;
                compPoints = 0;
            } else if (yesNo.equals("NIE")) {
                System.out.println("Gramy dalej ");
            } else System.out.println("nie ma takiego symbolu");
        } else if (input.equals("X")) {
            System.out.println("Kończymy grę? Potwierdz TAK/NIE");
            yesNo = scanner.nextLine().toUpperCase();
            if (yesNo.equals("TAK")) {
                System.out.println("Kończymy grę");
                end = true;
            } else if (yesNo.equals("NIE")) {
                System.out.println("Gramy dalej");
            } else System.out.println("nie ma takiego symbolu");
        } else if (compResult == 1 && input.equals("1")) {
            System.out.println("Ruch komputera to " + moves[0]);
            System.out.println("Twój ruch to " + moves[0]);
            System.out.println("remis - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if (compResult == 1 && input.equals("3")) {
            System.out.println("Ruch komputera to " + moves[0]);
            System.out.println("Twój ruch to " + moves[2]);
            System.out.println("Kamień bije nożyce - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if (compResult == 1 && input.equals("2")) {
            System.out.println("Ruch komputera to " + moves[0]);
            System.out.println("Twój ruch to " + moves[1]);
            System.out.println("Kamień przegrywa z papierem - punkt dla Gracza");
            playerPoints += 1;
            gameResult();
        } else if (compResult == 3 && input.equals("1")) {
            System.out.println("Ruch komputera to " + moves[2]);
            System.out.println("Twój ruch to " + moves[0]);
            System.out.println("Kamień bije nożyce - punkt dla Gracza");
            playerPoints += 1;
            gameResult();
        } else if (compResult == 2 && input.equals("1")) {
            System.out.println("Ruch komputera to " + moves[1]);
            System.out.println("Twój ruch to " + moves[0]);
            System.out.println("Kamień przegrywa z papierem - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if (compResult == 2 && input.equals("2")) {
            System.out.println("Ruch komputera to " + moves[1]);
            System.out.println("Twój ruch to " + moves[1]);
            System.out.println("remis - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if (compResult == 3 && input.equals("3")) {
            System.out.println("Ruch komputera to " + moves[2]);
            System.out.println("Twój ruch to " + moves[2]);
            System.out.println("remis - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if (compResult == 3 && input.equals("2")) {
            System.out.println("Ruch komputera to " + moves[2]);
            System.out.println("Twój ruch to " + moves[1]);
            System.out.println("Nożyce tną papier - punkt dla Komputera");
            compPoints += 1;
            gameResult();
        } else if (compResult == 2 && input.equals("3")) {
            System.out.println("Ruch komputera to " + moves[1]);
            System.out.println("Twój ruch to " + moves[2]);
            System.out.println("Nożyce tną papier - punkt dla Gracza");
            playerPoints += 1;
            gameResult();
        }
    }
}