import java.util.ArrayList;
public class MonsterArrayList
	{
	ArrayList<Monster> doorCards = new ArrayList<Monster>();
	public void makeMonsters()
		{
		doorCards.add(new Monster(1, 1, "Lame Goblin", "null","Bad Stuff: He whacks you with his crutch. You lose a level.", 2));
		doorCards.add(new Monster(2, 1, "Mr.Bones", "If you must flee, you lose a level even if you escape", "Bad Stuff: His bony touch costs you 2 levels", 1));
		doorCards.add(new Monster(1, 1, "Maul Rat", "A creature from Hell. +3 against Clerics.", "Bad Stuff: She whack you. Lose a level.", 1));
		doorCards.add(new Monster(6, 1, "Pukachu", "Gain an extra level if you defeat it without using help or bonuses.", "Bad Stuff: Projective vomiting attack! Discard your whole hand.", 2));
		doorCards.add(new Monster(1, 1, "Drooling Slime", "Yucky slime! +4 against Elves.", "Bad Stuff: Discard the Footgear you are wearing. Lose a level if you have no Footgear.", 1));
		doorCards.add(new Monster(6, 1, "Platycore", "Resists magic. +6 against Wizards.", "Bad Stuff: Either discard you whole hand or lose 2 levels.", 2));
		doorCards.add(new Monster(16, 2,"Hippogriff", "Will not pursue anyone of level 3 or below.", "Bad Stuff: You are stomped and chomped. You drop things as you flee. Starting with the player on your right each player take one treasure card from in front of you or(without looking) from your hand.", 4));
		doorCards.add(new Monster(2, 1, "Large Angry Chicken", "Fried chicken is delicious. Gain an extra level if you defeat it with fire or flame.", "Bad stuff: Very painful pecking. lose a level." , 1));
		doorCards.add(new Monster(18, 2, "Squidzilla", "Slimy! Elves are -4! Will not pursue anyone of Level 4 or below except Elves.", "Bad Stuff: You are grabbed, slimed, crushed, and gobbled. You are dead, dead, dead. Any questions?", 4));
		doorCards.add(new Monster(2, 1, "Flying Frogs", "-1 to run away", "Bad Stuff: They bite! Lose 2 levels.", 1));
		doorCards.add(new Monster(12, 1, "BigFoot", "+3 against Dwarves and Halflings.", "Bad Stuff: Stomps you flat and eats your hat. Lose the Headgear you were wearing.", 3));
		doorCards.add(new Monster(8, 1, "Gazebo", "No one can  help you. You must face the Gazebo alone.", "Bad Stuff: Lose 3 levels.", 2));
		doorCards.add(new Monster(6, 1, "Shrieking Geek", "+6 against warriors", "Bad Stuff: You become a normal, boring Human. Discard any Race or Class cards in play.", 2));
		doorCards.add(new Monster(4, 1, "Undead Horse", "+5 against Dwarves", "Bad Stuff: Kicks, bites, and smells awful. Lose 2 levels.", 2));
		doorCards.add(new Monster(8, 1, "Face Sucker", "It's gross! +6 against Elves.", "Bad Stuff: When it sucks your face off, your Headgear goes with it. Discard the Headgear you are wearing and lose a level.", 2));
		doorCards.add(new Monster(16, 2, "King Tut", "Will not pursue anyone of Level 3 or below. Higher-Level characters lose 2 levels, even if they escape.", "Bad Stuff: Lose all your items and all cards in your hand.", 4));
		doorCards.add(new Monster(14, 1, "Unspeakably Awful Indescribable Horror", "+4 against warriors.", "Bad Stuff: Unspeakably awful death for anyone but a Wizard. A Wizard merely loses his powers - discard the Wizard card.", 4));
		doorCards.add(new Monster(8, 1, "Ghoulfiends", "No items or other bonuses help against them - fight with your level only.", "Bad Stuff: Your level becomes equal to the Lowest LEvel of any character in play.", 2));
		doorCards.add(new Monster(10, 1, "Net Troll", "He has no special powers, and he's really mad about it", "Bad Stuff: Screws up the game balance by forcing you to let the player(s) of the highest Level take any one item (each) from you.", 3));
		doorCards.add(new Monster(14, 1, "Insurance Salesman","Your Level does not count! Fight him only with your bonuses!", "Bad Stuff: You buy insurance. Lose 1,000 Gold Pieces' worth of items, If you don't have that much, lose all you have.", 4));
		doorCards.add(new Monster(2, 1, "Gelatinous Octahedron", "+1 to Run Away.", "Bad Stuff: Drop all your Big Items.", 1));
		doorCards.add(new Monster(1, 1, "Potted Plant", "Elves draw an extra Treasure after defeating it.", "Bad Stuff: None. Escape is automatic.", 1));
		doorCards.add(new Monster(8, 1, "Amazon", "Will not attack females; just gives them 1 Treasure instead", "Bad Sutff: Lose your Class(es). If you had no class lose 3 levels.", 2));
		doorCards.add(new Monster(10, 1, "Floating Nose", "If you don't want to fight the Floating Nose, you can bribe it with an item worth at least 200 Gold Pieces, and it will let you go.", "Bad Stuff: It can sniff you out anywhere. If you lose, you cannot flee; nothing will help you. Lose 3 Levels.", 3));
		doorCards.add(new Monster(4, 1, "Harpies", "They resist magic. +5 against Wizards.", "Bad Sutff: Their music is really, really bad. Lose 2 levels.", 2));
		doorCards.add(new Monster(12, 1, "Tongue Demon", "A creature from Hell. +4 against Clerics. You must discard one item (your choice)_before combat.", "Bad Stuff: A really disgusting kiss costs you 2 levels. (3 levels for Elves)", 3));
		doorCards.add(new Monster(18, 2, "Bullrog", "Will not pursue anyone of Level 4 or below.", "Bad Stuff: You are flayed to death.", 5));
		doorCards.add(new Monster(20, 2, "Plutonium Dragon", "Will not pursue anyone of Level 5 or below.", "Bad Stuff: You are roasted and eaten. You are dead.", 5));
		doorCards.add(new Monster(6, 1, "Lawyers", "Will not attack a Thief(professional courtesy).", "Bad Stuff: He hits you with an injunction. Let each other player draw one card from your hand, starting with the player to your left. Discard any remainder.", 2));
		doorCards.add(new Monster(10, 1, "3,872 Orcs", "+6 against Dwarves, due to ancient grudges.", "Bad Stuff: Roll a die. On a 2 or less, they stomp you to death. Otherwise, lose as many levels as the die shows.", 3));
		doorCards.add(new Monster(4, 1, "Leperchaun", "He's gross! +5 against elves.", "Bad Stuff: He takes two items from you - one chosen by the player on either side of you.", 2));
		doorCards.add(new Monster(16, 2, "Wight Brothers", "Will not pursue anyone of Level 3 or below. Higher- Level characters lose 2 levels, even if they escape.", "Bad Stuff: You are reduced to Level 1", 4));
		doorCards.add(new Monster(2, 1, "Pit Bull", "If you can't defeat it, you may distract it(automatic escape) by dropping any wand pole or staff.", "Bad Stuff: Fang marks in your skin. Lose 2 levels.", 1));
		doorCards.add(new Monster(12, 1, "Wannabe Vampire", "Instead of fighting, a Cleric can chase the Wannabe Vampire away just by going 'booga booga', and take all his Treasure. There is no level increase for this!", "Bad Stuff: Blocks the door and tells you about his character. Lose 3 levels.", 3));
		
		}
	
	}
