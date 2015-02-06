
public class ClassC extends DoorCards
	{

	
	public ClassC(String t, String n, String d)
		{
		setName(n);
		setDesc(d);
		setType(t);
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
