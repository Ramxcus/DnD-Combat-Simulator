import java.util.*;

public class RollDice{

    Random rand = new Random();
    int rollResult, rollDamage;

    public int diceRollerD20(){//d20 dice roller
        rollResult = rand.nextInt(20) + 1;
        return rollResult;
    }

    public int rollDamageD12(){//d12 dice roller
        rollDamage = rand.nextInt(12) + 1;
        return rollDamage;
    }

    public int rollDamageD8(){//d8 dice roller
        rollDamage = rand.nextInt(8) + 1;
        return rollDamage;
    }

    public int rollDamageD6(){//d6 dice roller
        rollDamage = rand.nextInt(6) + 1;
        return rollDamage;
    }

    public int rollDamageD4(){//d4 dice roller
        rollDamage = rand.nextInt(4) + 1;
        return rollDamage;
    }
}
