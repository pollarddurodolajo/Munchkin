import java.util.ArrayList;

public class TreasCards
{
		protected String type;
		protected String name;
		protected int bonus;
		private int value;
		
		ArrayList<TreasCards> listOfTC = new ArrayList<TreasCards>();
		public void makeDoorCards()
		{
		listOfTC.add(new TreasCards("Weapon", "Mace of Sharpness", "", 4, 1, 2, 600));
		listOfTC.add(new TreasCards("Weapon", "Broad Sword", "", 3, 1, 2, 400));
		listOfTC.add(new TreasCards("Weapon", "Huge Rock", "", 3, 2, 1, 0));
		listOfTC.add(new TreasCards("Weapon", "11 Foot Pole", "", 1, 2, 2, 200));
		listOfTC.add(new TreasCards("Weapon", "Hammer of Kneecapping", "", 4, 1, 2, 600));
		listOfTC.add(new TreasCards("Weapon", "Staff of Napalam", "", 5, 1, 2, 800));
		listOfTC.add(new TreasCards("Weapon", "Rapier of Unfairness", "", 3, 1, 2, 600));
		listOfTC.add(new TreasCards("Weapon", "Stepladder", "", 3, 1, 1, 400));
		listOfTC.add(new TreasCards("Weapon", "Cheese Grater of Peace", "", 3, 1, 2, 400));
		listOfTC.add(new TreasCards("Potion", "Pollymorph Potion", "Use during any combat. Turns any one monster into a parrot, which flies away, leaving its treasure behind. Usable once only.", 0, 0, 2, 1300));
		listOfTC.add(new TreasCards("Potion", "Flaming Poison Potion", "Use during any combat. +3 to either side. Usable once only.", 0, 0, 2, 100));
		listOfTC.add(new TreasCards("Potion", "Cotion of Ponfusion", "Use during any combat. +3 to either side. Usable once only.", 0, 0, 2, 100));
		listOfTC.add(new TreasCards("Armor", "Flaming Armor", "", 2, 0, 2, 400));
		listOfTC.add(new TreasCards("Armor", "Slimy Armor", "", 1, 0, 2, 200));
		listOfTC.add(new TreasCards("Armor", "Mithril Armor", "", 3, 0, 1, 600));
		listOfTC.add(new TreasCards("Footgear", "Sandals Of Protection", "Curse cards which you draw when kicking down the door have no effect. (Curses cast by other players will still affect you.)", 0, 0, 2, 700));
		listOfTC.add(new TreasCards("Headgear", "Helm Of Courage", "", 1, 0, 2, 200));
		listOfTC.add(new TreasCards("Random Bonus", "Limburger And Anchovy Sandwich", "", 3, 0, 2, 400));
		listOfTC.add(new TreasCards("Random Bonus", "Pantyhose of Giant Strength", "", 3, 0, 2, 600));
		listOfTC.add(new TreasCards("Random Bonus", "Spiky Knees", "", 1, 0, 2, 200));
		listOfTC.add(new TreasCards("Random Bonus", "Hireling", "Allows you to carry and use one extra item, even if you could not otherwise. If you lose your Hireling, the item goes too. You may discard your Hireling for an automatic escape from any monster.", 1, 0, 2, 0));
		listOfTC.add(new TreasCards("GUAL", "Go Up A Level", "You can't use this if you are currently the highest-Level player, or tied for highest.", 0, 0, 2, 0));
		
		}
}