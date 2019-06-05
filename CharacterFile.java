import java.awt.HeadlessException;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class CharacterFile{
    private static String[][] myArray;
    int[] tempArray = new int[28];
    Scanner scanIn = null;
    String fileLocation = File.separator + "Users" + File.separator + "YunaK" + File.separator + "Documents" + File.separator +
            "NetBeansProjects" + File.separator + "TestDungeon" + File.separator +
            "src" + File.separator + "main" + File.separator + "java" + File.separator + "CharacterFile.csv";
    File file = new File(fileLocation);
    int Rowc = 0;
    int x = 0;
    String InputLine = "";
    String characterName = "";
    
    public void editRecord(String enemy, String userClass){
        
        String tempFile = File.separator + "Users" + File.separator + "YunaK" + File.separator + "Documents" + File.separator +
            "NetBeansProjects" + File.separator + "TestDungeon" + File.separator +
            "src" + File.separator + "main" + File.separator + "java" + File.separator + "temp.csv";
        File oldFile = new File(fileLocation);
        File newFile = new File(tempFile);

        for(int counter = 0;counter < 28;counter++){
            tempArray[counter] = Integer.parseInt(myArray[x][counter+1]);
        }

        if(enemy.equalsIgnoreCase("Goblin")){
            if(userClass.equalsIgnoreCase("Paladin")){
                tempArray[0] = tempArray[0]+50;
            }
            else if(userClass.equalsIgnoreCase("Barbarian")){
                tempArray[15] = tempArray[15]+50;
            }
            else if(userClass.equalsIgnoreCase("Wizard")){
                tempArray[8] = tempArray[8]+50;
            }
            else if(userClass.equalsIgnoreCase("Human")){
                tempArray[22] = tempArray[22]+50;
            }
        }
        else if(enemy.equalsIgnoreCase("Orc")){
            if(userClass.equalsIgnoreCase("Paladin")){
                tempArray[0] = tempArray[0]+100;
            }
            else if(userClass.equalsIgnoreCase("Barbarian")){
                tempArray[15] = tempArray[15]+100;
            }
            else if(userClass.equalsIgnoreCase("Wizard")){
                tempArray[8] = tempArray[8]+100;
            }
            else if(userClass.equalsIgnoreCase("Human")){
                tempArray[22] = tempArray[22]+100;
            }
        }
        else if(enemy.equalsIgnoreCase("Giant")){
            if(userClass.equalsIgnoreCase("Paladin")){
                tempArray[0] = tempArray[0]+1800;
            }
            else if(userClass.equalsIgnoreCase("Barbarian")){
                tempArray[15] = tempArray[15]+1800;
            }
            else if(userClass.equalsIgnoreCase("Wizard")){
                tempArray[8] = tempArray[8]+1800;
            }
            else if(userClass.equalsIgnoreCase("Human")){
                tempArray[22] = tempArray[22]+1800;
            }
        }
        
        for(int counter = 0;counter < 28;counter++){
            myArray[x][counter+1] = Integer.toString(tempArray[counter]);
        }
        
        try{
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            scanIn = new Scanner(new File(fileLocation));
            scanIn.useDelimiter("[,\n]");
            
            int counter1 = 0;
            int counter2 = 0;

            while(scanIn.hasNext()){
                myArray[counter1][counter2] = scanIn.next();

                if(myArray[counter1][0].equals(myArray[x][0])){
                    pw.print(myArray[counter1][counter2]);
                    counter2++;
                    JOptionPane.showMessageDialog(null, "File updated user");
                }
                else{
                    pw.print(myArray[counter1][counter2]);
                    counter2++;
                }
                
                if(counter2==28){
                    counter1++;
                    counter2 = 0;
                    pw.println();
                }
            }

            JOptionPane.showMessageDialog(null, "File updated all users");

            scanIn.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(fileLocation);
            newFile.renameTo(dump);
        }
        catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null, "Error, could not write to file.");
        }
    }
    public void characterFile(){

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

        //Main Menu
        Object[] options = {"New File","Continue","Quit"};
        int mainMenu = JOptionPane.showOptionDialog(null,//parent container of JOptionPane
        "Dungeons & Dragons Combat Simulator",
        "Dungeons and Dragons",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,//do not use a custom Icon
        options,//the titles of buttons
        options[2]);//default button title

        if(mainMenu==JOptionPane.YES_OPTION){  //NEW FILE
            String nameTaken = "f";

            JPanel panel2 = new JPanel();
            panel2.add(new JLabel("What is your name?"));

            characterName = JOptionPane.showInputDialog(null, panel2, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);

            x = 0;
            for(x=0;x<Rowc;x++){
                if(characterName.equals(myArray[x][0])){
                    JOptionPane.showMessageDialog(null, "Name " + characterName + " taken");
                    nameTaken="t";
                }
            }
            if(nameTaken.equals("f")){
                try{
                    Writer output;
                    output = new BufferedWriter(new FileWriter(file, true));
                    output.append(characterName + ",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0\n");
                    output.close();

                    try{
                        scanIn = new Scanner(new BufferedReader(new FileReader(file)));
                        while(scanIn.hasNextLine()){
                            InputLine = scanIn.nextLine();
                            String[] InArray = InputLine.split(",");
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
                }
                catch(IOException e){
                    JPanel panel1 = new JPanel();
                    panel1.add(new JLabel("Error 404"));
                    JOptionPane.showMessageDialog(null, panel1, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            }
            x = 0;
            for(x=0;x<Rowc;x++){
                if(characterName.equals(myArray[x][0])){
                    JOptionPane.showMessageDialog(null, "File " + characterName + " loaded");
                    break;
                }
                else if(x==Rowc){
                    JOptionPane.showMessageDialog(null, "File not found");
                    System.exit(0);
                }
            }

            JOptionPane.showMessageDialog(null, characterName + "\nPaladin exp: " + 
            myArray[x][1] + "\nWizard exp: " + myArray[x][8] + 
            "\nBarbarian exp: " + myArray[x][15] + "\nHuman exp: " + 
            myArray[x][22], "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
        }
        else if(mainMenu==JOptionPane.NO_OPTION){   //READ FILE
            JPanel panel2 = new JPanel();
            panel2.add(new JLabel("What is your name?"));
            characterName = JOptionPane.showInputDialog(null, panel2, "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
            x = 1;
            for(x=1;x<Rowc;x++){
                if(characterName.equals(myArray[x][0])){
                    JOptionPane.showMessageDialog(null, "File " + characterName + " loaded");
                    break;
                }
                else if(x==Rowc){
                    JOptionPane.showMessageDialog(null, "File not found");
                    System.exit(0);
                }
            }
            JOptionPane.showMessageDialog(null, characterName + "\nPaladin exp: " + 
            myArray[x][1] + "\nWizard exp: " + myArray[x][8] + 
            "\nBarbarian exp: " + myArray[x][15] + "\nHuman exp: " + 
            myArray[x][22], "Dungeons and Dragons", JOptionPane.PLAIN_MESSAGE);
        }
        
        
        
        else if(mainMenu==JOptionPane.CANCEL_OPTION){   //QUIT
            System.exit(0);
        }
    }
}
