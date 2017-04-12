package darkSouls;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Interface
{	
	//Initializes all the buttons and labels to be used.
	static Calculator calc = new Calculator();
	static JButton closeButton = new JButton("Close");
	static JButton addVit = new JButton("+");
	static JButton subVit = new JButton("-");
	static JButton addAttun = new JButton("+");
	static JButton subAttun = new JButton("-");
	static JButton addEnd = new JButton("+");
	static JButton subEnd = new JButton("-");
	static JButton addStr = new JButton("+");
	static JButton subStr = new JButton("-");
	static JButton addDex = new JButton("+");
	static JButton subDex = new JButton("-");
	static JButton addResis = new JButton("+");
	static JButton subResis = new JButton("-");
	static JButton addIntel = new JButton("+");
	static JButton subIntel = new JButton("-");
	static JButton addFaith = new JButton("+");
	static JButton subFaith = new JButton("-");
	static ButtonHandler listen = new ButtonHandler();
	   
	static JLabel vit = new JLabel("Vit");
	static JLabel attun = new JLabel("Attun");
	static JLabel end = new JLabel("End");
	static JLabel str = new JLabel("Str");
	static JLabel dex = new JLabel("Dex");
	static JLabel resis = new JLabel("Resis");
	static JLabel intel = new JLabel("Intel");
	static JLabel faith = new JLabel("Faith");
	static JLabel health = new JLabel("Health");
	static JLabel slots = new JLabel("Attun Slots");
	static JLabel stamina = new JLabel("Stamina");
	static JLabel equip = new JLabel("Equip Burden");
	static JLabel soullevel = new JLabel("SL");
	static JLabel soulscost = new JLabel("SL Cost");
	static JLabel totalcost = new JLabel("Total Cost");
	
	//Handles all button presses by updating JLabels and adjusting stats accordingly.
	private static class ButtonHandler implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getActionCommand().equals("Close"))
				System.exit(0);
			else if (e.getActionCommand().equals("VitInc"))
				{
				calc.incrementStat("VIT");
				vit.setText("Vitality " + calc.getStat("VIT"));
				health.setText("Health " + calc.getHP());
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("VitDec"))
				{
				calc.decrementStat("VIT");
				vit.setText("Vitality " + calc.getStat("VIT"));
				health.setText("Health " + calc.getHP());
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("AttunInc"))
				{
				calc.incrementStat("ATTUN");
				attun.setText("Attunement " + calc.getStat("ATTUN"));
				slots.setText("Attunement Slots " + calc.getSlots());
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("AttunDec"))
				{
				calc.decrementStat("ATTUN");
				attun.setText("Attunement " + calc.getStat("ATTUN"));
				slots.setText("Attunement Slots " + calc.getSlots());
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("EndInc"))
				{
				calc.incrementStat("END");
				end.setText("Endurance " + calc.getStat("END"));
				stamina.setText("Stamina " + calc.getStam());
				equip.setText("Equip Burden " + calc.getEqu());
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("EndDec"))
				{
				calc.decrementStat("END");
				end.setText("Endurance " + calc.getStat("END"));
				stamina.setText("Stamina " + calc.getStam());
				equip.setText("Equip Burden " + calc.getEqu());
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("StrInc"))
				{
				calc.incrementStat("STR");
				str.setText("Strength " + calc.getStat("STR"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("StrDec"))
				{
				calc.decrementStat("STR");
				str.setText("Strength " + calc.getStat("STR"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("DexInc"))
				{
				calc.incrementStat("DEX");
				dex.setText("Dexterity " + calc.getStat("DEX"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("DexDec"))
				{
				calc.decrementStat("DEX");
				dex.setText("Dexterity " + calc.getStat("DEX"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("ResisInc"))
				{
				calc.incrementStat("RESIS");
				resis.setText("Resistance " + calc.getStat("RESIS"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("ResisDec"))
				{
				calc.decrementStat("RESIS");
				resis.setText("Resistance " + calc.getStat("RESIS"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("IntelInc"))
				{
				calc.incrementStat("INTEL");
				intel.setText("Intelligence " + calc.getStat("INTEL"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("IntelDec"))
				{
				calc.decrementStat("INTEL");
				intel.setText("Intelligence " + calc.getStat("INTEL"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("FaithInc"))
				{
				calc.incrementStat("FAITH");
				faith.setText("Faith " + calc.getStat("FAITH"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
			else if (e.getActionCommand().equals("FaithDec"))
				{
				calc.decrementStat("FAITH");
				faith.setText("Faith " + calc.getStat("FAITH"));
				soullevel.setText("Level " + calc.getStat("SLEVEL"));
				soulscost.setText("Cost to get Level " + calc.getCost());
				totalcost.setText("Total Cost " + calc.getTotalCost());
				}
		}
	}
	
	public static void main(String[] args) throws IOException 
	{
		boolean exitloop = false;
		int theclass;
		  
			//An error-trapping loop that keeps asking for correct input to select a class for base stats.
		  	while (!exitloop)
		  	{
				  try
				  {
					  theclass = Integer.parseInt((JOptionPane.showInputDialog("Please enter "
					  		+ "the number next to the class you wish to calculate for:\n\n1. Warrior\n"
					  		+ "2. Knight\n3. Wanderer\n4. Thief\n5. Bandit\n6. Hunter\n7. Sorcerer\n8."
					  		+ " Pyromancer\n9. Cleric\n10. Deprived\n\nOr enter 0 to close the program.")));
					  if (theclass == 1)
						  calc.setClass("WARRIOR");
					  else if (theclass == 2)
						  calc.setClass("KNIGHT");
					  else if (theclass == 3)
						  calc.setClass("WANDERER");
					  else if (theclass == 4)
						  calc.setClass("THIEF");
					  else if (theclass == 5)
						  calc.setClass("BANDIT");
					  else if (theclass == 6)
						  calc.setClass("HUNTER");
					  else if (theclass == 7)
						  calc.setClass("SORCERER");
					  else if (theclass == 8)
						  calc.setClass("PYROMANCER");
					  else if (theclass == 9)
						  calc.setClass("CLERIC");
					  else if (theclass == 10)
						  calc.setClass("DEPRIVED");
					  else if (theclass == 0)
						  System.exit(0);
					  else
						  calc.setClass("invalid");
					  
					  exitloop = true;
				  }
				  catch (IllegalArgumentException e)
				  {
					  JOptionPane.showMessageDialog(null, "Invalid number. The entry must be an integer between 1 and 10.");
				  }
			  }
	
	   // Initially puts in each of the JLabels in their proper places.
	   vit.setText("Vitality " + calc.getStat("VIT"));
	   vit.setBounds(200, 205, 500, 50);
	   attun.setText("Attunement " + calc.getStat("ATTUN"));
	   attun.setBounds(200, 275, 500, 50);
	   end.setText("Endurance " + calc.getStat("END"));
	   end.setBounds(200, 345, 500, 50);
	   str.setText("Strength " + calc.getStat("STR"));
	   str.setBounds(200, 415, 500, 50);
	   dex.setText("Dexterity " + calc.getStat("DEX"));
	   dex.setBounds(390, 205, 500, 50);
	   resis.setText("Resistance " + calc.getStat("RESIS"));
	   resis.setBounds(390, 275, 500, 50);
	   intel.setText("Intelligence " + calc.getStat("INTEL"));
	   intel.setBounds(390, 345, 500, 50);
	   faith.setText("Faith " + calc.getStat("FAITH"));
	   faith.setBounds(390, 415, 500, 50);
	   health.setText("Health " + calc.getHP());
	   health.setBounds(550, 205, 500, 50);
	   slots.setText("Attunement Slots " + calc.getSlots());
	   slots.setBounds(550, 275, 500, 50);
	   stamina.setText("Stamina " + calc.getStam());
	   stamina.setBounds(550, 345, 500, 50);
	   equip.setText("Equip Burden " + calc.getEqu());
	   equip.setBounds(550, 415, 500, 50);
	   soullevel.setText("Level " + calc.getStat("SLEVEL"));
	   soullevel.setBounds(160, 475, 500, 50);
	   soulscost.setText("Cost to get Level " + calc.getCost());
	   soulscost.setBounds(335, 475, 500, 50);
	   totalcost.setText("Total Cost " + calc.getTotalCost());
	   totalcost.setBounds(530, 475, 500, 50);
	   
	   //Adds functionality to the buttons.
	   closeButton.addActionListener(listen);
	   addVit.addActionListener(listen);
	   subVit.addActionListener(listen);
	   addAttun.addActionListener(listen);
	   subAttun.addActionListener(listen);
	   addEnd.addActionListener(listen);
	   subEnd.addActionListener(listen);
	   addStr.addActionListener(listen);
	   subStr.addActionListener(listen);
	   addDex.addActionListener(listen);
	   subDex.addActionListener(listen);
	   addResis.addActionListener(listen);
	   subResis.addActionListener(listen);
	   addIntel.addActionListener(listen);
	   subIntel.addActionListener(listen);
	   addFaith.addActionListener(listen);
	   subFaith.addActionListener(listen);
	   
	   //Adds commands specific to each button so stats can be individually changed.
	   closeButton.setActionCommand("Close");
	   addVit.setActionCommand("VitInc");
	   subVit.setActionCommand("VitDec");
	   addAttun.setActionCommand("AttunInc");
	   subAttun.setActionCommand("AttunDec");
	   addEnd.setActionCommand("EndInc");
	   subEnd.setActionCommand("EndDec");
	   addStr.setActionCommand("StrInc");
	   subStr.setActionCommand("StrDec");
	   addDex.setActionCommand("DexInc");
	   subDex.setActionCommand("DexDec");
	   addResis.setActionCommand("ResisInc");
	   subResis.setActionCommand("ResisDec");
	   addIntel.setActionCommand("IntelInc");
	   subIntel.setActionCommand("IntelDec");
	   addFaith.setActionCommand("FaithInc");
	   subFaith.setActionCommand("FaithDec");
	  
	   //Puts the JButtons in their proper places
	   closeButton.setBounds(360, 520, 68, 30);
	   addVit.setBounds(100, 200, 42, 30);
	   subVit.setBounds(100, 230, 42, 30);
	   addAttun.setBounds(100, 270, 42, 30);
	   subAttun.setBounds(100, 300, 42, 30);
	   addEnd.setBounds(100, 340, 42, 30);
	   subEnd.setBounds(100, 370, 42, 30);
	   addStr.setBounds(100, 410, 42, 30);
	   subStr.setBounds(100, 440, 42, 30);
	   addDex.setBounds(310, 200, 42, 30);
	   subDex.setBounds(310, 230, 42, 30);
	   addResis.setBounds(310, 270, 42, 30);
	   subResis.setBounds(310, 300, 42, 30);
	   addIntel.setBounds(310, 340, 42, 30);
	   subIntel.setBounds(310, 370, 42, 30);
	   addFaith.setBounds(310, 410, 42, 30);
	   subFaith.setBounds(310, 440, 42, 30);
	   
	   //Puts a banner at the top of the calculator
	   String bannerpath = "DS Calculator Banner.png";
	   File bannerfile = new File(bannerpath);
	   BufferedImage thebanner = ImageIO.read(bannerfile);
	   JLabel banner = new JLabel(new ImageIcon(thebanner));
	   banner.setBounds(0, -100, 800, 400);
	   
	   //Adds all the buttons, labels, and the image
	   JPanel content = new JPanel();
	   content.setLayout(null);
	   content.add(closeButton);
	   content.add(addVit);
	   content.add(subVit);
	   content.add(addAttun);
	   content.add(subAttun);
	   content.add(addEnd);
	   content.add(subEnd);
	   content.add(addStr);
	   content.add(subStr);
	   content.add(addDex);
	   content.add(subDex);
	   content.add(addResis);
	   content.add(subResis);
	   content.add(addIntel);
	   content.add(subIntel);
	   content.add(addFaith);
	   content.add(subFaith);
	   content.add(vit);
	   content.add(attun);
	   content.add(end);
	   content.add(str);
	   content.add(dex);
	   content.add(resis);
	   content.add(intel);
	   content.add(faith);
	   content.add(health);
	   content.add(slots);
	   content.add(equip);
	   content.add(stamina);
	   content.add(banner);
	   content.add(soullevel);
	   content.add(soulscost);
	   content.add(totalcost);
	   
	   //Creates the window and gives it a specific icon
	   JFrame window = new JFrame("Dark Souls Stat Calculator");
	   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   window.setIconImage(Toolkit.getDefaultToolkit().getImage("DS Icon.png"));
	   window.setContentPane(content);
	   window.setSize(800, 600);
	   window.setLocation(500, 50);
	   window.setVisible(true);
	   }
}
