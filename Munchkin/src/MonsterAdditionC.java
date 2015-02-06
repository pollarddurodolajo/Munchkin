
public class MonsterAdditionC extends DoorCards
	{

	private int effect;
	
	public MonsterAdditionC(String t, String n, String d, int ef)
		{
		setName(n);
		setDesc(d);
		setType(t);
		effect = ef;
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

	public int getEffect()
		{
		return effect;
		}

	public void setEffect(int effect)
		{
		this.effect = effect;
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
