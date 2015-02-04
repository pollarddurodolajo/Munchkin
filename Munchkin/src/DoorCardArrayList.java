import java.util.ArrayList;
public class DoorCardArrayList
	{
	ArrayList<DoorCardConstructor> listOfDoorCards = new ArrayList<DoorCardConstructor>();
	public void makeDoorCards()
		{
		listOfDoorCards.add(new DoorCardConstructor("Monster", 1, 1, "Lame Goblin", "null","Bad Stuff: He whacks you with his crutch. You lose a level.", 2, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 1, 1, "Maul Rat", "A creature from Hell. +3 against Clerics.", "Bad Stuff: She whack you. Lose a level.", 1, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 16, 2,"Hippogriff", "Will not pursue anyone of level 3 or below.", "Bad Stuff: You are stomped and chomped. You drop things as you flee. Starting with the player on your right each player take one treasure card from in front of you or(without looking) from your hand.", 4, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 2, 1, "Large Angry Chicken", "Fried chicken is delicious. Gain an extra level if you defeat it with fire or flame.", "Bad stuff: Very painful pecking. lose a level." , 1, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 18, 2, "Squidzilla", "Slimy! Elves are -4! Will not pursue anyone of Level 4 or below except Elves.", "Bad Stuff: You are grabbed, slimed, crushed, and gobbled. You are dead, dead, dead. Any questions?", 4, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 12, 1, "BigFoot", "+3 against Dwarves and Halflings.", "Bad Stuff: Stomps you flat and eats your hat. Lose the Headgear you were wearing.", 3, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 6, 1, "Shrieking Geek", "+6 against warriors", "Bad Stuff: You become a normal, boring Human. Discard any Race or Class cards in play.", 2, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 16, 2, "King Tut", "Will not pursue anyone of Level 3 or below. Higher-Level characters lose 2 levels, even if they escape.", "Bad Stuff: Lose all your items and all cards in your hand.", 4, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 8, 1, "Ghoulfiends", "No items or other bonuses help against them - fight with your level only.", "Bad Stuff: Your level becomes equal to the Lowest LEvel of any character in play.", 2, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 10, 1, "Net Troll", "He has no special powers, and he's really mad about it", "Bad Stuff: Screws up the game balance by forcing you to let the player(s) of the highest Level take any one item (each) from you.", 3, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 1, 1, "Potted Plant", "Elves draw an extra Treasure after defeating it.", "Bad Stuff: None. Escape is automatic.", 1, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 4, 1, "Harpies", "They resist magic. +5 against Wizards.", "Bad Sutff: Their music is really, really bad. Lose 2 levels.", 2, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 12, 1, "Tongue Demon", "A creature from Hell. +4 against Clerics. You must discard one item (your choice)_before combat.", "Bad Stuff: A really disgusting kiss costs you 2 levels. (3 levels for Elves)", 3, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 6, 1, "Lawyers", "Will not attack a Thief(professional courtesy).", "Bad Stuff: He hits you with an injunction. Let each other player draw one card from your hand, starting with the player to your left. Discard any remainder.", 2, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 10, 1, "3,872 Orcs", "+6 against Dwarves, due to ancient grudges.", "Bad Stuff: Roll a die. On a 2 or less, they stomp you to death. Otherwise, lose as many levels as the die shows.", 3, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 4, 1, "Leperchaun", "He's gross! +5 against elves.", "Bad Stuff: He takes two items from you - one chosen by the player on either side of you.", 2, "null", "null", "null"));
		listOfDoorCards.add(new DoorCardConstructor("Monster", 12, 1, "Wannabe Vampire", "Instead of fighting, a Cleric can chase the Wannabe Vampire away just by going 'booga booga', and take all his Treasure. There is no level increase for this!", "Bad Stuff: Blocks the door and tells you about his character. Lose 3 levels.", 3, "null", "null", "null"));
		
		}
	
	}
