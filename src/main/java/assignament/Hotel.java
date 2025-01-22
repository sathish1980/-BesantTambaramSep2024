package assignament;

public class Hotel {
	
	String[] Hotels= {"A2B","SVB","B2B"};
	
	public boolean FindHotelExistorNot(String exepctedHotelName)
	{
		for(String eachHotelName : Hotels)
		{
			if(eachHotelName.equalsIgnoreCase(exepctedHotelName))
				return true;
		}
		return false;
	}

}
