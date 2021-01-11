package com.deserve.snl;

public class Player {

    private String name;

    private int id;

    private int boardLocation = 0;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBoardLocation() {
        return boardLocation;
    }

    public int updateLocation(int diceNumber) {
        int newLocation = boardLocation + diceNumber;
        if (newLocation <= Board.size) return newLocation;
        return boardLocation;
    }
}
