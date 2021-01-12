package com.deserve.snl.dices;

import java.util.Random;

public class CrookedDice implements IDice{

    public int rollDice() {
        return (new Random().nextInt(3) + 1) * 2;
    }

}
