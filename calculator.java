package darkSouls;

import javax.swing.JOptionPane;

public class Calculator
{
	private int slevel, vit, attun, end, str, dex,
		resis, intel, faith;
	private int bslevel, bvit, battun, bend, bstr, bdex,
		bresis, bintel, bfaith;
	
	public Calculator()
	{
		slevel = vit = attun = end = str = dex = resis = intel
				= faith = 0;
	}
	
	public void setClass(String name)
	{
		if (name.equalsIgnoreCase("WARRIOR"))
		{
			bslevel = slevel = 4;
			bvit = vit = 11;
			battun = attun = 8;
			bend = end = 12;
			bstr = str = 13;
			bdex = dex = 13;
			bresis = resis = 11;
			bintel = intel = 9;
			bfaith = faith = 9;
		}
		else if (name.equalsIgnoreCase("KNIGHT"))
		{
			bslevel = slevel = 5;
			bvit = vit = 14;
			battun = attun = 10;
			bend = end = 10;
			bstr = str = 11;
			bdex = dex = 11;
			bresis = resis = 10;
			bintel = intel = 9;
			bfaith = faith = 11;
		}
		else if (name.equalsIgnoreCase("WANDERER"))
		{
			bslevel = slevel = 3;
			bvit = vit = 10;
			battun = attun = 11;
			bend = end = 10;
			bstr = str = 10;
			bdex = dex = 14;
			bresis = resis = 12;
			bintel = intel = 11;
			bfaith = faith = 8;
		}
		else if (name.equalsIgnoreCase("THIEF"))
		{
			bslevel = slevel = 5;
			bvit = vit = 9;
			battun = attun = 11;
			bend = end = 9;
			bstr = str = 9;
			bdex = dex = 15;
			bresis = resis = 10;
			bintel = intel = 12;
			bfaith = faith = 11;
		}
		else if (name.equalsIgnoreCase("BANDIT"))
		{
			bslevel = slevel = 4;
			bvit = vit = 12;
			battun = attun = 8;
			bend = end = 14;
			bstr = str = 14;
			bdex = dex = 9;
			bresis = resis = 11;
			bintel = intel = 8;
			bfaith = faith = 10;
		}
		else if (name.equalsIgnoreCase("HUNTER"))
		{
			bslevel = slevel = 4;
			bvit = vit = 11;
			battun = attun = 9;
			bend = end = 11;
			bstr = str = 12;
			bdex = dex = 14;
			bresis = resis = 11;
			bintel = intel = 9;
			bfaith = faith = 9;
		}
		else if (name.equalsIgnoreCase("SORCERER"))
		{
			bslevel = slevel = 3;
			bvit = vit = 8;
			battun = attun = 15;
			bend = end = 8;
			bstr = str = 9;
			bdex = dex = 11;
			bresis = resis = 18;
			bintel = intel = 15;
			bfaith = faith = 8;
		}
		else if (name.equalsIgnoreCase("PYROMANCER"))
		{
			bslevel = slevel = 1;
			bvit = vit = 10;
			battun = attun = 12;
			bend = end = 11;
			bstr = str = 12;
			bdex = dex = 9;
			bresis = resis = 12;
			bintel = intel = 10;
			bfaith = faith = 8;
		}
		else if (name.equalsIgnoreCase("CLERIC"))
		{
			bslevel = slevel = 2;
			bvit = vit = 11;
			battun = attun = 11;
			bend = end = 9;
			bstr = str = 12;
			bdex = dex = 8;
			bresis = resis = 11;
			bintel = intel = 8;
			bfaith = faith = 14;
		}
		else if (name.equalsIgnoreCase("DEPRIVED"))
		{
			bslevel = slevel = 6;
			bvit = vit = 11;
			battun = attun = 11;
			bend = end = 11;
			bstr = str = 11;
			bdex = dex = 11;
			bresis = resis = 11;
			bintel = intel = 11;
			bfaith = faith = 11;
		}
		else
			throw new IllegalArgumentException();
	}
	
