package com.deserve.snl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    public void updateLocation(){
        Player player1 = new Player();
        player1.updateLocation(55);
        assertEquals(55, player1.getBoardLocation());

        player1.updateLocation(44);
        assertEquals(99, player1.getBoardLocation());

        // 3 exceeds 100, so last location will be retained
        player1.updateLocation(3);
        assertEquals(99, player1.getBoardLocation());
    }
}
