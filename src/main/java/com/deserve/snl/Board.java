package com.deserve.snl;

import java.util.List;

public class Board {

    public static final int size = 100;

    private Player player;

    private List<Snake> snakes;

    public boolean isGameRunning() {
        return player.getBoardLocation() < 100;
    }

    public void addPlayer(Player player) {
        if (player != null)
            this.player = player;
    }

    public void addSnakesToBoard(List<Snake> snakes) {
        if (this.snakes == null)
            this.snakes = snakes;
        else
            snakes.addAll(snakes);
    }

    public Player getPlayer() {
        return player;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }
}
