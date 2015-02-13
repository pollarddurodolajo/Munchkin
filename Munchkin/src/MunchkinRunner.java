import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MunchkinRunner
	{
	static ArrayList<DoorCards> playerDCards = new ArrayList<DoorCards>();
	static ArrayList<TreasCards> playerTCards = new ArrayList<TreasCards>();
	static Player p = new Player("", "","", 1, 1);
	static int allLevels = p.getLevel();
	public static void main(String[] args)
		{
		DoorCards.makeDoorCards();
		TreasCards.makeTreasCards();
		Collections.shuffle(DoorCards.listOfDoorCards);
		Collections.shuffle(TreasCards.listOfTC);
		getPlayerInfo();
		initialDeal(allLevels);

//		while(p.getLevel() <=9)
//			{
//			kickOpenTheDoor(p.getLevel());
//			}
		System.out.println("You've gotten to the tenth level and completed the game!");
		}
	
	public static void getPlayerInfo()
	{
		Scanner input1 = new Scanner(System.in);
		System.out.println("Hello player what is your name?");
		String name = input1.nextLine();
		p.setName(name);
	}
	public static int initialDeal(int lWB)
		{
		// get three door cards
		System.out.println(playerDCards.size());
		System.out.println(playerTCards.size());
		for(int i = 0; i < 3; i++)
			{
			if((DoorCards.listOfDoorCards.get(i)).getType().equals("Monster"))
				{
				System.out.println("New Card: ");
				playerDCards.add(DoorCards.listOfDoorCards.get(i));	
				System.out.println(playerDCards.get(i).getName());
				System.out.println("Level: " + playerDCards.get(i).getLevel());
				System.out.println(playerDCards.get(i).getDesc());
				System.out.println();
				DoorCards.listOfDoorCards.remove(i);
				}	
			if((DoorCards.listOfDoorCards.get(i)).getType().equals("Curse"))
				{
				System.out.println("New Card: ");
				playerDCards.add(DoorCards.listOfDoorCards.get(i));
				System.out.println(playerDCards.get(i).getName());
				System.out.println(playerDCards.get(i).getDesc());
				System.out.println();
				DoorCards.listOfDoorCards.remove(i);
				}			
			if((DoorCards.listOfDoorCards.get(i)).getType().equals("Class"))
				{
				System.out.println("New Card: ");
				playerDCards.add(DoorCards.listOfDoorCards.get(i));
				System.out.println(playerDCards.get(i).getName());
				System.out.println(playerDCards.get(i).getDesc());
				System.out.println();
				DoorCards.listOfDoorCards.remove(i);
				}	
			}
		
		// get three treas cards		
		for(int i = 0; i < 3; i++)
			{
			if((TreasCards.listOfTC.get(i)).getType().equals("Weapon"))
				{
				System.out.println("New Card: ");
				playerTCards.add(TreasCards.listOfTC.get(i));
				System.out.println(playerTCards.get(i).getName());
				System.out.println("Bonus: " + playerTCards.get(i).getBonus());
				System.out.println("Gold Value: " + playerTCards.get(i).getGoldVal());
				System.out.println();
				TreasCards.listOfTC.remove(i);
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("Potion"))
				{
				System.out.println("New Card: ");
				playerTCards.add(TreasCards.listOfTC.get(i));
				System.out.println(playerTCards.get(i).getName());
				System.out.println(playerTCards.get(i).getDesc());
				System.out.println("Gold Value: " + playerTCards.get(i).getGoldVal());
				System.out.println();
				TreasCards.listOfTC.remove(i);
				}
			
			if((TreasCards.listOfTC.get(i)).getType().equals("Armor"))
				{
				System.out.println("New Card: ");
				playerTCards.add(TreasCards.listOfTC.get(i));
				System.out.println(playerTCards.get(i).getName());
				System.out.println("Bonus: " + playerTCards.get(i).getBonus());
				System.out.println("Gold Value: " + playerTCards.get(i).getGoldVal());
				System.out.println();
				TreasCards.listOfTC.remove(i);
				}
			
			if((TreasCards.listOfTC.get(i)).getType().equals("Footgear"))
				{
				System.out.println("New Card: ");
				playerTCards.add(TreasCards.listOfTC.get(i));
				System.out.println(playerTCards.get(i).getName());
				System.out.println("Bonus: " + playerTCards.get(i).getBonus());
				System.out.println("Gold Value: " + playerTCards.get(i).getGoldVal());
				System.out.println();
				TreasCards.listOfTC.remove(i);
				}
			
			if((TreasCards.listOfTC.get(i)).getType().equals("RandomBonus"))
				{
				System.out.println("New Card: ");
				playerTCards.add(TreasCards.listOfTC.get(i));
				System.out.println(playerTCards.get(i).getName());
				System.out.println("Bonus: " + playerTCards.get(i).getBonus());
				System.out.println();
				TreasCards.listOfTC.remove(i);
				}
			}
		// add up levels with bonuses
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
			if(playerTCards.get(c).getType().equals("RandomBonus"))
				{
				lWB = lWB + playerTCards.get(c).getBonus();	
				}
			}
		System.out.println(playerTCards.size());
		System.out.println(playerDCards.size());
		System.out.println("-----------------------");
		System.out.println("Dealing cards complete.");
		System.out.println("-----------------------");
		allLevels = lWB;
		System.out.println("Your level including the bonuses from your items is: " + allLevels);
		return lWB;
		}
	public static int kickOpenTheDoor(int lev)
		{
		if(DoorCards.listOfDoorCards.get(0).getType().equals("Monster"))
			{
			System.out.println(DoorCards.listOfDoorCards.get(0).getName());
			System.out.println("Level:" + DoorCards.listOfDoorCards.get(0).getLevel());
			System.out.println(DoorCards.listOfDoorCards.get(0).getDesc());
			
			System.out.println("It is time to fight the monster. You have " + allLevels + " and the monster is Level " + DoorCards.listOfDoorCards.get(0).getLevel());
			
			if(allLevels >= DoorCards.listOfDoorCards.get(0).getLevel())
				{
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Lame Goblin"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
					p.setLevel(lev);
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Maul Rat"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
					p.setLevel(lev);
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Hippogriff"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Large Anrgy Chicken"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
					p.setLevel(lev);
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Squidzilla"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("BigFoot"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Shrieking Geek"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("King Tut"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Ghoulfiends"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Net Troll"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Potted Plant"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Harpies"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Tongue Demon"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Lawyers"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("3,872 Orcs"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Leperchaun"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Wannabe Vampire"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					p.setLevel(lev);
					System.out.println("You've defeated the monster. Good job!");
					System.out.println();
					}
				for(int c = 0; c < playerTCards.size(); c++)
				{
					allLevels = 0;
				if(playerTCards.get(c).getType().equals("Weapon"))
					{
					allLevels = allLevels + playerTCards.get(c).getBonus();
					}
				if(playerTCards.get(c).getType().equals("Armor"))
					{
					allLevels = allLevels + playerTCards.get(c).getBonus();
					}
				if(playerTCards.get(c).getType().equals("RandomBonus"))
					{
					allLevels = allLevels + playerTCards.get(c).getBonus();	
					}
				allLevels = allLevels + lev;
				}
				}
			if(allLevels < DoorCards.listOfDoorCards.get(0).getLevel())
				{
				int die = (int) (Math.random() * 6) + 1;
				System.out.println(die);
				System.out.println("Since you dont have the levels to beat the monster so you must roll the die to see if you can escape!");
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
							for(int t = 0; t < 2; t++)
								{
								int actL  = 0;
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
								allLevels = actL;
								}
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
							for(int t = 0; t < 2; t++)
								{
								int actL  = 0;
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
								allLevels = actL;
								}
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
								for(int t = 0; t < 2; t++)
									{
									int actL  = 0;
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
									allLevels = actL;
									}
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
						for(int t = 0; t < 1; t++)
							{
							int actL  = 0;
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
							allLevels = actL;
							}
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
						for(int t = 0; t < 2; t++)
							{
							int actL  = 0;
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
							allLevels = actL;
							}
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
