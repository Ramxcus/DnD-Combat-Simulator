import javax.swing.*;

public class Enemy{

    private int monsterStr, monsterDex, monsterCon, monsterInt, monsterWis, monsterCha, monsterHP, monsterAC;
    private int monsterStrMod, monsterDexMod, monsterConMod, monsterIntMod, monsterWisMod, monsterChaMod, monsterWeaponMod;

    public int getMonsterStrMod(){
        return monsterStrMod;
    }

    public int getMonsterDexMod(){
        return monsterDexMod;
    }

    public int getMonsterConMod(){
        return monsterConMod;
    }

    public int getMonsterIntMod(){
        return monsterIntMod;
    }

    public int getMonsterWisMod(){
        return monsterWisMod;
    }

    public int getMonsterChaMod(){
        return monsterChaMod;
    }

    public int getMonsterHP(){
        return monsterHP;
    }

    public int getMonsterAC(){
        return monsterAC;
    }

    //Monster stats to call from
    public void monsterGoblin(){//pg. 166 DnD 5e monster manuel
        monsterStr = 8;
        monsterDex = 14;
        monsterCon = 10;
        monsterInt = 10;
        monsterWis = 8;
        monsterCha = 8;
        monsterStrMod = -1;
        monsterDexMod = 2;
        monsterConMod = 0;
        monsterIntMod = 0;
        monsterWisMod = -1;
        monsterChaMod = -1;
        monsterHP = 7;
        monsterAC = 15;
        JOptionPane.showMessageDialog(null, "You chose the Goblin, an easy match!\n\nTheir stats are:\n" + "HP: " +  monsterHP + "\n" + "AC: " +  monsterAC + "\n" +
        "Strength: " +  monsterStr + "\n" + "Dexterity: " +  monsterDex + "\n" + "Constitution: " +  monsterCon + "\n" + "Inteligence: " +  
        monsterInt + "\n" + "Wisdom: " +  monsterWis + "\n" + "Charisma: " +  monsterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void monsterOrc(){//pg. 246 DnD 5e monster manuel
        monsterStr = 16;
        monsterDex = 12;
        monsterCon = 16;
        monsterInt = 7;
        monsterWis = 11;
        monsterCha = 10;
        monsterStrMod = 3;
        monsterDexMod = 1;
        monsterConMod = 3;
        monsterIntMod = -2;
        monsterWisMod = 0;
        monsterChaMod = 0;
        monsterHP = 15;
        monsterAC = 13;
        JOptionPane.showMessageDialog(null, "You chose the Orc, an even match!\n\nTheir stats are:\n" + "HP: " +  monsterHP + "\n" + "AC: " +  monsterAC + "\n" +
        "Strength: " +  monsterStr + "\n" + "Dexterity: " +  monsterDex + "\n" + "Constitution: " +  monsterCon + "\n" + "Inteligence: " +  
        monsterInt + "\n" + "Wisdom: " +  monsterWis + "\n" + "Charisma: " +  monsterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void monsterGiant(){//pg. 155 DnD 5e monster manuel
        monsterStr = 21;
        monsterDex = 8;
        monsterCon = 19;
        monsterInt = 5;
        monsterWis = 9;
        monsterCha = 6;
        monsterHP = 105;
        monsterStrMod = 5;
        monsterDexMod = -1;
        monsterConMod = 4;
        monsterIntMod = -3;
        monsterWisMod = -1;
        monsterChaMod = -2;
        monsterHP = 105;
        monsterAC = 13;
        JOptionPane.showMessageDialog(null, "You chose the Giant, good luck!\n\nTheir stats are:\n" + "HP: " +  monsterHP + "\n" + "AC: " +  monsterAC + "\n" +
        "Strength: " +  monsterStr + "\n" + "Dexterity: " +  monsterDex + "\n" + "Constitution: " +  monsterCon + "\n" + "Inteligence: " +  
        monsterInt + "\n" + "Wisdom: " +  monsterWis + "\n" + "Charisma: " +  monsterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void monsterGiant2(){//default monster
        monsterStr = 21;
        monsterDex = 8;
        monsterCon = 19;
        monsterInt = 5;
        monsterWis = 9;
        monsterCha = 6;
        monsterStrMod = 5;
        monsterDexMod = -1;
        monsterConMod = 4;
        monsterIntMod = -3;
        monsterWisMod = -1;
        monsterChaMod = -2;
        monsterHP = 105;
        monsterAC = 13;
        JOptionPane.showMessageDialog(null,"You've failed to pick an enemy to encounter, I have chosen for you.\n\nTheir stats are:\n" + "HP: " +  monsterHP + "\n" + "AC: " +  monsterAC + "\n" +
        "Strength: " +  monsterStr + "\n" + "Dexterity: " +  monsterDex + "\n" + "Constitution: " +  monsterCon + "\n" + "Inteligence: " +  
        monsterInt + "\n" + "Wisdom: " +  monsterWis + "\n" + "Charisma: " +  monsterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }
}
