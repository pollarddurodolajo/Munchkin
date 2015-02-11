
public class Weapons extends TreasCards
{
	private int bonus;
	private int goldVal;
	private int BigOrSmall;	
	
	public Weapons(String t, String n, int b, int bi, int g)
		{
		setType(t);
		setName(n);
		setBonus(b);
		setGoldVal(g);
		setBigOrSmall(bi);
		}
}
