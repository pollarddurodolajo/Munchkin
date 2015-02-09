
public class Weapons extends TreasCards
{
	private int bonus;
	private int goldVal;
	private int BigOrSmall;	
	
	public Weapons(String t, String n, int b, int bi, int g)
		{
		setType(t);
		setName(n);
		bonus = b;
		goldVal = g;
		BigOrSmall = bi;
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
		return BigOrSmall;
		}

	public void setBigOrSmall(int bigOrSmall)
		{
		BigOrSmall = bigOrSmall;
		}
}
