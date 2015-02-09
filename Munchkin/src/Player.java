
public class Player
	{
	private String name;
	private String race;
	private String classs;
	private int levelWithBonus;
	private int level;
	
	public Player(String n, String r, String c, int le, int l)
		{
		name = n;
		race = r;
		classs = c;
		levelWithBonus = le;
		level = l;
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		}

	public String getRace()
		{
		return race;
		}

	public void setRace(String race)
		{
		this.race = race;
		}

	public String getClasss()
		{
		return classs;
		}

	public void setClasss(String classs)
		{
		this.classs = classs;
		}

	public int getLevelWithBonus()
		{
		return levelWithBonus;
		}

	public void setLevelWithBonus(int levelWithBonus)
		{
		this.levelWithBonus = levelWithBonus;
		}

	public int getLevel()
		{
		return level;
		}

	public void setLevel(int level)
		{
		this.level = level;
		}
	}
