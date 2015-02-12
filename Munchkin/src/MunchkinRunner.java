import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MunchkinRunner
	{
	static ArrayList<DoorCards> playerDCards = new ArrayList<DoorCards>();
	static ArrayList<TreasCards> playerTCards = new ArrayList<TreasCards>();
	static Player p = new Player("", "","", 1, 1);
	static int die = (int) (Math.random() * 6) + 1;
	static int allLevels = p.getLevel();
	public static void main(String[] args)
		{
		DoorCards.makeDoorCards();
		TreasCards.makeTreasCards();
		Collections.shuffle(DoorCards.listOfDoorCards);
		Collections.shuffle(TreasCards.listOfTC);
		allLevels = allLevels + p.getLevel();
		getPlayerInfo();
		initialDeal(allLevels);
		while(p.getLevel() <=9)
			{
			kickOpenTheDoor(p.getLevel());
			lookForTrouble();
			lootTheRoom();
			charity();
			}
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
		for(int i = 0; i < 3; i++)
			{
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("Monster"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));		
				DoorCards.listOfDoorCards.remove(0);
				}	
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("Curse"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));
				DoorCards.listOfDoorCards.remove(0);
				}			
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("MonsterAddition"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));
				DoorCards.listOfDoorCards.remove(0);
				}		
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("Class"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));
				DoorCards.listOfDoorCards.remove(0);
				}	
			}
		
		// get three treas cards		
		for(int i = 0; i < 3; i++)
			{
			if((TreasCards.listOfTC.get(0)).getType().equals("Weapon"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				TreasCards.listOfTC.remove(0);
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("Potion"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				TreasCards.listOfTC.remove(0);
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("Armor"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				TreasCards.listOfTC.remove(0);
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("Footgear"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				TreasCards.listOfTC.remove(0);
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("RandomBonus"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				TreasCards.listOfTC.remove(0);
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
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Maul Rat"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Large Anrgy Chicken"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Shrieking Geek"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Ghoulfiends"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Potted Plant"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Harpies"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Lawyers"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
					}
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Leperchaun"))
					{
					lev = lev + DoorCards.listOfDoorCards.get(0).getLevelsGiven();
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);					
					playerTCards.add(TreasCards.listOfTC.get(0));
					TreasCards.listOfTC.remove(0);
					System.out.println("You've defeated the monster. Good job!");
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
					System.out.println("You've defeated the monster. Good job!");
					}
				}
			if(allLevels < DoorCards.listOfDoorCards.get(0).getLevel())
				{
				System.out.println("Since you dont have the levels to beat the monster so you must roll the die to see if you can escape!");
				if(die >= 5)
					{
					System.out.println("You barely escaped but you're still on the same level.");
					DoorCards.listOfDoorCards.remove(0);
					}
				if(die <= 4)
					{
					System.out.println("Since you couldn't defeat the monster you have to face the Bad Stuff.");
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Lame Goblin"))
						{
						lev = lev - 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Maul Rat"))
						{
						lev = lev - 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Hippogriff"))
						{
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
						lev = lev - 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Squidzilla"))
						{
						lev = 1;	
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("BigFoot"))
						{
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
						for(int f = 0; f < playerTCards.size(); f++)
							{
							if(TreasCards.listOfTC.get(f).getType().equals("Race"))
								{
								playerTCards.remove(f);
								}
							}
						for(int v = 0; v < playerDCards.size(); v++)
							{
							if(DoorCards.listOfDoorCards.get(v).getType().equals("Class"))
								{	
								playerDCards.remove(v);
								}
							}	
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("King Tut"))
						{
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
						lev = 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Net Troll"))
						{
						lev = 1;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Potted Plant"))
						{
						
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Harpies"))
						{
						lev = lev - 2;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Tongue Demon"))
						{
						lev = lev - 2;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Lawyers"))
						{
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
						lev = lev - 3;
						}
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Leperchaun"))
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
					if(DoorCards.listOfDoorCards.get(0).getName().equals("Wannabe Vampire"))
						{
						lev = lev - 3;
						}
					DoorCards.listOfDoorCards.remove(0);
					}
				}
			if(lev < 1)
				{
				lev = 1;
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
				if(playerTCards.get(i).getType().equals("Weapon") || playerTCards.get(i).getType().equals("Armor"))
					{
					if(playerTCards.get(i).getBigOrSmall() == 0)
						{
						playerTCards.remove(i);
						i = playerTCards.size() - 1;
						}
					}
				else
					{
					lev = 1;
					}
				}			
			}
		return lev;
		}
	public static void lookForTrouble()
		{
		
		}
	public static void lootTheRoom()
		{
		
		}
	public static void charity()
		{
		
		}
	}
