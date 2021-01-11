package com.deserve.snl;

public class Board {

    public static final int size = 100;

    private Player player;

    public boolean isGameRunning() {
        return player.getBoardLocation() < 100;
    }

    public void addPlayer(Player player) {
        if (player != null)
            this.player = player;
    }
}
