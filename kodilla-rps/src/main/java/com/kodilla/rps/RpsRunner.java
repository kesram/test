package com.kodilla.rps;

import java.io.IOException;
import java.security.KeyException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) throws IllegalArgumentException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player();
        player1.getName();
        int maxScore = player1.getMaxScore();
        //String nowaGra = player1.getNowaGra();
        System.out.println("Instrukcja: 1-kamień, 2-papier, 3-nożyce, x-koniec gry, n-nowa gra");

        boolean end = false;
        while (!end) {
            //end = koniec(scanner, end);

            player1.generateMove();
            if (player1.getPlayerPoints() == maxScore) {
                player1.isItEnd();
                end = true;
            } else if (player1.getCompPoints() == maxScore) {
                player1.isItEnd();
                end = true;
            } else player1.isItEnd();
        }
    }

    static boolean koniec(Scanner scanner, boolean end) {
        if(Objects.equals(scanner.nextLine(), "x")){
            System.out.println("Koniec gry? Jesteś pewien? tak/nie");
            if(Objects.equals(scanner.nextLine(), "tak")){
                end = true;
            } else if(Objects.equals(scanner.nextLine(), "nie")){
                System.out.println("Tak myślałem! Gramy dalej!");
            } else System.out.println("wprowadź poprawne dane!");
        } else if (Objects.equals(scanner.nextLine(), "n")) {
            System.out.println("Czy chcesz przerwać rozgrywkę i zacząć nową grę?  tak/nie");
            if(Objects.equals(scanner.nextLine(), "tak")){
                end = true;
            } else if(Objects.equals(scanner.nextLine(), "nie")){
                System.out.println("Tak myślałem! Gramy dalej!");
            } else System.out.println("wprowadź poprawne dane!");
        } else System.out.println("Brak funkcji dla tego klawisza");
        return end;
    }
}

