import javax.swing.*;
import java.util.*;
import java.io.*;

public class Character{

    private int characterStr, characterDex, characterCon, characterInt, characterWis, characterCha, characterHP, characterAC;
    private int characterStrMod = 0, characterDexMod = 0, characterConMod = 0, characterIntMod = 0, characterWisMod = 0, characterChaMod = 0, characterWeaponMod = 0;
    Scanner scanIn = null;
    String[][] myArray = new String[100][29];
    int[] tempArray = new int[29];
    int Rowc = 0;
    int x = 0;
    String InputLine = "";
    String characterName = "";

    //getter methods
    public int getCharacterStrMod(){
        return characterStrMod;
    }

    public int getCharacterDexMod(){
        return characterDexMod;
    }

    public int getCharacterConMod(){
        return characterConMod;
    }

    public int getCharacterIntMod(){
        return characterIntMod;
    }

    public int getCharacterWisMod(){
        return characterWisMod;
    }

    public int getCharacterChaMod(){
        return characterChaMod;
    }

    public int getCharacterHP(){
        return characterHP;
    }

    public int getCharacterAC(){
        return characterAC;
    }

    //User stats to be called from
    public void characterPaladin(){//pg. 82 DnD 5e Player Handbook
        characterStr = 16 + tempArray[3];
        characterDex = 14 + tempArray[4];
        characterCon = 20 + tempArray[5];
        characterInt = 10 + tempArray[6];
        characterWis = 12 + tempArray[7];
        characterCha = 18 + tempArray[8];
        int characterStrTemp = 10;
        while(characterStrTemp<characterStr){
            characterStrMod = characterStrMod + 1;
            characterStrTemp = characterStrTemp + 2;
        }

        int characterDexTemp = 10;
        while(characterDexTemp<characterDex){
            characterDexMod = characterDexMod + 1;
            characterDexTemp = characterDexTemp + 2;
        }
        int characterConTemp = 10;
        while(characterConTemp<characterCon){
            characterConMod = characterConMod + 1;
            characterConTemp = characterConTemp + 2;
        }
        int characterIntTemp = 10;
        while(characterIntTemp<characterInt){
            characterIntMod = characterIntMod + 1;
            characterIntTemp = characterIntTemp + 2;
        }
        int characterWisTemp = 10;
        while(characterWisTemp<characterWis){
            characterWisMod = characterWisMod + 1;
            characterWisTemp = characterWisTemp + 2;
        }
        int characterChaTemp = 10;
        while(characterChaTemp<characterCha){
            characterChaMod = characterChaMod + 1;
            characterChaTemp = characterChaTemp + 2;
        }
        characterWeaponMod = 0;
        characterHP = 15;
        characterAC = 19;//halfplate armour+15+dexMod+2 w/sheild+2

        JOptionPane.showMessageDialog(null,"You chose the Paladin class. You must be very defensive\n\nYour stats are:\n" + "HP: " +  characterHP + "\n" +
        "AC: " +  characterAC + "\n" + "Strength: " +  characterStr + "\n" + "Dexterity: " +  characterDex + "\n" + "Constitution: " +  characterCon + "\n" + 
        "Inteligence: " + characterInt + "\n" + "Wisdom: " +  characterWis + "\n" + "Charisma: " +  characterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void characterBarbarian(){//pg. 46 DnD 5e Player Handbook
        characterStr = 20 + tempArray[17];
        characterDex = 18 + tempArray[18];
        characterCon = 16 + tempArray[19];
        characterInt = 12 + tempArray[20];
        characterWis = 10 + tempArray[21];
        characterCha = 14 + tempArray[22];
        int characterStrTemp = 10;
        while(characterStrTemp<characterStr){
            characterStrMod = characterStrMod + 1;
            characterStrTemp = characterStrTemp + 2;
        }
        int characterDexTemp = 10;
        while(characterDexTemp<characterDex){
            characterDexMod = characterDexMod + 1;
            characterDexTemp = characterDexTemp + 2;
        }
        int characterConTemp = 10;
        while(characterConTemp<characterCon){
            characterConMod = characterConMod + 1;
            characterConTemp = characterConTemp + 2;
        }
        int characterIntTemp = 10;
        while(characterIntTemp<characterInt){
            characterIntMod = characterIntMod + 1;
            characterIntTemp = characterIntTemp + 2;
        }
        int characterWisTemp = 10;
        while(characterWisTemp<characterWis){
            characterWisMod = characterWisMod + 1;
            characterWisTemp = characterWisTemp + 2;
        }
        int characterChaTemp = 10;
        while(characterChaTemp<characterCha){
            characterChaMod = characterChaMod + 1;
            characterChaTemp = characterChaTemp + 2;
        }
        characterWeaponMod = 0;
        characterHP = 15;
        characterAC = 14;//hide armour+12+dexMod+2
        JOptionPane.showMessageDialog(null,"You chose the Barbarian class. You must be very strong\n\nYour stats are:\n" + "HP: " +  characterHP + "\n" +
        "AC: " +  characterAC + "\n" + "Strength: " +  characterStr + "\n" + "Dexterity: " +  characterDex + "\n" + "Constitution: " +  characterCon + "\n" + 
        "Inteligence: " + characterInt + "\n" + "Wisdom: " +  characterWis + "\n" + "Charisma: " +  characterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void characterWizard(){//pg. 112 DnD 5e Player Handbook
        characterStr = 14 + tempArray[10];
        characterDex = 12 + tempArray[11];
        characterCon = 16 + tempArray[12];
        characterInt = 20 + tempArray[13];
        characterWis = 18 + tempArray[14];
        characterCha = 10 + tempArray[15];
        int characterStrTemp = 10;
        while(characterStrTemp<characterStr){
            characterStrMod = characterStrMod + 1;
            characterStrTemp = characterStrTemp + 2;
        }
        int characterDexTemp = 10;
        while(characterDexTemp<characterDex){
            characterDexMod = characterDexMod + 1;
            characterDexTemp = characterDexTemp + 2;
        }
        int characterConTemp = 10;
        while(characterConTemp<characterCon){
            characterConMod = characterConMod + 1;
            characterConTemp = characterConTemp + 2;
        }
        int characterIntTemp = 10;
        while(characterIntTemp<characterInt){
            characterIntMod = characterIntMod + 1;
            characterIntTemp = characterIntTemp + 2;
        }
        int characterWisTemp = 10;
        while(characterWisTemp<characterWis){
            characterWisMod = characterWisMod + 1;
            characterWisTemp = characterWisTemp + 2;
        }
        int characterChaTemp = 10;
        while(characterChaTemp<characterCha){
            characterChaMod = characterChaMod + 1;
            characterChaTemp = characterChaTemp + 2;
        }
        characterWeaponMod = 0;
        characterHP = 13;
        characterAC = 13;//studded leather armour+12+dexMod+1

        JOptionPane.showMessageDialog(null,"You chose the Wizard class. You must be very smart!\n\nYour stats are:\n" + "HP: " +  characterHP + "\n" +
        "AC: " +  characterAC + "\n" + "Strength: " +  characterStr + "\n" + "Dexterity: " +  characterDex + "\n" + "Constitution: " +  characterCon + "\n" + 
        "Inteligence: " + characterInt + "\n" + "Wisdom: " +  characterWis + "\n" + "Charisma: " +  characterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void characterFailed(){//default class
        characterStr = 10 + tempArray[23];
        characterDex = 10 + tempArray[24];
        characterCon = 10 + tempArray[25];
        characterInt = 10 + tempArray[26];
        characterWis = 10 + tempArray[27];
        characterCha = 10 + tempArray[28];
        int characterStrTemp = 10;
        while(characterStrTemp<characterStr){
            characterStrMod = characterStrMod + 1;
            characterStrTemp = characterStrTemp + 2;
        }
        int characterDexTemp = 10;
        while(characterDexTemp<characterDex){
            characterDexMod = characterDexMod + 1;
            characterDexTemp = characterDexTemp + 2;
        }
        int characterConTemp = 10;
        while(characterConTemp<characterCon){
            characterConMod = characterConMod + 1;
            characterConTemp = characterConTemp + 2;
        }
        int characterIntTemp = 10;
        while(characterIntTemp<characterInt){
            characterIntMod = characterIntMod + 1;
            characterIntTemp = characterIntTemp + 2;
        }
        int characterWisTemp = 10;
        while(characterWisTemp<characterWis){
            characterWisMod = characterWisMod + 1;
            characterWisTemp = characterWisTemp + 2;
        }
        int characterChaTemp = 10;
        while(characterChaTemp<characterCha){
            characterChaMod = characterChaMod + 1;
            characterChaTemp = characterChaTemp + 2;
        }
        characterWeaponMod = 0;
        characterHP = 5;
        characterAC = 10;
        JOptionPane.showMessageDialog(null,"You've failed to choose a class, you are now a naked human.\n\nYour stats are:\n" + "HP: " +  characterHP + "\n" +
        "AC: " +  characterAC + "\n" + "Strength: " +  characterStr + "\n" + "Dexterity: " +  characterDex + "\n" + "Constitution: " +  characterCon + "\n" + 
        "Inteligence: " + characterInt + "\n" + "Wisdom: " +  characterWis + "\n" + "Charisma: " +  characterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void characterHuman(){//empty class  
        characterStr = 10 + tempArray[23];
        characterDex = 10 + tempArray[24];
        characterCon = 10 + tempArray[25];
        characterInt = 10 + tempArray[26];
        characterWis = 10 + tempArray[27];
        characterCha = 10 + tempArray[28];
        int characterStrTemp = 10;
        while(characterStrTemp<characterStr){
            characterStrMod = characterStrMod + 1;
            characterStrTemp = characterStrTemp + 2;
        }
        int characterDexTemp = 10;
        while(characterDexTemp<characterDex){
            characterDexMod = characterDexMod + 1;
            characterDexTemp = characterDexTemp + 2;
        }
        int characterConTemp = 10;
        while(characterConTemp<characterCon){
            characterConMod = characterConMod + 1;
            characterConTemp = characterConTemp + 2;
        }
        int characterIntTemp = 10;
        while(characterIntTemp<characterInt){
            characterIntMod = characterIntMod + 1;
            characterIntTemp = characterIntTemp + 2;
        }
        int characterWisTemp = 10;
            while(characterWisTemp<characterWis){
            characterWisMod = characterWisMod + 1;
            characterWisTemp = characterWisTemp + 2;
        }
        int characterChaTemp = 10;
            while(characterChaTemp<characterCha){
            characterChaMod = characterChaMod + 1;
            characterChaTemp = characterChaTemp + 2;
        }
        characterWeaponMod = 0;
        characterHP = 5;
        characterAC = 10;
        JOptionPane.showMessageDialog(null,"You've chosen hard mode, good luck adventurer.\n\nYour stats are:\n" + "HP: " +  characterHP + "\n" +
        "AC: " +  characterAC + "\n" + "Strength: " +  characterStr + "\n" + "Dexterity: " +  characterDex + "\n" + "Constitution: " +  characterCon + "\n" + 
        "Inteligence: " + characterInt + "\n" + "Wisdom: " +  characterWis + "\n" + "Charisma: " +  characterCha, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void level(){
        String fileLocation;
        fileLocation = File.separator + "Users" + File.separator + "YunaK" + File.separator + "Documents" + File.separator +
                "NetBeansProjects" + File.separator + "TestDungeon" + File.separator +
                "src" + File.separator + "main" + File.separator + "java" + File.separator + "CharacterFile.csv";
        File file = new File(fileLocation);
        try{
            scanIn = new Scanner(new BufferedReader(new FileReader(file)));
            while(scanIn.hasNextLine()){
                InputLine = scanIn.nextLine();
                String[] InArray = InputLine.split(",");
                myArray = new String[100][InArray.length];
                for(x = 0; x<InArray.length;x++){
                    myArray[Rowc][x] = InArray[x];
                }
                Rowc++;
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error 404", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        x = 1;
        for(x=1;x<Rowc;x++){
            if(characterName.equalsIgnoreCase(myArray[x][0])){
                int counter = 0;
                for(counter = 0;counter<29;counter++){
                tempArray[counter] = Integer.parseInt(myArray[x][counter+1]);
                }
                JOptionPane.showMessageDialog(null, "File " + characterName + " loaded");
            }
        }
    }
}
