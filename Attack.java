import javax.swing.*;

public class Attack{
	RollDice rollDice = new RollDice();
  
  	int rollDamage = 0, diceRoll = 0;
  
  	public int getRollDamage(){
    	return rollDamage;
    }
  
	public void paladinAttack(int rollResult, int characterStrMod, int monsterAC){
		int tempDamage = 0;
      	rollDamage = 0;
      	
		diceRoll = rollResult;
		rollResult = rollResult + characterStrMod;

		JOptionPane.showMessageDialog(null, "You rolled a: " + diceRoll + "\n\n" + 
					"Adding your strength modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

		if(rollResult>=monsterAC){
			JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

			tempDamage = rollDice.rollDamageD8();
			rollDamage = rollDamage + tempDamage;
		}

		else{
			JOptionPane.showMessageDialog(null, "You missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public void barbarianAttack(int rollResult, int characterStrMod, int monsterAC){
		int tempDamage = 0;
      	rollDamage = 0;
      	
		diceRoll = rollResult;
		rollResult = rollResult + characterStrMod;

		JOptionPane.showMessageDialog(null, "You rolled a: " + diceRoll + "\n\n" + 
					"Adding your strength modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

		if(rollResult>=monsterAC){
			JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

			tempDamage = rollDice.rollDamageD12();
			rollDamage = rollDamage + tempDamage;
		}

		else{
			JOptionPane.showMessageDialog(null, "You missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public void wizardAttack(int rollResult, int characterStrMod, int monsterAC){
		int tempDamage = 0;
      	rollDamage = 0;
      	
		diceRoll = rollResult;
		rollResult = rollResult + characterStrMod;

		JOptionPane.showMessageDialog(null, "You rolled a: " + diceRoll + "\n\n" + 
					"Adding your strength modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

		if(rollResult>=monsterAC){
			JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

			tempDamage = rollDice.rollDamageD6();
			rollDamage = rollDamage + tempDamage;
		}

		else{
			JOptionPane.showMessageDialog(null, "You missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public void basicAttack(int rollResult, int characterStrMod, int monsterAC){
		int tempDamage = 0;
      	rollDamage = 0;
      	
		diceRoll = rollResult;
		rollResult = rollResult + characterStrMod;

		JOptionPane.showMessageDialog(null, "You rolled a: " + diceRoll + "\n\n" + 
					"Adding your strength modifier: " + rollResult, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

		if(rollResult>=monsterAC){
			JOptionPane.showMessageDialog(null, "It's a hit!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
          
			tempDamage = rollDice.rollDamageD4();
			rollDamage = rollDamage + tempDamage;
		}

		else{
			JOptionPane.showMessageDialog(null, "You missed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
