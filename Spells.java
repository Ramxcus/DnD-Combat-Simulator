import javax.swing.*;

public class Spells{
    public String paladinSpells(String spell){
        spell = spell.toUpperCase();
        switch(spell){
            case "SHIELD OF FAITH":
                JOptionPane.showMessageDialog(null, "You chose the spell: " + spell, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                return spell;
            case "DIVINE FAVOR":
                JOptionPane.showMessageDialog(null, "You chose the spell: " + spell, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                return spell;
            default:
                JOptionPane.showMessageDialog(null, "You chose the spell: " + spell, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                return spell;
        }
    }

    public void barbarianSpells(){
        JOptionPane.showMessageDialog(null, "Barbarians use their fists over spells!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public String wizardSpells(String spell){
        spell = spell.toUpperCase();
        switch(spell){
            case "MAGIC MISSILE":
                JOptionPane.showMessageDialog(null, "You chose the spell: " + spell, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                return spell;
            case "THUNDERWAVE":
                JOptionPane.showMessageDialog(null, "You chose the spell: " + spell, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                return spell;
            case "BURNING HANDS":
                JOptionPane.showMessageDialog(null, "You chose the spell: " + spell, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                return spell;
            default:
                JOptionPane.showMessageDialog(null, "You chose the spell: " + spell, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                return spell;
        }
    }

    public void humanSpells(){
        JOptionPane.showMessageDialog(null, "Basic humans know no spells!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
    }

    public void paladinSpellActivation(int rollResult, String spell){
        if(rollResult>=10){
            if(spell.equals("SHIELD OF FAITH")){
                JOptionPane.showMessageDialog(null, "Your shield shines brightly as you take a defensive stance!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            else if(spell.equals("DIVINE FAVOR")){
                JOptionPane.showMessageDialog(null, "Your sword shines brightly with divine radiance!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            else{
                JOptionPane.showMessageDialog(null, "You don't know that spell!" , "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }
        }

        else{
            JOptionPane.showMessageDialog(null, "Your spell failed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public void wizardSpellActivation(int rollResult, String spell){
        if(rollResult>=10){
            if(spell.equals("BURNING HANDS")){
                JOptionPane.showMessageDialog(null, "You hold your hands out, making a triangle. Then bright flames spew from your hands, engulfing everything in front of you", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            else if(spell.equals("MAGIC MISSILE")){
                JOptionPane.showMessageDialog(null, "Bringing your staff infront of you, a bright light appears and a beam of light shoots towards the enemy!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            else if(spell.equals("THUNDERWAVE")){
                JOptionPane.showMessageDialog(null, "You hold out your arms wide, and swing them to a thunderous clap. A deadly shockwave hits your enemy's body.", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }

            else{
                JOptionPane.showMessageDialog(null, "You don't know that spell!" , "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            }
        }

        else{
            JOptionPane.showMessageDialog(null, "Your spell failed?!", "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
