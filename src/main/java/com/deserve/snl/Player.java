package com.deserve.snl;

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

    public void updateLocation(int diceNumber) {
        int newLocation = boardLocation + diceNumber;
        if (newLocation <= Board.size)
            boardLocation = newLocation;
    }
}
