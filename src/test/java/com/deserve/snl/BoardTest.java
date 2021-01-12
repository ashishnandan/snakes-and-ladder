package com.deserve.snl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoardTest {

    private Player player;

    private Board board;

    @BeforeEach
    void setUp() {
        player = new Player("P1", 1);
        board = new Board();
    }

    @Test
    public void isGameRunning() {

        player.updateLocation(55);

        board.addPlayer(player);

        assertTrue(board.isGameRunning());
    }

    @Test
    public void addSnakesToBoard() {

        player.updateLocation(55);

        board.addPlayer(player);
        player.updateLocation(55);

        board.addPlayer(player);
        board.addSnakesToBoard(Arrays.asList(new Snake(45, 12), new Snake(36, 18)));

        assertEquals(board.getSnakes(), Arrays.asList(new Snake(45, 12), new Snake(36, 18)));
    }
}