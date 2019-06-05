import javax.swing.JOptionPane;

public class TestDungeon {
    public static void main(String[] args) {

        CharacterFile characterFileObject = new CharacterFile();
        Character characterObject = new Character();
        Enemy enemyObject = new Enemy();
        Attack attackObject = new Attack();
        MonsterAttack monsterAttackObject = new MonsterAttack();
        Spells spellObject = new Spells();
        RollDice rollDice = new RollDice();

        int characterStrMod = 0;
        int characterDexMod = 0;
        int characterConMod = 0;
        int characterIntMod = 0;
        int characterWisMod = 0;
        int characterChaMod = 0;
        int characterHP = 0;
        int characterAC = 0;

        int monsterStrMod = 0;
        int monsterDexMod = 0;
        int monsterConMod = 0;
        int monsterIntMod = 0;
        int monsterWisMod = 0;
        int monsterChaMod = 0;
        int monsterHP = 0;
        int monsterAC = 0;

        int rollResult = 0, diceRoll = 0;

        int tempDamage = 0, rollDamage = 0;

        int divineFavorCounter = 0;
        int divineFavorActive = 0;
        int shieldOfFaithActive = 0;
        int defend = 0;

        //Main Menu
        characterFileObject.characterFile();
        int[] myArray = new int[4];
        String characterFile = "";


        //choosing your character

        String userClass = JOptionPane.showInputDialog(null, "Fantasy character classes" + 
        "\n\nPaladin\nBarbarian\nWizard\n\nEnter your class:", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

        //if statement for which class you choose/calls on Dungeon methods
        if(userClass.equalsIgnoreCase("Paladin")){
            characterObject.level();
            characterObject.characterPaladin();
            characterStrMod = characterObject.getCharacterStrMod();
            characterDexMod = characterObject.getCharacterDexMod();
            characterConMod = characterObject.getCharacterConMod();
            characterIntMod = characterObject.getCharacterIntMod();
            characterWisMod = characterObject.getCharacterWisMod();
            characterChaMod = characterObject.getCharacterChaMod();
            characterHP = characterObject.getCharacterHP();
            characterAC = characterObject.getCharacterAC();
            userClass = "Paladin";
            //characterFile = characterFileObject.getCharacterName();
            //myArray[0] = characterFileObject.getPaladinEXP();
        }

        else if(userClass.equalsIgnoreCase("Barbarian")){
            characterObject.level();
            characterObject.characterBarbarian();
            characterStrMod = characterObject.getCharacterStrMod();
            characterDexMod = characterObject.getCharacterDexMod();
            characterConMod = characterObject.getCharacterConMod();
            characterIntMod = characterObject.getCharacterIntMod();
            characterWisMod = characterObject.getCharacterWisMod();
            characterChaMod = characterObject.getCharacterChaMod();
            characterHP = characterObject.getCharacterHP();
            characterAC = characterObject.getCharacterAC();
            userClass = "Barbarian";
            //characterFile = characterFileObject.getCharacterName();
            //myArray[1] = characterFileObject.getWizardEXP();
        }

        else if(userClass.equalsIgnoreCase("Wizard")){
            characterObject.level();
            characterObject.characterWizard();
            characterStrMod = characterObject.getCharacterStrMod();
            characterDexMod = characterObject.getCharacterDexMod();
            characterConMod = characterObject.getCharacterConMod();
            characterIntMod = characterObject.getCharacterIntMod();
            characterWisMod = characterObject.getCharacterWisMod();
            characterChaMod = characterObject.getCharacterChaMod();
            characterHP = characterObject.getCharacterHP();
            characterAC = characterObject.getCharacterAC();
            userClass = "Wizard";
            //characterFile = characterFileObject.getCharacterName();
            //myArray[2] = characterFileObject.getBarbarianEXP();
        }
        else if(userClass.equalsIgnoreCase("Human")){
            characterObject.level();
            characterObject.characterHuman();
            characterStrMod = characterObject.getCharacterStrMod();
            characterDexMod = characterObject.getCharacterDexMod();
            characterConMod = characterObject.getCharacterConMod();
            characterIntMod = characterObject.getCharacterIntMod();
            characterWisMod = characterObject.getCharacterWisMod();
            characterChaMod = characterObject.getCharacterChaMod();
            characterHP = characterObject.getCharacterHP();
            characterAC = characterObject.getCharacterAC();
            userClass = "Human";
            //characterFile = characterFileObject.getCharacterName();
            //myArray[3] = characterFileObject.getHumanEXP();
        }
        else{
            characterObject.level();
            characterObject.characterFailed();
            characterStrMod = characterObject.getCharacterStrMod();
            characterDexMod = characterObject.getCharacterDexMod();
            characterConMod = characterObject.getCharacterConMod();
            characterIntMod = characterObject.getCharacterIntMod();
            characterWisMod = characterObject.getCharacterWisMod();
            characterChaMod = characterObject.getCharacterChaMod();
            characterHP = characterObject.getCharacterHP();
            characterAC = characterObject.getCharacterAC();
            userClass = "Human";
            //characterFile = characterFileObject.getCharacterName();
            //myArray[3] = characterFileObject.getHumanEXP();
        }

        //Choosing an enemy
        String enemy = JOptionPane.showInputDialog(null, "Pick your encounter.........Difficulty:\n\n" +
        "Goblin...................................Easy\n" + "Orc......................................Medium\n" +
        "Giant....................................Hard\n", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

        //if statement for which enemy you choose/calls on Dungeon methods
        if(enemy.equalsIgnoreCase("Goblin")||enemy.equalsIgnoreCase("Easy")){
            enemyObject.monsterGoblin();
            monsterStrMod = enemyObject.getMonsterStrMod();
            monsterDexMod = enemyObject.getMonsterDexMod();
            monsterConMod = enemyObject.getMonsterConMod();
            monsterIntMod = enemyObject.getMonsterIntMod();
            monsterWisMod = enemyObject.getMonsterWisMod();
            monsterChaMod = enemyObject.getMonsterChaMod();
            monsterHP = enemyObject.getMonsterHP();
            monsterAC = enemyObject.getMonsterAC();
            enemy = "Goblin";
        }
        else if(enemy.equalsIgnoreCase("Orc")||enemy.equalsIgnoreCase("Medium")){
            enemyObject.monsterOrc();
            monsterStrMod = enemyObject.getMonsterStrMod();
            monsterDexMod = enemyObject.getMonsterDexMod();
            monsterConMod = enemyObject.getMonsterConMod();
            monsterIntMod = enemyObject.getMonsterIntMod();
            monsterWisMod = enemyObject.getMonsterWisMod();
            monsterChaMod = enemyObject.getMonsterChaMod();
            monsterHP = enemyObject.getMonsterHP();
            monsterAC = enemyObject.getMonsterAC();
            enemy = "Orc";
        }
        else if(enemy.equalsIgnoreCase("Giant")||enemy.equalsIgnoreCase("Hard")){
            enemyObject.monsterGiant();
            monsterStrMod = enemyObject.getMonsterStrMod();
            monsterDexMod = enemyObject.getMonsterDexMod();
            monsterConMod = enemyObject.getMonsterConMod();
            monsterIntMod = enemyObject.getMonsterIntMod();
            monsterWisMod = enemyObject.getMonsterWisMod();
            monsterChaMod = enemyObject.getMonsterChaMod();
            monsterHP = enemyObject.getMonsterHP();
            monsterAC = enemyObject.getMonsterAC();
            enemy = "Giant";
        }
        else{
            enemyObject.monsterGiant2();
            monsterStrMod = enemyObject.getMonsterStrMod();
            monsterDexMod = enemyObject.getMonsterDexMod();
            monsterConMod = enemyObject.getMonsterConMod();
            monsterIntMod = enemyObject.getMonsterIntMod();
            monsterWisMod = enemyObject.getMonsterWisMod();
            monsterChaMod = enemyObject.getMonsterChaMod();
            monsterHP = enemyObject.getMonsterHP();
            monsterAC = enemyObject.getMonsterAC();
            enemy = "Giant";
        }

        //Combat system
        while(monsterHP>0||characterHP>0){
            //attack selection
            String userCommand = JOptionPane.showInputDialog(null, "What would you like to do.\n\nAttack\nSpells\nDefend", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

            //defend
            if(userCommand.equalsIgnoreCase("Defend")){
                defend = 1;
                characterAC = characterAC + 2;
                JOptionPane.showMessageDialog(null, "You took a defensive stance!\nYour AC is now: " + characterAC, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            //spell attack
            else if(userCommand.equalsIgnoreCase("Spells")){
                if(userClass.equals("Paladin")){
                    rollResult = rollDice.diceRollerD20();
                    String spell = JOptionPane.showInputDialog(null, "What would you like to do?\n\nShield of Faith\nDivine Favor", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                    spell = spellObject.paladinSpells(spell);

                    diceRoll = rollResult;
                    rollResult = rollResult + characterChaMod;

                    JOptionPane.showMessageDialog(null, "You rolled a: " + diceRoll + "\n\n" + 
                    "Adding your charisma modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                    spellObject.paladinSpellActivation(rollResult, spell);

                    if(spell.equals("SHIELD OF FAITH")&&rollResult>=10){
                        characterAC = characterAC + 5;
                        shieldOfFaithActive = 1;
                        JOptionPane.showMessageDialog(null, "Your AC is now: " + characterAC, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                    }

                    else if(spell.equals("DIVINE FAVOR")&&rollResult>=10){
                        divineFavorActive = 1;
                        characterStrMod = characterStrMod + 2;
                        JOptionPane.showMessageDialog(null, "Divine Favor is now active for 6 turns", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                    }

                    rollResult = 0;
                }

                else if(userClass.equals("Barbarian")){
                    spellObject.barbarianSpells();
                    return;
                }

                else if(userClass.equals("Wizard")){
                    rollResult = rollDice.diceRollerD20();
                    String spell = JOptionPane.showInputDialog(null, "What would you like to do?\n\nMagic Missile\nThunderwave\nBurning Hands", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                    spell = spellObject.wizardSpells(spell);

                    diceRoll = rollResult;
                    rollResult = rollResult + characterIntMod;

                    JOptionPane.showMessageDialog(null, "You rolled a: " + diceRoll + "\n\n" + 
                    "Adding your inteligence modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                    spellObject.wizardSpellActivation(rollResult, spell);

                    if(spell.equals("BURNING HANDS")&&rollResult>=10){
                        int counter = 0;
                        while(counter<3){
                            tempDamage = rollDice.rollDamageD6();
                            rollDamage = rollDamage + tempDamage;
                            counter++;
                        }

                        rollResult = rollDice.diceRollerD20();
                        rollResult = rollResult + monsterDexMod;
                        JOptionPane.showMessageDialog(null, "The enemy rolled a: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                        if(rollResult>=15){
                            JOptionPane.showMessageDialog(null, "The enemy dodged most of your flames!\nThe enemy cut your damage in half! " + 
                                    rollDamage + " to " + (rollDamage/2), "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                            rollDamage = rollDamage/2;
                            monsterHP = monsterHP - rollDamage;
                            JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                        }

                        else{
                            monsterHP = monsterHP - rollDamage;
                            JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                        }
                    }

                    if(spell.equals("MAGIC MISSILE")&&rollResult>=10){
                        int counter = 0;
                        while(counter<3){
                            if(counter>=1){
                                JOptionPane.showMessageDialog(null, "You fire another burst of light from your staff!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                            }

                            tempDamage = rollDice.rollDamageD4();
                            rollDamage = rollDamage + tempDamage + 1;
                            counter++;

                            rollResult = rollDice.diceRollerD20();
                            rollResult = rollResult + monsterDexMod;
                            JOptionPane.showMessageDialog(null, "The enemy rolled a: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                            if(rollResult>=15){
                                JOptionPane.showMessageDialog(null, "The enemy dodged a dart!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                                rollDamage = 0;
                                rollResult = 0;
                            }

                            else{
                                monsterHP = monsterHP - rollDamage;
                                JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                                rollDamage = 0;
                                rollResult = 0;
                            }
                        }
                    }

                    if(spell.equals("THUNDERWAVE")&&rollResult>=10){
                        int counter = 0;
                        while(counter<2){
                            tempDamage = rollDice.rollDamageD8();
                            rollDamage = rollDamage + tempDamage;
                            counter++;
                        }

                        rollResult = rollDice.diceRollerD20();
                        rollResult = rollResult + monsterConMod;
                        JOptionPane.showMessageDialog(null, "The enemy rolled a: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                        if(rollResult>=15){
                            JOptionPane.showMessageDialog(null, "The enemy withstood the concussive blast!\nThe enemy cut your damage in half! " + 
                            rollDamage + " to " + (rollDamage/2), "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                            rollDamage = rollDamage/2;
                            monsterHP = monsterHP - rollDamage;
                            JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                        }

                        else{
                            monsterHP = monsterHP - rollDamage;
                            JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                        }
                    }

                    rollResult = 0;
                    rollDamage = 0;
                }

                else if(userClass.equals("Human")){
                    spellObject.humanSpells();
                    return;
                }
            }

            //basic attack
            else if(userCommand.equalsIgnoreCase("Attack")||userCommand.equals("")){
                    if(userClass.equals("Paladin")){
                    if(divineFavorActive==1){
                        divineFavorCounter++;
                        if(divineFavorCounter<6){
                            rollResult = rollDice.diceRollerD20();
                            diceRoll = rollResult;
                            rollResult = rollResult + characterStrMod;

                            JOptionPane.showMessageDialog(null, "You rolled a: " + diceRoll + "\n\n" + 
                                                        "Adding your strength modifier and spell bonus: " + 
                                                        rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                            if(rollResult>=monsterAC){
                                JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                                tempDamage = rollDice.rollDamageD8();
                                rollDamage = rollDamage + tempDamage;
                                tempDamage = rollDice.rollDamageD4();
                                rollDamage = rollDamage + tempDamage;
                                monsterHP = monsterHP - rollDamage;

                                JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + 
                                                        monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                                JOptionPane.showMessageDialog(null, "Divine Favor will last for " + (6-divineFavorCounter) + 
                                                        " more turns", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                                rollDamage = 0;
                                rollResult = 0;
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "You missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                                rollResult = 0;
                                JOptionPane.showMessageDialog(null, "Divine Favor will last for " + (6-divineFavorCounter) + 
                                                            " more turns", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                            }
                        }
                    }

                    if(divineFavorActive!=1){
                        rollResult = rollDice.diceRollerD20();
                        attackObject.paladinAttack(rollResult, characterStrMod, monsterAC);
                        rollDamage = attackObject.getRollDamage();
                        monsterHP = monsterHP - rollDamage;

                        JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + 
                        monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                        rollResult = 0;
                        rollDamage = 0;
                    }
                }

                else if(userClass.equals("Barbarian")){
                    rollResult = rollDice.diceRollerD20();
                    attackObject.barbarianAttack(rollResult, characterStrMod, monsterAC);
                    rollDamage = attackObject.getRollDamage();
                    monsterHP = monsterHP - rollDamage;

                    JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + 
                    monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                    rollResult = 0;
                    rollDamage = 0;
                }

                else if(userClass.equals("Wizard")){
                    rollResult = rollDice.diceRollerD20();
                    attackObject.wizardAttack(rollResult, characterStrMod, monsterAC);
                    rollDamage = attackObject.getRollDamage();
                    monsterHP = monsterHP - rollDamage;

                    JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + 
                    monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                    rollResult = 0;
                    rollDamage = 0;
                }

                else{
                    rollResult = rollDice.diceRollerD20();
                    attackObject.basicAttack(rollResult, characterStrMod, monsterAC);
                    rollDamage = attackObject.getRollDamage();
                    monsterHP = monsterHP - rollDamage;

                    JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nTheir remaining HP is: " + 
                    monsterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                    rollResult = 0;
                    rollDamage = 0;
                }
            }

            if(monsterHP<=0){
                break;
            }

            //monster attack
            if(enemy.equals("Goblin")){
                rollResult = rollDice.diceRollerD20();
                monsterAttackObject.goblinAttack(rollResult, monsterStrMod, characterAC);
                rollDamage = monsterAttackObject.getRollDamage();

                characterHP = characterHP - rollDamage;

                JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nYour remaining HP is: " + 
                characterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                rollResult = 0;
                rollDamage = 0;
            }

            else if(enemy.equals("Orc")){
                rollResult = rollDice.diceRollerD20();
                monsterAttackObject.orcAttack(rollResult, monsterStrMod, characterAC);
                rollDamage = monsterAttackObject.getRollDamage();

                characterHP = characterHP - rollDamage;

                JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nYour remaining HP is: " + 
                characterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                rollResult = 0;
                rollDamage = 0;
            }

            else if(enemy.equals("Giant")){
                rollResult = rollDice.diceRollerD20();
                monsterAttackObject.giantAttack(rollResult, monsterStrMod, characterAC);
                rollDamage = monsterAttackObject.getRollDamage();

                characterHP = characterHP - rollDamage;

                JOptionPane.showMessageDialog(null, "Total damage is: " + rollDamage + "\nYour remaining HP is: " + 
                characterHP, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

                rollResult = 0;
                rollDamage = 0;
            }

            if(characterHP<=0){
                break;
            }

            if(shieldOfFaithActive == 1){
                shieldOfFaithActive = 0;
                characterAC = characterAC - 5;
                JOptionPane.showMessageDialog(null, "Your AC is now: " + characterAC, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            if(divineFavorCounter>=6){
                divineFavorActive = 0;
                divineFavorCounter = 0;
                characterStrMod = characterStrMod - 2;
                JOptionPane.showMessageDialog(null, "Your sword returned back to normal!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            if(defend == 1){
                defend  = 0;
                characterAC = characterAC - 2;
                JOptionPane.showMessageDialog(null, "Your AC is now: " + characterAC, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }
        }

        if(monsterHP<=0){
            JOptionPane.showMessageDialog(null, "You won!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            characterFileObject.editRecord(enemy, userClass);
        }
        else if(characterHP<=0){
            JOptionPane.showMessageDialog(null, "You lost!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            characterFileObject.editRecord(enemy, userClass);
        }
    }
}
