
public class RandomBonus extends TreasCards
	{
	private int bonus;
	private int goldValue;
	
	public RandomBonus(String t, String n, int b, int gV)
		{
		setType(t);
		setName(n);
		bonus = b;
		goldValue = gV;
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
