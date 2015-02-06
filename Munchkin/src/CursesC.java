
public class CursesC extends DoorCards
	{

	
	public CursesC(String t, String n, String d)
		{		
		setType(t);
		setName(n);
		setDesc(d);
		}

	public String getName()
		{
		return name;
		}

	public void setName(String name)
		{
		this.name = name;
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

