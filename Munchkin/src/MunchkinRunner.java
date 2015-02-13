import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MunchkinRunner
	{
	static ArrayList<DoorCards> playerDCards = new ArrayList<DoorCards>();
	static ArrayList<TreasCards> playerTCards = new ArrayList<TreasCards>();
	static Player p = new Player("", "","", 1, 1);
	static int counter = 1;
	static int mK = 0;
	static private final String setPlain = "\033[0;0m";
	static private final String setBold = "\033[0;1m";
	static int allLevels = p.getLevel();
	public static void main(String[] args)
		{
		DoorCards.makeDoorCards();
		TreasCards.makeTreasCards();
		Collections.shuffle(DoorCards.listOfDoorCards);
		Collections.shuffle(TreasCards.listOfTC);
		getPlayerInfo();
		addIDoor();
		addITreas();
		initialLevel(allLevels);
		while(p.getLevel() <=9 && DoorCards.listOfDoorCards.size() >=2 && TreasCards.listOfTC.size() >= 2)
			{
			kickOpenTheDoor(p.getLevel());
			}
		if(DoorCards.listOfDoorCards.size() <=2  || TreasCards.listOfTC.size() <= 2)
			{
			System.out.println("You played such a bad game you ran out of cards. . . Push start to retry.");
			}
		
		else if(p.getLevel() >= 9)
			{
			System.out.println("You've gotten to the tenth level and completed the game!");
			}
		}
	
	public static void getPlayerInfo()
	{
		Scanner input1 = new Scanner(System.in);
		System.out.println("Hello player what is your name?");
		String name = input1.nextLine();
		p.setName(name);
	}
	public static void addIDoor()
		{
		// get three door cards
		for(int i = 0; i < 3; i++)
			{
			if((DoorCards.listOfDoorCards.get(i)).getType().equals("Monster"))
				{
				System.out.println("New Monster Card: ");
				playerDCards.add(DoorCards.listOfDoorCards.get(i));	
				System.out.println(playerDCards.get(i).getName());
				System.out.println("Level: " + playerDCards.get(i).getLevel());
				System.out.println(playerDCards.get(i).getDesc());
				System.out.println();

				}	
			if((DoorCards.listOfDoorCards.get(i)).getType().equals("Curse"))
				{
				System.out.println("New Curse Card: ");
				playerDCards.add(DoorCards.listOfDoorCards.get(i));
				System.out.println(playerDCards.get(i).getName());
				System.out.println(playerDCards.get(i).getDesc());
				System.out.println();

				}			
			if((DoorCards.listOfDoorCards.get(i)).getType().equals("Class"))
				{
				System.out.println("New Class Card: ");
				playerDCards.add(DoorCards.listOfDoorCards.get(i));
				System.out.println(playerDCards.get(i).getName());
				System.out.println(playerDCards.get(i).getDesc());
				System.out.println();

				}	
			
			}
		System.out.println("------------------------------");
		System.out.println("Done dealing intial Door Cards");
		System.out.println("------------------------------");
		System.out.println();
		DoorCards.listOfDoorCards.remove(0);
		DoorCards.listOfDoorCards.remove(0);
		DoorCards.listOfDoorCards.remove(0);
		}
	
	public static void addITreas()
	{
//		 get three treas cards		
		for(int t = 0; t < 3; t++)
			{
			if((TreasCards.listOfTC.get(t)).getType().equals("Weapon"))
				{
				System.out.println("New Weapon Card: ");
				playerTCards.add(TreasCards.listOfTC.get(t));
				System.out.println(playerTCards.get(t).getName());
				System.out.println("Bonus: " + playerTCards.get(t).getBonus());
				System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
				System.out.println();
	
				}
			
			else if((TreasCards.listOfTC.get(t)).getType().equals("Potion"))
				{
				System.out.println("New Potion Card: ");
				playerTCards.add(TreasCards.listOfTC.get(t));
				System.out.println(playerTCards.get(t).getName());
				System.out.println(playerTCards.get(t).getDesc());
				System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
				System.out.println();

				}
			
			else if((TreasCards.listOfTC.get(t)).getType().equals("Armor"))
				{
				System.out.println("New Armor Card: ");
				playerTCards.add(TreasCards.listOfTC.get(t));
				System.out.println(playerTCards.get(t).getName());
				System.out.println("Bonus: " + playerTCards.get(t).getBonus());
				System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
				System.out.println();

				}
			
			else if((TreasCards.listOfTC.get(t)).getType().equals("Footgear"))
				{
				System.out.println("New Armor Card: ");
				playerTCards.add(TreasCards.listOfTC.get(t));
				System.out.println(playerTCards.get(t).getName());
				System.out.println("Bonus: " + playerTCards.get(t).getBonus());
				System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
				System.out.println();

				}
			else if((TreasCards.listOfTC.get(t)).getType().equals("Headgear"))
			{
			System.out.println("New Armor Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println("Bonus: " + playerTCards.get(t).getBonus());
			System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
			System.out.println();

			}
			
			else if(TreasCards.listOfTC.get(t).getType().equals("Random Bonus"))
				{
				System.out.println("New Bonus Card: ");
				playerTCards.add(TreasCards.listOfTC.get(t));
				System.out.println(playerTCards.get(t).getName());
				System.out.println("Bonus: " + playerTCards.get(t).getBonus());
				System.out.println();
				}
			
			else if(TreasCards.listOfTC.get(t).getType().equals("Race"))
				{
				System.out.println("New Race Card: ");
				playerTCards.add(TreasCards.listOfTC.get(t));
				System.out.println(playerTCards.get(t).getName());
				System.out.println(playerTCards.get(t).getDesc());
				System.out.println();
				}
			}
		System.out.println("------------------------------------");
		System.out.println("Done dealing initial Treasure Cards.");
		System.out.println("------------------------------------");
		TreasCards.listOfTC.remove(0);
		TreasCards.listOfTC.remove(0);
		TreasCards.listOfTC.remove(0);		 
	}
	public static void printNewCards()
	{	
		for(int t = 0; t < DoorCards.listOfDoorCards.get(0).getTreasures(); t++)
		{
		if((TreasCards.listOfTC.get(t)).getType().equals("Weapon"))
			{
			System.out.println();
			System.out.println("New Weapon Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println("Bonus: " + playerTCards.get(t).getBonus());
			System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
			System.out.println();

			}
		
		else if((TreasCards.listOfTC.get(t)).getType().equals("Potion"))
			{
			System.out.println();
			System.out.println("New Potion Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println(playerTCards.get(t).getDesc());
			System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
			System.out.println();

			}
		
		else if((TreasCards.listOfTC.get(t)).getType().equals("Armor"))
			{
			System.out.println();
			System.out.println("New Armor Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println("Bonus: " + playerTCards.get(t).getBonus());
			System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
			System.out.println();

			}
		
		else if((TreasCards.listOfTC.get(t)).getType().equals("Footgear"))
			{
			System.out.println();
			System.out.println("New Armor Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println("Bonus: " + playerTCards.get(t).getBonus());
			System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
			System.out.println();

			}
		else if((TreasCards.listOfTC.get(t)).getType().equals("Headgear"))
			{
			System.out.println();
			System.out.println("New Armor Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println("Bonus: " + playerTCards.get(t).getBonus());
			System.out.println("Gold Value: " + playerTCards.get(t).getGoldVal());
			System.out.println();
			}
		
		else if(TreasCards.listOfTC.get(t).getType().equals("Random Bonus"))
			{
			System.out.println();
			System.out.println("New Bonus Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println("Bonus: " + playerTCards.get(t).getBonus());
			System.out.println();
			}
		
		else if(TreasCards.listOfTC.get(t).getType().equals("Race"))
			{
			System.out.println();
			System.out.println("New Race Card: ");
			playerTCards.add(TreasCards.listOfTC.get(t));
			System.out.println(playerTCards.get(t).getName());
			System.out.println(playerTCards.get(t).getDesc());
			System.out.println();
			}
		}
	System.out.println("------------------------------------");
	System.out.println("Done dealing new Cards.");
	System.out.println("------------------------------------");
	
	for(int y = 0; y < DoorCards.listOfDoorCards.get(0).getTreasures(); y++)
		{
		TreasCards.listOfTC.remove(y);
		}
	}
	public static void recountLevels()
	{
		allLevels = 0;
		for(int z = 0; z < playerTCards.size(); z++)
		{
			if(playerTCards.get(z).getType().equals("Weapon"))
			{
			allLevels = allLevels + playerTCards.get(z).getBonus();
			}
		if(playerTCards.get(z).getType().equals("Armor"))
			{
			allLevels = allLevels + playerTCards.get(z).getBonus();
			}
		if(playerTCards.get(z).getType().equals("Random Bonus"))
			{
			allLevels = allLevels + playerTCards.get(z).getBonus();	
			}
		if(playerTCards.get(z).getType().equals("Footgear"))
			{
			allLevels = allLevels + playerTCards.get(z).getBonus();
			}
		if(playerTCards.get(z).getType().equals("Headgear"))
			{		
			allLevels = allLevels + playerTCards.get(z).getBonus();
			}
		}
		allLevels  = allLevels + p.getLevel();
		System.out.println("Your level including bonuses from your items is " + allLevels+".");
	}
	
	public static int initialLevel(int lWB)
	{
		for(int c = 0; c < playerTCards.size(); c++)
			{
			if(playerTCards.get(c).getType().equals("Weapon"))
				{
				lWB = lWB + playerTCards.get(c).getBonus();
				}
			if(playerTCards.get(c).getType().equals("Armor"))
				{
				lWB = lWB + playerTCards.get(c).getBonus();
				}
			if(playerTCards.get(c).getType().equals("Random Bonus"))
				{
				lWB = lWB + playerTCards.get(c).getBonus();	
				}
			if(playerTCards.get(c).getType().equals("Footgear"))
				{
				lWB = lWB + playerTCards.get(c).getBonus();
				}
			if(playerTCards.get(c).getType().equals("Headgear"))
				{		
				lWB = lWB + playerTCards.get(c).getBonus();
				}
			}
		System.out.println("-----------------------");
		System.out.println("Dealing cards complete.");
		System.out.println("-----------------------");
		allLevels = lWB;
		System.out.println("Your level including the bonuses from your items is: " + allLevels);
		System.out.println();
		return lWB;
	}
	
	public static int kickOpenTheDoor(int lev)
		{
		System.out.println();
		System.out.println("Door Cards Left: " + DoorCards.listOfDoorCards.size());
		System.out.println("Treasure Cards Left: " + TreasCards.listOfTC.size());
		System.out.println();
		if(DoorCards.listOfDoorCards.get(0).getType().equals("Monster"))
			{
			System.out.println("-------");
			System.out.println("Turn: " + counter);
			System.out.println("-------");
			counter++;
			System.out.println("--------");
			System.out.println("Level: " + p.getLevel());
			System.out.println("--------");
			System.out.println();
			System.out.println(DoorCards.listOfDoorCards.get(0).getName());
			System.out.println("Level:" + DoorCards.listOfDoorCards.get(0).getLevel());
			System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
			
			System.out.println("It is time to fight the monster. You have " + allLevels + " Levels and the monster is Level " + DoorCards.listOfDoorCards.get(0).getLevel() + ".");
			
			if(allLevels >= DoorCards.listOfDoorCards.get(0).getLevel())
				{
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Lame Goblin"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					System.out.println();
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					p.setLevel(lev);
					System.out.println();
					recountLevels();
					
		
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Maul Rat"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					p.setLevel(lev);
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Hippogriff"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Large Angry Chicken"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					p.setLevel(lev);
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Squidzilla"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("BigFoot"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Shrieking Geek"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("King Tut"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Ghoulfiends"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Net Troll"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Potted Plant"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Harpies"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Tongue Demon"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Lawyers"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("3,872 Orcs"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Leperchaun"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Wannabe Vampire"))
					{
					mK++;
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					printNewCards();
					recountLevels();
					System.out.println();
					}
				}
			if(allLevels < DoorCards.listOfDoorCards.get(0).getLevel())
				{
				int die = (int) (Math.random() * 6) + 1;
				System.out.println("Since you dont have the levels to beat the monster you must roll the die to see if you can escape!");
				System.out.println("You rolled a " + die + ".");
				if(die >= 5)
					{
					System.out.println("You barely escaped but you're still on the same level.");
					DoorCards.listOfDoorCards.remove(0);
					}
				if(die <= 4)
					{
					System.out.println("Since you couldn't escape the monster you have to face the Bad Stuff.");
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Lame Goblin"))
						{
						lev = lev - 1;
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Maul Rat"))
						{
						lev = lev - 1;
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Hippogriff"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						if(playerTCards.size() > 0)
							{
							playerTCards.remove(0);
							playerTCards.remove(0);
							int actL = 0;
							for(int t = 0; t < playerTCards.size(); t++)
								{
								if(playerTCards.get(t).getType().equals("Weapon"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								if(playerTCards.get(t).getType().equals("Armor"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								if(playerTCards.get(t).getType().equals("RandomBonus"))
									{
									actL = actL + playerTCards.get(t).getBonus();	
									}	
								if(playerTCards.get(t).getType().equals("Headgear"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								if(playerTCards.get(t).getType().equals("Footgear"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								}
							allLevels = actL + p.getLevel();
							}
						else
							{
							lev = 1;
							}
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Large Angry Chicken"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = lev - 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Squidzilla"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = 1;	
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("BigFoot"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						for(int r = 0; r < playerTCards.size(); r++)
							{
							if(DoorCards.listOfDoorCards.get(r).getType().equals("Headgear"))
								{
								playerTCards.remove(r);
								}
							}
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Shrieking Geek"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						for(int f = 0; f < playerTCards.size(); f++)
							{
							if(TreasCards.listOfTC.get(f).getType().equals("Race"))
								{
								playerTCards.remove(f);
								}
							}
						for(int v = 0; v < playerDCards.size(); v++)
							{
							System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
							System.out.println();
							if(DoorCards.listOfDoorCards.get(v).getType().equals("Class"))
								{	
								playerDCards.remove(v);
								}
							}	
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("King Tut"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						for(int p = 0; p < playerDCards.size() - 1; p++)
							{
							playerDCards.remove(p);
							}
						for(int p = 0; p < playerTCards.size() - 1; p++)
							{
							playerTCards.remove(p);
							}
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Ghoulfiends"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Net Troll"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Potted Plant"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Harpies"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = lev - 2;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Tongue Demon"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = lev - 2;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Lawyers"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						if(playerTCards.size() >= 2)
						{
							playerTCards.remove(0);
							playerTCards.remove(0);
							int actL = 0;
							for(int t = 0; t < playerTCards.size(); t++)
								{
								if(playerTCards.get(t).getType().equals("Weapon"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								if(playerTCards.get(t).getType().equals("Armor"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								if(playerTCards.get(t).getType().equals("RandomBonus"))
									{
									actL = actL + playerTCards.get(t).getBonus();	
									}	
								if(playerTCards.get(t).getType().equals("Headgear"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								if(playerTCards.get(t).getType().equals("Footgear"))
									{
									actL = actL + playerTCards.get(t).getBonus();
									}
								}
							allLevels = actL + p.getLevel();
							}
						else
							{
							lev = 1;
							}
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("3,872 Orcs"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = lev - 3;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Leperchaun"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
							if(playerTCards.size() > 2)
							{
								playerTCards.remove(0);
								playerTCards.remove(0);
								int actL = 0;
								for(int t = 0; t < playerTCards.size(); t++)
									{
									if(playerTCards.get(t).getType().equals("Weapon"))
										{
										actL = actL + playerTCards.get(t).getBonus();
										}
									if(playerTCards.get(t).getType().equals("Armor"))
										{
										actL = actL + playerTCards.get(t).getBonus();
										}
									if(playerTCards.get(t).getType().equals("RandomBonus"))
										{
										actL = actL + playerTCards.get(t).getBonus();	
										}	
									if(playerTCards.get(t).getType().equals("Headgear"))
										{
										actL = actL + playerTCards.get(t).getBonus();
										}
									if(playerTCards.get(t).getType().equals("Footgear"))
										{
										actL = actL + playerTCards.get(t).getBonus();
										}
									}
								allLevels = actL + p.getLevel();
							}
							else
							{
							lev = 1;
							}	
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Wannabe Vampire"))
						{
						System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
						System.out.println();
						lev = lev - 3;
						}
					DoorCards.listOfDoorCards.remove(0);
					}
				}
			}		
		if(DoorCards.listOfDoorCards.get(0).getType().equals("Curse"))
			{
			if(DoorCards.listOfDoorCards.get(0).getName().equals("Duck of Doom"))
				{
				lev = lev - 2;
				}
			if(DoorCards.listOfDoorCards.get(0).getName().equals("Lose A Level"))
				{
				lev = lev - 1;
				}
			if(DoorCards.listOfDoorCards.get(0).getName().equals("Truly Obnoxious Curse"))
				{
					if(playerTCards.size() > 1)
					{
						playerTCards.remove(0);
						int actL = 0;
						for(int t = 0; t < playerTCards.size(); t++)
							{
							if(playerTCards.get(t).getType().equals("Weapon"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							if(playerTCards.get(t).getType().equals("Armor"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							if(playerTCards.get(t).getType().equals("RandomBonus"))
								{
								actL = actL + playerTCards.get(t).getBonus();	
								}	
							if(playerTCards.get(t).getType().equals("Headgear"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							if(playerTCards.get(t).getType().equals("Footgear"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							}
						allLevels = actL + p.getLevel();
					}
					else
					{
					lev = 1;
					}
				}
			if(DoorCards.listOfDoorCards.get(0).getName().equals("Lose Two Cards"))
				{
					if(playerTCards.size() > 2)
					{
						playerTCards.remove(0);
						playerTCards.remove(0);
						int actL = 0;
						for(int t = 0; t < playerTCards.size(); t++)
							{
							if(playerTCards.get(t).getType().equals("Weapon"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							if(playerTCards.get(t).getType().equals("Armor"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							if(playerTCards.get(t).getType().equals("RandomBonus"))
								{
								actL = actL + playerTCards.get(t).getBonus();	
								}	
							if(playerTCards.get(t).getType().equals("Headgear"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							if(playerTCards.get(t).getType().equals("Footgear"))
								{
								actL = actL + playerTCards.get(t).getBonus();
								}
							}
						allLevels = actL + p.getLevel();
					}
					else
					{
					lev = 1;
					}
				}
			if(DoorCards.listOfDoorCards.get(0).getName().equals("Lose 1 Small Item"))
				{
				for(int i = 0; i < playerTCards.size(); i++)
					{
					if(playerTCards.get(i).getType().equals("Weapon") || playerTCards.get(i).getType().equals("Armor"))
						{
						if(playerTCards.get(i).getBigOrSmall() == 0)
							{
							playerTCards.remove(i);
							i = playerTCards.size();
							}
						}
					else
						{
						lev = 1;
						}
					}	
				}
			if(DoorCards.listOfDoorCards.get(0).getName().equals("Lose Your Race"))
				{
					for(int i = 0; i < playerTCards.size(); i++)
					{
					if(playerTCards.get(i).getType().equals("Race"))
						{
							playerTCards.remove(i);
							i = playerTCards.size();
						}
					else
						{
						lev = 1;
						}
					}	
				}
			
			}
		if(DoorCards.listOfDoorCards.get(0).getType().equals("Class"))
			{
			System.out.println("You are now a " + DoorCards.listOfDoorCards.get(0).getName()+ "! (This doesnt have any actual perks.)");
			}
		DoorCards.listOfDoorCards.remove(0);
		
		if(lev < 1)
			{
			lev = 1;
			}
		return lev;
		}
	}
