package com.deserve.snl;

public class Board {

    public static final int size = 100;

    private Player player;

    public Board(Player player) {
        this.player = player;
    }

    public boolean isGameRunning() {
        return player.getBoardLocation() < 100;
    }
}
