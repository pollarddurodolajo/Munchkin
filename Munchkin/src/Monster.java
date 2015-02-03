
public class Monster
{
	private int monsterLevel;
	private int lvsGivenIfDefeated;
	private String name;
	private String individualPerks;
	private String badStuff;
	private int treasuresGivenIfDefeated;
	

	public Monster(int mL, int lGID, String n, String iP, String bS, int tGID)
		{
		monsterLevel = mL;
		lvsGivenIfDefeated = lGID;
		name = n;
		individualPerks = iP;
		badStuff = bS;
		treasuresGivenIfDefeated = tGID;
		}


	public int getMonsterLevel()
		{
		return monsterLevel;
		}


	public void setMonsterLevel(int monsterLevel)
		{
		this.monsterLevel = monsterLevel;
		}


	public int getLvsGivenIfDefeated()
		{
		return lvsGivenIfDefeated;
		}


	public void setLvsGivenIfDefeated(int lvsGivenIfDefeated)
		{
		this.lvsGivenIfDefeated = lvsGivenIfDefeated;
		}


	public String getName()
		{
		return name;
		}


	public void setName(String name)
		{
		this.name = name;
		}


	public String getIndividualPerks()
		{
		return individualPerks;
		}


	public void setIndividualPerks(String individualPerks)
		{
		this.individualPerks = individualPerks;
		}


	public String getBadStuff()
		{
		return badStuff;
		}


	public void setBadStuff(String badStuff)
		{
		this.badStuff = badStuff;
		}


	public int getTreasuresGivenIfDefeated()
		{
		return treasuresGivenIfDefeated;
		}


	public void setTreasuresGivenIfDefeated(int treasuresGivenIfDefeated)
		{
		this.treasuresGivenIfDefeated = treasuresGivenIfDefeated;
		}
	
}
