
public class Potion extends TreasCards
	{
	String desc;
	int goldVal;
	
	public Potion(String t, String n, String d, int gV)
		{
		setName(n);
		setType(t);
		desc = d;
		goldVal = gV;
		}
	
	public String getDesc()
		{
		return desc;
		}

	public void setDesc(String desc)
		{
		this.desc = desc;
		}

	public int getGoldVal()
		{
		return goldVal;
		}

	public void setGoldVal(int goldVal)
		{
		this.goldVal = goldVal;
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
