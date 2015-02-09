
public class Armor extends TreasCards
	{
	private int bonus;
	private int goldVal;
	private int bigOrSmall;
	public Armor(String t, String n, int b,int bOS,  int gV)
		{
		setType(t);
		setName(n);
		bonus = b; 
		goldVal = gV;
		bigOrSmall = bOS;
		}
	
	public int getBonus()
		{
		return bonus;
		}
	
	public void setBonus(int bonus)
		{
		this.bonus = bonus;
		}
	
	public int getGoldVal()
		{
		return goldVal;
		}
	
	public void setGoldVal(int goldVal)
		{
		this.goldVal = goldVal;
		}
	
	public int getBigOrSmall()
		{
		return bigOrSmall;
		}
	
	public void setBigOrSmall(int bigOrSmall)
		{
		this.bigOrSmall = bigOrSmall;
		}
	
	public String getType()
		{
		return type;
		}

	public void setType(String type)
		{
		this.type = type;
		} 
	
	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
		} 
	}
