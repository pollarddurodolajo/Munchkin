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
			System.out.println("It is time to fight the monster. You have " + allLevels + " and the monster is Level " + DoorCards.listOfDoorCards.get(0).getLevel());
			if(allLevels > DoorCards.listOfDoorCards.get(0).getLevel())
				{
				if(DoorCards.listOfDoorCards.get(0).getName().equals("Lame Goblin"))
					{
					System.out.println("You've defeated the monster. Good job!");
					}
				}
			if(allLevels < DoorCards.listOfDoorCards.get(0).getLevel())
				{
				System.out.println("Since you dont have the levels to beat the monster so you must roll the die to see if you can escape!");
				if(die >= 5)
					{
					System.out.println("You barely escaped but you're still on the same level;");
					DoorCards.listOfDoorCards.remove(0);
					}
				if(die <= 4)
					{
					System.out.println("Woops you died.");
					DoorCards.listOfDoorCards.remove(0);
					}
				}
			}
		if(DoorCards.listOfDoorCards.get(0).getType().equals("Curse"))
			{
			
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
