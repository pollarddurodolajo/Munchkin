
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

	

	public int getEffect()
		{
		return effect;
		}

	public void setEffect(int effect)
		{
		this.effect = effect;
		}
	
	}
