package com.deserve.snl;

import com.deserve.snl.dices.Dice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {

    private Dice dice;

    @BeforeEach
    void setUp() {
        dice = new Dice();
    }

    @Test
    public void rollDice_RangeCheck() {
        // check for 1000o times, likely proof that it will not fail
        for (int i = 0; i < 10000; i++) {
            assertTrue(1 <= dice.rollDice());
            assertTrue(6 >= dice.rollDice());
        }
    }
}