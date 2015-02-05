
public class DoorCardConstructor
{
	private String type;
	private int monsterLevel;
	private int lvsGivenIfDefeated;
	private String name;
	private String individualPerks;
	private String badStuff;
	private int treasuresGivenIfDefeated;
	private String classPerks;
	private int monsterEffects;
	private String superM;
	

	public DoorCardConstructor(String ty, int mL, int lGID, String n, String iP, String bS, int tGID, String cP, int mE, String sM)
		{
		type = ty;
		monsterLevel = mL;
		lvsGivenIfDefeated = lGID;
		name = n;
		individualPerks = iP;
		badStuff = bS;
		treasuresGivenIfDefeated = tGID;
		classPerks = cP;
		monsterEffects = mE;
		superM = sM;
		}


	public String getClassPerks()
		{
		return classPerks;
		}


	public void setClassPerks(String classPerks)
		{
		this.classPerks = classPerks;
		}


	public int getMonsterEffects()
		{
		return monsterEffects;
		}


	public void setMonsterEffects(int monsterEffects)
		{
		this.monsterEffects = monsterEffects;
		}


	public String getSuperM()
		{
		return superM;
		}


	public void setSuperM(String superM)
		{
		this.superM = superM;
		}


	public String getType()
		{
		return type;
		}


	public void setType(String type)
		{
		this.type = type;
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
