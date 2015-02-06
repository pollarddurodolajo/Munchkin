
public class MonsterC extends DoorCards
	{
	private int level;
	private int levelsGiven;
	private int treasures;
	
	public MonsterC(String t, String n, int le, int levels, String bad, int tr)
		{
		setType(t);
		setName(n);		
		level = le;
		levelsGiven = levels;
		setDesc(bad);
		treasures = tr;
		
		}

	public int getTreasures()
		{
		return treasures;
		}

	public void setTreasures(int treasures)
		{
		this.treasures = treasures;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public int getLevel()
		{
		return level;
		}

	public void setLevel(int level)
		{
		this.level = level;
		}

	public int getLevelsGiven()
		{
		return levelsGiven;
		}

	public void setLevelsGiven(int levelsGiven)
		{
		this.levelsGiven = levelsGiven;
		}

	public String getDesc()
		{
		return desc;
		}

	public void setDesc(String desc)
		{
		this.desc = desc;
		}
	
	public void setType(String type)
		{
		this.type = type;
		}
	
	public String getType()
		{
		return type;
		}
	
	}

