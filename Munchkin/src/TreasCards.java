import java.util.ArrayList;

public class TreasCards 
{		
		protected String type;
		protected String name;
		
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
		static ArrayList<TreasCards >listOfTC = new ArrayList<TreasCards>();
			
		public void makeTreasCards()
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
		listOfTC.add(new Armor("Footgear", "Sandals Of Protection: Curse cards which you draw when kicking down the door have no effect. (Curses cast by other players will still affect you.)", 0, 0, 700));
		listOfTC.add(new Armor("Headgear", "Helm Of Courage", 1, 0, 200));
		listOfTC.add(new RandomBonus("Random Bonus", "Limburger And Anchovy Sandwich", 3, 400));
		listOfTC.add(new RandomBonus("Random Bonus", "Pantyhose of Giant Strength", 3, 600));
		listOfTC.add(new RandomBonus("Random Bonus", "Spiky Knees", 1, 200));		
		listOfTC.add(new Race("Race","Elf", "You go up a level for every monster you help someone else kill."));
		listOfTC.add(new Race("Race","Halfling", "You may sell one item each turn for double price (other items are at normal price)."));
		listOfTC.add(new Race("Race","Half-Breed", "You may have two Race cards, and have all the advantages adn disadvantages of each. Or you may have one Race card and have al of its advantages and none of its disadvantages."));
		listOfTC.add(new Race("Race","Elf", "You go up a level for every monster you help someone else kill."));
		listOfTC.add(new Race("Race","Halfling", "You may sell one item each turn for double price (other items are at normal price)."));
		listOfTC.add(new Race("Race","Dwarf", "You can carry any number of Big items. You may have 6 cards in your hand."));
		listOfTC.add(new Race("Race","Dwarf", "You can carry any number of Big items. You may have 6 cards in your hand."));

		}
}