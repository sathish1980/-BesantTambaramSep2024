package TestCase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelfileRead;

public class DataProviderDetails {

	@DataProvider
	public Object[][] GetFlightSearchData() throws IOException
	{
		return ExcelfileRead.ExcelRead("FlightSearchwithValid");
	}

	@DataProvider
	public Object[][] GetFlightInvalidSearchData() throws IOException
	{
		return ExcelfileRead.ExcelRead("FlightSearchWithInvalid");
	}
	@DataProvider
	public Object[][] GetHotelSearchData() throws IOException
	{
		return ExcelfileRead.ExcelRead("HotelSearchWithValid");
	}
}
