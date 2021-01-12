package com.deserve.snl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;

    private List<Snake> snakes;

    @BeforeEach
    void setUp() {
        player = new Player("P1", 1);
        snakes = new ArrayList<>();
    }

    @Test
    public void updateLocation(){
        // Dice throw is not relevant here, separate tests is written for that
        player.updateLocation(55, snakes);
        assertEquals(55, player.getBoardLocation());

        snakes.add(new Snake(76, 22));
        player.updateLocation(21, snakes);
        assertEquals(22, player.getBoardLocation());

        player.updateLocation(77, snakes);
        assertEquals(99, player.getBoardLocation());

        // 3 exceeds 100, so last location will be retained
        player.updateLocation(3, snakes);
        assertEquals(99, player.getBoardLocation());

    }
}
