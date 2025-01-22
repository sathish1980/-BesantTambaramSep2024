package assignament;

public class Items extends Hotel{

	String[] Items= {"Idly","dosa","poori"};
	String[] ItemsRate= {"Idly-10","dosa-45","poori-30"};
	
	public boolean FindItemExistorNot(String exepctedItemName)
	{
		for(String eachItemName : Items)
		{
			if(eachItemName.equalsIgnoreCase(exepctedItemName))
				return true;
		}
		return false;
	}
	
	public int FindItemRates(String exepctedItemName)
	{
		for(String eachItemrate : ItemsRate)
		{
			String[] value =eachItemrate.split("-");
			if(value[0].equalsIgnoreCase(exepctedItemName))
				return Integer.parseInt(value[1]);
		}
		return 0;
	}

}
