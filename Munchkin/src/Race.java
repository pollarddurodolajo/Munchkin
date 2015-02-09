
public class Race extends TreasCards
	{
	private String desc;
	
	public Race(String t, String n, String d)
		{
		setType(t);
		setName(n);
		desc = d;
		}

	public String getDesc()
		{
		return desc;
		}

	public void setDesc(String desc)
		{
		this.desc = desc;
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
