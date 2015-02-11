import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MunchkinRunner
	{
	static ArrayList<DoorCards> playerDCards = new ArrayList<DoorCards>();
	static ArrayList<TreasCards> playerTCards = new ArrayList<TreasCards>();
	public static void main(String[] args)
		{
		int allLevels = 0;
		Collections.shuffle(DoorCards.listOfDoorCards);
		Collections.shuffle(TreasCards.listOfTC);
		Player p = new Player("", "","", 1, 1);
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
		for(int i = 0; i < 3; i++)
			{
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("Monster"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));		
				}	
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("Curse"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));
				}			
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("MonsterAddition"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));
				}		
			if((DoorCards.listOfDoorCards.get(0)).getType().equals("Class"))
				{
				playerDCards.add(DoorCards.listOfDoorCards.get(0));
				}	
			}
				
		for(int i = 0; i < 3; i++)
			{
			if((TreasCards.listOfTC.get(0)).getType().equals("Weapon"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("Potion"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("Armor"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("Footgear"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				}
			
			if((TreasCards.listOfTC.get(0)).getType().equals("RandomBonus"))
				{
				playerTCards.add(TreasCards.listOfTC.get(0));
				}
			}
		for(int c = 0; c < playerTCards.size(); c++)
			{
			if(playerTCards.get(c).getType().equals("Weapon"))
				{
				lWB = lWB + playerTCards.get(c).getBonus();
				}
			if(playerTCards.get(c).getType().equals("Armor"))
				{
				
				}
			if(playerTCards.get(c).getType().equals("Headgear"))
				{
			
				}
			if(playerTCards.get(c).getType().equals("RandomBonus"))
				{
				
				}
			
			}
		return lWB;
		}
	public static void kickOpenTheDoor(int lev)
		{
		if(DoorCards.listOfDoorCards.get(0).getType().equals("Monster"))
			{
			
			}
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
