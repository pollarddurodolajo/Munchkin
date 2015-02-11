
public class Armor extends TreasCards
	{
	private int bonus;
	private int goldVal;
	private int bigOrSmall;
	public Armor(String t, String n, int b,int bOS,  int gV)
		{
		setType(t);
		setName(n);
		setBonus(b);
		setGoldVal(gV);
		setBigOrSmall(bOS);
		}
	}
