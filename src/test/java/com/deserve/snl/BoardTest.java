package com.deserve.snl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    @Test
    public void isGameRunning(){

        Player player1 = new Player();
        player1.updateLocation(55);
        board = new Board(player1);

        assertTrue(board.isGameRunning());
    }
}