package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        Player player1 = new Player();
        player1.getName();
        int maxScore = player1.getMaxScore();

        while (!player1.getEnd()) {
            player1.generateMove();
            if (player1.getPlayerPoints() == maxScore) {
                player1.isItEnd();
            } else if (player1.getCompPoints() == maxScore) {
                player1.isItEnd();
            }
            else player1.isItEnd();
        }
    }
}

