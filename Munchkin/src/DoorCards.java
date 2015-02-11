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
	public void makeDoorCards()
		{
		listOfDoorCards.add(new MonsterC("Monster", "Lame Goblin", 1, 1, "Bad Stuff: He whacks you with his crutch. You lose a level.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Maul Rat", 1, 1,  "A creature from Hell. +3 against Clerics. Bad Stuff: She whack you. Lose a level.", 1));
		listOfDoorCards.add(new MonsterC("Monster", "Hippogriff", 16, 2, "Will not pursue anyone of level 3 or below. Bad Stuff: You are stomped and chomped. You drop things as you flee. Starting with the player on your right each player take one treasure card from in front of you or(without looking) from your hand.", 4));
		listOfDoorCards.add(new MonsterC("Monster", "Large Angry Chicken", 2, 1, "Fried chicken is delicious. Gain an extra level if you defeat it with fire or flame. Bad stuff: Very painful pecking. lose a level." , 1));
		listOfDoorCards.add(new MonsterC("Monster", "Squidzilla", 18, 2,  "Slimy! Elves are -4! Will not pursue anyone of Level 4 or below except Elves. Bad Stuff: You are grabbed, slimed, crushed, and gobbled. You are dead, dead, dead. Any questions?", 4));
		listOfDoorCards.add(new MonsterC("Monster", "BigFoot", 12, 1, "+3 against Dwarves and Halflings. Bad Stuff: Stomps you flat and eats your hat. Lose the Headgear you were wearing.", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Shrieking Geek", 6, 1, "+6 against warrior. Bad Stuff: You become a normal, boring Human. Discard any Race or Class cards in play.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "King Tut", 16, 2,  "Will not pursue anyone of Level 3 or below. Higher-Level characters lose 2 levels, even if they escape. Bad Stuff: Lose all your items and all cards in your hand.", 4));
		listOfDoorCards.add(new MonsterC("Monster", "Ghoulfiends", 8, 1, "No items or other bonuses help against them - fight with your level only. Bad Stuff: Your level becomes equal to the Lowest LEvel of any character in play.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Net Troll", 10, 1, "He has no special powers, and he's really mad about it. Bad Stuff: Screws up the game balance by forcing you to let the player(s) of the highest Level take any one item (each) from you.", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Potted Plant", 1, 1, "Elves draw an extra Treasure after defeating it. Bad Stuff: None. Escape is automatic.", 1));
		listOfDoorCards.add(new MonsterC("Monster", "Harpies", 4, 1, "They resist magic. +5 against Wizards. Bad Sutff: Their music is really, really bad. Lose 2 levels.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Tongue Demon", 12, 1, "A creature from Hell. +4 against Clerics. You must discard one item (your choice)_before combat. Bad Stuff: A really disgusting kiss costs you 2 levels. (3 levels for Elves)", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Lawyers", 6, 1, "Will not attack a Thief(professional courtesy). Bad Stuff: He hits you with an injunction. Let each other player draw one card from your hand, starting with the player to your left. Discard any remainder.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "3,872 Orcs", 10, 1, "+6 against Dwarves, due to ancient grudges. Bad Stuff: Roll a die. On a 2 or less, they stomp you to death. Otherwise, lose as many levels as the die shows.", 3));
		listOfDoorCards.add(new MonsterC("Monster", "Leperchaun", 4, 1, "He's gross! +5 against elves. Bad Stuff: He takes two items from you - one chosen by the player on either side of you.", 2));
		listOfDoorCards.add(new MonsterC("Monster", "Wannabe Vampire", 12, 1, "Instead of fighting, a Cleric can chase the Wannabe Vampire away just by going 'booga booga', and take all his Treasure. There is no level increase for this! Bad Stuff: Blocks the door and tells you about his character. Lose 3 levels.", 3));
		listOfDoorCards.add(new CursesC("Curse", "Duck Of Doom", "You should know better than to pick up a duck in a dungeon. Lose 2 levels."));
		listOfDoorCards.add(new CursesC("Curse", "Lose A Level", "Lose a level."));
		listOfDoorCards.add(new CursesC("Curse", "Truly Obnoxious Curse", "Lose the item that gives you the biggest bonus."));
		listOfDoorCards.add(new CursesC("Curse", "Lose Two Cards", "First the player to the victim's left draws a card from the victim's hand and keeps it. Then the player on the right does the same."));
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
		listOfDoorCards.add(new MonsterAdditionC("MonsterAddition", "Ancient", "+10 to Monster", 10));
		listOfDoorCards.add(new MonsterAdditionC("MonsterAddition", "Enraged", "Play during combat. If the monster is defeated, draw one extra Treasure. +5 to Monster", 5));
		listOfDoorCards.add(new MonsterAdditionC("MonsterAddition", "Intelligent", "Play during combat. If the monster is defeated, draw one extra Treasure. +5 to Monster", 5));
		listOfDoorCards.add(new MonsterAdditionC("MonsterAddition", "Humongous", "Play during combat. If the monster is defeated, draw two extra Treasures. +5 to Monster", 5));
		}
	}
	
