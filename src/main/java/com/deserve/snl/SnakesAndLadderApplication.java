package com.deserve.snl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.deserve.snl.Dice.rollDice;

public class SnakesAndLadderApplication {

    private Board board;

    private Player player;

    public SnakesAndLadderApplication(Board board, Player player) {
        this.board = board;
        this.player = player;
    }

    public void run(int numberOfTurns, List<Snake> snakes) {
        board.addPlayer(player);
        board.addSnakesToBoard(snakes);
        for (int i = 0; i < numberOfTurns; i++) {
            final int result = rollDice();
            System.out.println("Turn" + (i + 1) + ":" + result);
            player.updateLocation(result, snakes);
            System.out.println("Player Location : " + player.getBoardLocation());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Turns : ");
        int numberOfTurns = scanner.nextInt();
        System.out.println("Please enter the snakes on the board with comma separated start and " +
                "end values. e.g. 15:5,34:21");
        String snakesCoordinates = scanner.next();
        new SnakesAndLadderApplication(new Board(), new Player("P1", 1)).run(numberOfTurns,
                convertStringToSnakeObject(snakesCoordinates));
    }

    private static List<Snake> convertStringToSnakeObject(String snakesCoordinates) {
        List<Snake> snakes = new ArrayList<>();
        final String[] snakePairList = snakesCoordinates.split(",");
        for (String s : snakePairList) {
            final String[] vals = s.split(":");
            Snake snake = new Snake(Integer.parseInt(vals[0]), Integer.parseInt(vals[1]));
            if (snake.validated())
                snakes.add(snake);
            else
                System.out.println("Snakes coordinates are not valid");
        }
        return snakes;
    }
}
