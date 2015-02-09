import java.util.ArrayList;
import java.util.Collections;


public class MunchkinRunner
	{
	ArrayList playerCards = new ArrayList();
	public static void main(String[] args)
		{
		Collections.shuffle(DoorCards.listOfDoorCards);
		Collections.shuffle(TreasCards.listOfTC);
		Player p = new Player("", "","", 1, 1);
		initialDeal();
		while(p.getLevel() <=9)
			{
			kickOpenTheDoor(p.getLevel());
			lookForTrouble();
			lootTheRoom();
			charity();
			}
		System.out.println("You've gotten to the tenth level and completed the game!");
		}
	
	public static void initialDeal()
		{
		for(int i = 0; i < 6; i++)
			{
//			if(DoorCards.listOfDoorCards.get(0).getType().equals("Monster"))
			
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
