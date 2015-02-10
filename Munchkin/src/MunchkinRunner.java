import java.util.ArrayList;
import java.util.Collections;


public class MunchkinRunner
	{
	static ArrayList<Cards> playerCards = new ArrayList<Cards>();
	public static void main(String[] args)
		{
		Collections.shuffle(DoorCards.listOfDoorCards);
		Collections.shuffle(TreasCards.listOfTC);
		Player p = new Player("", "","", 1, 1);
		initialDeal();
		while(p.getLevel() <=9)
			{
			playerCards.add(DoorCards.listOfDoorCards.get(0));
			System.out.println(playerCards.get(0).getLevel());
//			kickOpenTheDoor(p.getLevel());
//			lookForTrouble();
//			lootTheRoom();
//			charity();
			}
		System.out.println("You've gotten to the tenth level and completed the game!");
		}
	
	public static void initialDeal()
		{
		for(int i = 0; i < 3; i++)
			{
			if(((Cards) DoorCards.listOfDoorCards.get(0)).getType().equals("Monster"))
				{
//					playerCards.add(new MonsterC(DoorCards.listOfDoorCards.get(0).getType(), DoorCards.listOfDoorCards.get(0).getName(), DoorCards.listOfDoorCards.get(0).getLevel(), 
//							DoorCards.listOfDoorCards.get(0).getLevelsGiven(), DoorCards.listOfDoorCards.get(0).getDesc(), DoorCards.listOfDoorCards.get(0).getTreasures()));

			
				}
			
			if(((DoorCards) DoorCards.listOfDoorCards.get(0)).getType().equals("Curse"))
				{
				
				}
			
			if(((DoorCards) DoorCards.listOfDoorCards.get(0)).getType().equals("MonsterAddition"))
				{
				
				}
			
			if(((DoorCards) DoorCards.listOfDoorCards.get(0)).getType().equals("Class"))
				{
				
				}
			}
		
		for(int i = 0; i < 3; i++)
			{
			if(((TreasCards) TreasCards.listOfTC.get(0)).getType().equals("Weapon"))
				{
				
				}
			
			if(((TreasCards) TreasCards.listOfTC.get(0)).getType().equals("Potion"))
				{
				
				}
			
			if(((TreasCards) TreasCards.listOfTC.get(0)).getType().equals("Armor"))
				{
				
				}
			
			if(((TreasCards) TreasCards.listOfTC.get(0)).getType().equals("Footgear"))
				{
				
				}
			
			if(((TreasCards) TreasCards.listOfTC.get(0)).getType().equals("RandomBonus"))
				{
				
				}
			}
		}
	public static void kickOpenTheDoor(int lev)
		{
		
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
