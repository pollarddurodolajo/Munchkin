import java.util.ArrayList;

public class TreasCards 
{		
		protected String type;
		protected String name;
		protected int bonus;
		protected int goldValue;
		protected int goldVal;
		protected int bigOrSmall;
		protected String desc;
		
		public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public String getType()
		{
		return type;
		}
	public void setType(String type)
		{
		this.type = type;
		}
	
	public int getBonus()
		{
		return bonus;
		}

	public void setBonus(int bonus)
		{
		this.bonus = bonus;
		}

	public int getGoldValue()
		{
		return goldValue;
		}

	public void setGoldValue(int goldValue)
		{
		this.goldValue = goldValue;
		}
	public int getGoldVal()
		{
		return goldVal;
		}
	
	public void setGoldVal(int goldVal)
		{
		this.goldVal = goldVal;
		}
	
	public int getBigOrSmall()
		{
		return bigOrSmall;
		}
	
	public void setBigOrSmall(int bigOrSmall)
		{
		this.bigOrSmall = bigOrSmall;
		}
	
	public String getDesc()
		{
		return desc;
		}

	public void setDesc(String desc)
		{
		this.desc = desc;
		}
	
		static ArrayList<TreasCards >listOfTC = new ArrayList<TreasCards>();
	
			
		public static void makeTreasCards()
		{
		listOfTC.add(new Weapons("Weapon", "Mace of Sharpness", 4, 0, 600));
		listOfTC.add(new Weapons("Weapon", "Broad Sword", 3, 0, 400));
		listOfTC.add(new Weapons("Weapon", "Huge Rock", 3, 1, 0));
		listOfTC.add(new Weapons("Weapon", "11 Foot Pole", 1, 0, 200));
		listOfTC.add(new Weapons("Weapon", "Hammer of Kneecapping", 4, 0, 600));
		listOfTC.add(new Weapons("Weapon", "Staff of Napalam", 5, 0, 800));
		listOfTC.add(new Weapons("Weapon", "Rapier of Unfairness", 3, 0, 600));
		listOfTC.add(new Weapons("Weapon", "Stepladder", 3, 1, 400));
		listOfTC.add(new Weapons("Weapon", "Cheese Grater of Peace", 3, 0, 400));
		listOfTC.add(new Potion("Potion", "Pollymorph Potion", "Use during any combat. Turns any one monster into a parrot, which flies away, leaving its treasure behind. Usable once only.", 1300));
		listOfTC.add(new Potion("Potion", "Flaming Poison Potion", "Use during any combat. +3 to either side. Usable once only.", 100));
		listOfTC.add(new Potion("Potion", "Cotion of Ponfusion", "Use during any combat. +3 to either side. Usable once only.", 100));
		listOfTC.add(new Armor("Armor", "Flaming Armor", 2, 0, 400));
		listOfTC.add(new Armor("Armor", "Slimy Armor", 1, 0, 200));
		listOfTC.add(new Armor("Armor", "Mithril Armor", 3, 1, 600));
		listOfTC.add(new Armor("Footgear", "Sandals Of Protection", 2, 0, 700));
		listOfTC.add(new Armor("Headgear", "Helm Of Courage", 1, 0, 200));
		listOfTC.add(new RandomBonus("Random Bonus", "Limburger And Anchovy Sandwich", 3, 400));
		listOfTC.add(new RandomBonus("Random Bonus", "Pantyhose of Giant Strength", 3, 600));
		listOfTC.add(new RandomBonus("Random Bonus", "Spiky Knees", 1, 200));		
		listOfTC.add(new Race("Race","Elf", "Nothing special about this but you are an elf so yeah."));
		listOfTC.add(new Race("Race","Halfling", "Nothing special about this but you are a halfling so yeah."));
		listOfTC.add(new Race("Race","Elf", "Nothing special about this but you are an elf so yeah."));
		listOfTC.add(new Race("Race","Halfling", "Nothing special about this but you are a halfling so yeah."));
		listOfTC.add(new Race("Race","Dwarf", "Nothing special about this but you are a dwarf so yeah."));
		listOfTC.add(new Race("Race","Dwarf", "Nothing special about this but you are a dwarf so yeah."));

		}
}