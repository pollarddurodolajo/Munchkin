public class TreasCards
{
	private String tOTC;
	private String name;
	private String desc;
	private int bonus;
	private int hands;
	private int bigOrSmall;
	private int goldValue;
	
	

	

	public TreasCards(String tC, String n, String des, int bon, int han, int bOS, int gV)
		{
		tOTC = tC;
		name = n;
		desc = des;
		bonus = bon;
		hands = han;
		bigOrSmall = bOS;
		goldValue = gV;
		}





	public String gettOTC()
		{
		return tOTC;
		}

	public void settOTC(String tOTC)
		{
		this.tOTC = tOTC;
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

	public int getBonus()
		{
		return bonus;
		}

	public void setBonus(int bonus)
		{
		this.bonus = bonus;
		}

	public int getHands()
		{
		return hands;
		}

	public void setHands(int hands)
		{
		this.hands = hands;
		}

	public int getBigOrSmall()
		{
		return bigOrSmall;
		}

	public void setBigOrSmall(int bigOrSmall)
		{
		this.bigOrSmall = bigOrSmall;
		}

	public int getGoldValue()
		{
		return goldValue;
		}

	public void setGoldValue(int goldValue)
		{
		this.goldValue = goldValue;
		}
}