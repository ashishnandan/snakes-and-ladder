package com.deserve.snl;

import java.util.Scanner;

import static com.deserve.snl.Dice.rollDice;

public class SnakesAndLadderApplication {

    private Board board;

    private Player player;

    public SnakesAndLadderApplication(Board board, Player player) {
        this.board = board;
        this.player = player;
    }

    public void run(int numberOfTurns) {
        board.addPlayer(player);
        for (int i = 0; i < numberOfTurns; i++) {
            final int result = rollDice();
            System.out.println("Turn" + (i + 1) + ":" + result);
            player.updateLocation(result);
            System.out.println("Player Location : " + player.getBoardLocation());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUmber of Turns : ");
        int numberOfTurns = scanner.nextInt();
        new SnakesAndLadderApplication(new Board(), new Player("P1", 1)).run(numberOfTurns);
    }
}