	public void incrementStat(String stat)
	{
		if (stat.equalsIgnoreCase("VIT"))
		{
			if (vit + 1 <= 99)
			{
				vit++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
		else if (stat.equalsIgnoreCase("ATTUN"))
		{
			if (attun + 1 <= 99)
			{
				attun++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
		else if (stat.equalsIgnoreCase("END"))
		{
			if (end + 1 <= 99)
			{
				end++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
		else if (stat.equalsIgnoreCase("STR"))
		{
			if (str + 1 <= 99)
			{
				str++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
		else if (stat.equalsIgnoreCase("DEX"))
		{
			if (dex + 1 <= 99)
			{
				dex++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
		else if (stat.equalsIgnoreCase("RESIS"))
		{
			if (resis + 1 <= 99)
			{
				resis++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
		else if (stat.equalsIgnoreCase("INTEL"))
		{
			if (intel + 1 <= 99)
			{
				intel++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
		else if (stat.equalsIgnoreCase("FAITH"))
		{
			if (faith + 1 <= 99)
			{
				faith++;
				slevel++;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " increase stat any more.");
		}
	}
	
	public void decrementStat(String stat)
	{
		if (stat.equalsIgnoreCase("VIT"))
		{
			if ((vit - 1 >= bvit) && (slevel - 1 >= bslevel))
			{
				vit--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
		else if (stat.equalsIgnoreCase("ATTUN"))
		{
			if ((attun - 1 >= battun) && (slevel - 1 >= bslevel))
			{
				attun--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
		else if (stat.equalsIgnoreCase("END"))
		{
			if ((end - 1 >= bend) && (slevel - 1 >= bslevel))
			{
				end--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
		else if (stat.equalsIgnoreCase("STR"))
		{
			if ((str - 1 >= bstr) && (slevel - 1 >= bslevel))
			{
				str--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
		else if (stat.equalsIgnoreCase("DEX"))
		{
			if ((dex - 1 >= bdex) && (slevel - 1 >= bslevel))
			{
				dex--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
		else if (stat.equalsIgnoreCase("RESIS"))
		{
			if ((resis - 1 >= bresis) && (slevel - 1 >= bslevel))
			{
				resis--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
		else if (stat.equalsIgnoreCase("INTEL"))
		{
			if ((intel - 1 >= bintel) && (slevel - 1 >= bslevel))
			{
				intel--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
		else if (stat.equalsIgnoreCase("FAITH"))
		{
			if ((faith - 1 >= bfaith) && (slevel - 1 >= bslevel))
			{
				faith--;
				slevel--;
			}
			else
				JOptionPane.showMessageDialog(null, "Cannot"
						+ " decrease stat any more.");
		}
	}
	
	public int getStat(String stat)
	{
		if (stat.equalsIgnoreCase("SLEVEL"))
			return slevel;
		else if (stat.equalsIgnoreCase("VIT"))
			return vit;
		else if (stat.equalsIgnoreCase("ATTUN"))
			return attun;
		else if (stat.equalsIgnoreCase("END"))
			return end;
		else if (stat.equalsIgnoreCase("STR"))
			return str;
		else if (stat.equalsIgnoreCase("DEX"))
			return dex;
		else if (stat.equalsIgnoreCase("RESIS"))
			return resis;
		else if (stat.equalsIgnoreCase("INTEL"))
			return intel;
		else if (stat.equalsIgnoreCase("FAITH"))
			return faith;
		else
			return 0;
	}
	
	//Returns total health
	public int getHP()
	{
		if (vit == 1)
			return 400;
		else if (vit == 2)
			return 415;
		else if (vit == 3)
			return 433;
		else if (vit == 4)
			return 451;
		else if (vit == 5)
			return 447;
		else if (vit == 6)
			return 490;
		else if (vit == 7)
			return 511;
		else if (vit == 8)
			return 531;
		else if (vit == 9)
			return 552;
		else if (vit == 10)
			return 573;
		else if (vit == 11)
			return 594;
		else if (vit == 12)
			return 616;
		else if (vit == 13)
			return 638;
		else if (vit == 14)
			return 659;
		else if (vit == 15)
			return 682;
		else if (vit == 16)
			return 698;
		else if (vit == 17)
			return 719;
		else if (vit == 18)
			return 742;
		else if (vit == 19)
			return 767;
		else if (vit == 20)
			return 793;
		else if (vit == 21)
			return 821;
		else if (vit == 22)
			return 849;
		else if (vit == 23)
			return 878;
		else if (vit == 24)
			return 908;
		else if (vit == 25)
			return 938;
		else if (vit == 26)
			return 970;
		else if (vit == 27)
			return 1001;
		else if (vit == 28)
			return 1034;
		else if (vit == 29)
			return 1066;
		else if (vit == 30)
			return 1100;
		else if (vit == 31)
			return 1123;
		else if (vit == 32)
			return 1147;
		else if (vit == 33)
			return 1170;
		else if (vit == 34)
			return 1193;
		else if (vit == 35)
			return 1216;
		else if (vit == 36)
			return 1239;
		else if (vit == 37)
			return 1261;
		else if (vit == 38)
			return 1283;
		else if (vit == 39)
			return 1304;
		else if (vit == 40)
			return 1325;
		else if (vit == 41)
			return 1346;
		else if (vit == 42)
			return 1366;
		else if (vit == 43)
			return 1386;
		else if (vit == 44)
			return 1405;
		else if (vit == 45)
			return 1424;
		else if (vit == 46)
			return 1442;
		else if (vit == 47)
			return 1458;
		else if (vit == 48)
			return 1474;
		else if (vit == 49)
			return 1489;
		else if (vit == 50)
			return 1500;
		else if (vit == 51)
			return 1508;
		else if (vit == 52)
			return 1517;
		else if (vit == 53)
			return 1526;
		else if (vit == 54)
			return 1535;
		else if (vit == 55)
			return 1544;
		else if (vit == 56)
			return 1553;
		else if (vit == 57)
			return 1562;
		else if (vit == 58)
			return 1571;
		else if (vit == 59)
			return 1580;
		else if (vit == 60)
			return 1588;
		else if (vit == 61)
			return 1597;
		else if (vit == 62)
			return 1606;
		else if (vit == 63)
			return 1615;
		else if (vit == 64)
			return 1623;
		else if (vit == 65)
			return 1632;
		else if (vit == 66)
			return 1641;
		else if (vit == 67)
			return 1649;
		else if (vit == 68)
			return 1658;
		else if (vit == 69)
			return 1666;
		else if (vit == 70)
			return 1675;
		else if (vit == 71)
			return 1683;
		else if (vit == 72)
			return 1692;
		else if (vit == 73)
			return 1700;
		else if (vit == 74)
			return 1709;
		else if (vit == 75)
			return 1717;
		else if (vit == 76)
			return 1725;
		else if (vit == 77)
			return 1734;
		else if (vit == 78)
			return 1742;
		else if (vit == 79)
			return 1750;
		else if (vit == 80)
			return 1758;
		else if (vit == 81)
			return 1767;
		else if (vit == 82)
			return 1775;
		else if (vit == 83)
			return 1783;
		else if (vit == 84)
			return 1791;
		else if (vit == 85)
			return 1799;
		else if (vit == 86)
			return 1807;
		else if (vit == 87)
			return 1814;
		else if (vit == 88)
			return 1822;
		else if (vit == 89)
			return 1830;
		else if (vit == 90)
			return 1837;
		else if (vit == 91)
			return 1845;
		else if (vit == 92)
			return 1852;
		else if (vit == 93)
			return 1860;
		else if (vit == 94)
			return 1867;
		else if (vit == 95)
			return 1874;
		else if (vit == 96)
			return 1881;
		else if (vit == 97)
			return 1888;
		else if (vit == 98)
			return 1894;
		else if (vit == 99)
			return 1900;
		else 
			return 0;
	}
	
	//Returns number of attunement slots
	public int getSlots()
	{
		if (attun >= 0 && attun <= 9)
			return 0;
		else if (attun >= 10 && attun <= 11)
			return 1;
		else if (attun >= 12 && attun <= 13)
			return 2;
		else if (attun >= 14 && attun <= 15)
			return 3;
		else if (attun >= 16 && attun <= 18)
			return 4;
		else if (attun >= 19 && attun <= 22)
			return 5;
		else if (attun >= 23 && attun <= 27)
			return 6;
		else if (attun >= 28 && attun <= 33)
			return 7;
		else if (attun >= 34 && attun <= 40)
			return 8;
		else if (attun >= 41 && attun <= 49)
			return 9;
		else
			return 10;
	}
	
	//Returns total stamina
	public int getStam()
	{
		if (end == 1)
			return 81;
		else if (end == 2)
			return 82;
		else if (end == 3)
			return 83;
		else if (end == 4)
			return 84;
		else if (end == 5)
			return 85;
		else if (end == 6)
			return 86;
		else if (end == 7)
			return 87;
		else if (end == 8)
			return 88;
		else if (end == 9)
			return 90;
		else if (end == 10)
			return 91;
		else if (end == 11)
			return 93;
		else if (end == 12)
			return 95;
		else if (end == 13)
			return 97;
		else if (end == 14)
			return 98;
		else if (end == 15)
			return 100;
		else if (end == 16)
			return 102;
		else if (end == 17)
			return 104;
		else if (end == 18)
			return 106;
		else if (end == 19)
			return 108;
		else if (end == 20)
			return 110;
		else if (end == 21)
			return 112;
		else if (end == 22)
			return 115;
		else if (end == 23)
			return 117;
		else if (end == 24)
			return 119;
		else if (end == 25)
			return 121;
		else if (end == 26)
			return 124;
		else if (end == 27)
			return 126;
		else if (end == 28)
			return 129;
		else if (end == 29)
			return 131;
		else if (end == 30)
			return 133;
		else if (end == 31)
			return 136;
		else if (end == 32)
			return 139;
		else if (end == 33)
			return 141;
		else if (end == 34)
			return 144;
		else if (end == 35)
			return 146;
		else if (end == 36)
			return 149;
		else if (end == 37)
			return 152;
		else if (end == 38)
			return 154;
		else if (end == 39)
			return 157;
		else
			return 160;
	}
	
	//Returns equipment burden
	public int getEqu()
	{
		return (end + 40);
	}
	
	//Returns level cost
	public int getCost()
	{
		if (slevel == 1)
			return 0;
		else if (slevel == 2)
			return 673;
		else if (slevel == 3)
			return 690;
		else if (slevel == 4)
			return 707;
		else if (slevel == 5)
			return 724;
		else if (slevel == 6)
			return 741;
		else if (slevel == 7)
			return 758;
		else if (slevel == 8)
			return 775;
		else if (slevel == 9)
			return 793;
		else if (slevel == 10)
			return 811;
		else if (slevel == 11)
			return 829;
		else if (slevel >= 12)
			return (int) Math.ceil((0.02 * (Math.pow(slevel, 3)) +
					3.06 * (Math.pow(slevel, 2)) + 105.6 * slevel - 895));
		else return 0;
	}
	
	//Returns total cost of all levels gained
	public int getTotalCost()
	{
		if (slevel == bslevel)
			return 0;
		else
		{
			int templevel = slevel;
			slevel = bslevel;
			int sum = 0;
			
			for (int i = bslevel; i < templevel; i++)
			{
				sum += this.getCost();
				slevel++;
			}
			
			slevel = templevel;
			return sum;
		}
	}
}
