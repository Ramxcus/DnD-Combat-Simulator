import javax.swing.*;

public class MonsterAttack{
    RollDice rollDice = new RollDice();

    int rollDamage = 0, diceRoll = 0;

    public int getRollDamage(){
        return rollDamage;
    }

    public void goblinAttack(int rollResult, int monsterStrMod, int characterAC){
        int tempDamage = 0;
        rollDamage = 0;

        diceRoll = rollResult;
        rollResult = rollResult + monsterStrMod;

        JOptionPane.showMessageDialog(null, "They rolled a: " + diceRoll + "\n\n" + 
        "Adding their strength modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

        if(rollResult>=characterAC){
            JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

            tempDamage = rollDice.rollDamageD4();
            rollDamage = rollDamage + tempDamage;
        }

        else{
            JOptionPane.showMessageDialog(null, "They missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void orcAttack(int rollResult, int monsterStrMod, int characterAC){
        int tempDamage = 0;
        rollDamage = 0;

        diceRoll = rollResult;
        rollResult = rollResult + monsterStrMod;

        JOptionPane.showMessageDialog(null, "They rolled a: " + diceRoll + "\n\n" + 
        "Adding their strength modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

        if(rollResult>=characterAC){
            JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

            tempDamage = rollDice.rollDamageD6();
            rollDamage = rollDamage + tempDamage;
        }

        else{
            JOptionPane.showMessageDialog(null, "They missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void giantAttack(int rollResult, int monsterStrMod, int characterAC){
    int tempDamage = 0;
    rollDamage = 0;

    diceRoll = rollResult;
    rollResult = rollResult + monsterStrMod;

    JOptionPane.showMessageDialog(null, "They rolled a: " + diceRoll + "\n\n" + 
    "Adding their strength modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

    if(rollResult>=characterAC){
        JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

        int counter = 0;
        while(counter<3){
            tempDamage = rollDice.rollDamageD8();
            rollDamage = rollDamage + tempDamage;
            counter++;
        }
    }

    else{
        JOptionPane.showMessageDialog(null, "They missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }
    }
}
