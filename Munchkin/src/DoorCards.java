import java.util.ArrayList;


public class DoorCards 
	{	
	protected String desc;
	protected String type;
	protected String name;
	protected int level;
	protected int treasures;
	protected int levelsGiven;
	protected int effect;
	

	public int getEffect()
		{
		return effect;
		}

	public void setEffect(int effect)
		{
		this.effect = effect;
		}
	
	public int getTreasures()
		{
		return treasures;
		}

	public void setTreasures(int treasures)
		{
		this.treasures = treasures;
		}

	
	public int getLevel()
		{
		return level;
		}

	public void setLevel(int level)
		{
		this.level = level;
		}

	public int getLevelsGiven()
		{
		return levelsGiven;
		}

	public void setLevelsGiven(int levelsGiven)
		{
		this.levelsGiven = levelsGiven;
		}
	
	public String getDesc()
		{
		return desc;
		}
	public void setDesc(String desc)
		{
		this.desc = desc;
		}
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


	
	static ArrayList<DoorCards> listOfDoorCards = new ArrayList <DoorCards>();
	public static void makeDoorCards()
		{
		listOfDoorCards.add(new MonsterC("Monster", "Lame Goblin", 1, 1, "Bad Stuff: He whacks you with his crutch.\nYou lose a level.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Maul Rat", 1, 1,  "A creature from Hell. \nBad Stuff: She whack you. Lose a level.", 1));
		listOfDoorCards.add(new MonsterC("Monster", "Hippogriff", 16, 2, "Bad Stuff: You are stomped and chomped. You drop things as you flee. Loose two cards.", 4));
		listOfDoorCards.add(new MonsterC("Monster", "Large Angry Chicken", 2, 1, "Bad stuff: Very painful pecking. lose a level." , 1));
		listOfDoorCards.add(new MonsterC("Monster", "Squidzilla", 18, 2,  "Slimy! Bad Stuff: You are grabbed, slimed, crushed, and gobbled. You are dead, dead, dead.\nAny questions?", 4));
		listOfDoorCards.add(new MonsterC("Monster", "BigFoot", 12, 1, "Bad Stuff: Stomps you flat and eats your hat. Lose the Headgear you were wearing.", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Shrieking Geek", 6, 1,"Bad Stuff: You become a normal, boring Human.\nDiscard any Race or Class cards in play.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "King Tut", 16, 2,  "Bad Stuff: Lose all your items and all cards in your hand.", 4));
		listOfDoorCards.add(new MonsterC("Monster", "Ghoulfiends", 8, 1, "Bad Stuff: Your level becomes equal to 1.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Net Troll", 10, 1, "He has no special powers, and he's really mad about it.Bad Stuff:You die. The End.", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Potted Plant", 1, 1, "Bad Stuff: None. Escape is automatic.", 1));
		listOfDoorCards.add(new MonsterC("Monster", "Harpies", 4, 1, "Bad Sutff: Their music is really, really bad. Lose 2 levels.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Tongue Demon", 12, 1, "A creature from Hell. Bad Stuff: A really disgusting kiss costs you 2 levels.", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Lawyers", 6, 1, "Bad Stuff: He hits you with an injunction. Discard two cards.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "3,872 Orcs", 10, 1, "Bad Stuff: lose 3 levels.", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Leperchaun", 4, 1, "He's gross! Bad Stuff: He takes two items from you- randomly chosen of course.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Wannabe Vampire", 12, 1, "Bad Stuff: Blocks the door and tells you about his character. Lose 3 levels.", 3));
		listOfDoorCards.add(new CursesC("Curse", "Duck Of Doom", "You should know better than to pick up a duck in a dungeon. Lose 2 levels."));
		listOfDoorCards.add(new CursesC("Curse", "Lose A Level", "Lose a level."));
		listOfDoorCards.add(new CursesC("Curse", "Truly Obnoxious Curse", "Lose the item that gives you the biggest bonus."));
		listOfDoorCards.add(new CursesC("Curse", "Lose Two Cards", "First the player to the victim's left draws a card from the victim's hand and keeps it.Then the player on the right does the same."));
		listOfDoorCards.add(new CursesC("Curse", "Lose 1 Small Item", "Choose one small item to discard. any item that is not designated Big is small."));
		listOfDoorCards.add(new CursesC("Curse", "Lose Your Race", "Discard any Race(s) you have in play and become a Human."));
		listOfDoorCards.add(new CursesC("Curse", "Lose The Footgear You Are Wearing", "Lose the footgear you are wearing."));
		listOfDoorCards.add(new CursesC("Curse", "Chicken On Your Head", "-1 to all your die rolls. Any Curse or Bad Stuff that removes your Headgear will take the chicken with it."));
		listOfDoorCards.add(new CursesC("Curse", "Income Tax", "Discard one item of your choise. Every other player must now discard an item, or items, totaling at least as much value as the item yo discarded. If they don't have enough to pay te full tax, they must discard all their items and lose a level."));
		listOfDoorCards.add(new ClassC("Class", "Wizard", "Fight Spell: You may discard up to 3 cards after rolling the die to Run Away; each one gives you a +1 bonus to flee. Charm Spell: You may discard your whole hand (minimum 3 cards) to charm a signle Monster instead of fighting it. Discard the Monster instead of fighting it. Discard the Monster and take its Treasure but don't gain levels. If there are other monsters in the combat, fight them normally."));
		listOfDoorCards.add(new ClassC("Class", "Wizard", "Fight Spell: You may discard up to 3 cards after rolling the die to Run Away; each one gives you a +1 bonus to flee. Charm Spell: You may discard your whole hand (minimum 3 cards) to charm a signle Monster instead of fighting it. Discard the Monster instead of fighting it. Discard the Monster and take its Treasure but don't gain levels. If there are other monsters in the combat, fight them normally."));
		listOfDoorCards.add(new ClassC("Class", "Cleric", "Resurrection: When it is time for you to draw cards face-up you may instead take some or all from the top of the appropriate discard pile. You must then discard one card from your hand for each card so drawn. Turning: You may discard up to 3 cards in combat against an Undead creature. Each discard give you a +3 bonus."));
		listOfDoorCards.add(new ClassC("Class", "Cleric", "Resurrection: When it is time for you to draw cards face-up you may instead take some or all from the top of the appropriate discard pile. You must then discard one card from your hand for each card so drawn. Turning: You may discard up to 3 cards in combat against an Undead creature. Each discard give you a +3 bonus."));
		listOfDoorCards.add(new ClassC("Class", "Thief", "Backstabbing: You may discard a card to backstab another player (-2 in combat). You may do this only once per victim per combat, but if two players are fighting a monster together, you may backstab each of them. Theft: You may discard a card to try to steal a small item carried by another player. Roll a die; 4 or more succeeds. Otherwise, you get whacked and lose a level."));
		listOfDoorCards.add(new ClassC("Class", "Thief", "Backstabbing: You may discard a card to backstab another player (-2 in combat). You may do this only once per victim per combat, but if two players are fighting a monster together, you may backstab each of them. Theft: You may discard a card to try to steal a small item carried by another player. Roll a die; 4 or more succeeds. Otherwise, you get whacked and lose a level."));
		listOfDoorCards.add(new ClassC("Class", "Warrior", "Berserking: You may discard up to 3 cards in combat; each one gives you a +1 bonus. You win ties in combat."));
		listOfDoorCards.add(new ClassC("Class", "Warrior", "Berserking: You may discard up to 3 cards in combat; each one gives you a +1 bonus. You win ties in combat."));
		listOfDoorCards.add(new ClassC("Class", "Super Munchkin", "You may have two Class cards, and have all of the advantages and disadvantages of each. Or you may have all of its advantages and none of its disadvantages (for example, monsters that hate Clerics will have no bonus against a Super Cleric). Lose this card if you lose all your Class card(s)."));
		listOfDoorCards.add(new ClassC("Class", "Super Munchkin", "You may have two Class cards, and have all of the advantages and disadvantages of each. Or you may have all of its advantages and none of its disadvantages (for example, monsters that hate Clerics will have no bonus against a Super Cleric). Lose this card if you lose all your Class card(s)."));


		}
	}
	
