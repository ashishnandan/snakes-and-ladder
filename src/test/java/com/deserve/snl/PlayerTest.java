package com.deserve.snl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player("P1", 1);
    }

    @Test
    public void updateLocation(){
        player.updateLocation(55);
        assertEquals(55, player.getBoardLocation());

        player.updateLocation(44);
        assertEquals(99, player.getBoardLocation());

        // 3 exceeds 100, so last location will be retained
        player.updateLocation(3);
        assertEquals(99, player.getBoardLocation());
    }
}
