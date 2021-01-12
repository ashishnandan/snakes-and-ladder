package com.deserve.snl.dices;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CrookedDiceTest {

    @Test
    public void rollDice() {
        final List<Integer> integers = Arrays.asList(2, 4, 6);
        for (int i = 0; i < 100; i++) {
            assertTrue(integers.contains(new CrookedDice().rollDice()));
        }
    }
}