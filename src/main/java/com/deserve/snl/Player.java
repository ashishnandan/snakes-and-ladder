package com.deserve.snl;

import java.util.List;

public class Player {

    private String name;

    private int id;

    private int boardLocation = 0;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBoardLocation() {
        return boardLocation;
    }

    public void updateLocation(int diceNumber, List<Snake> snakes) {
        int newLocation = boardLocation + diceNumber;
        if (newLocation >= Board.size)
            return;
        if (newLocation <= Board.size) {
            for (Snake snake : snakes) {
                if (snake.getStart() == newLocation) {
                    System.out
                            .println("Snake Bite at " + newLocation + ", go to " + snake.getEnd());
                    newLocation = snake.getEnd();
                    break;
                }
            }
        }
        boardLocation = newLocation;
    }
}
