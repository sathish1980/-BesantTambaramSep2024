package assignament;

import java.util.Scanner;

public class Swiggy extends Rates{

	public void UI()
	{
		/*
		 * Get the hotel name from user and check the hotel exist or not
		 * if hotel exist then get the item from the user and check the item exist or not
		 * if item exist then get the quantity from the user
		 * then calcuate discount 
		 * then calculate tax
		 * then do the final invoice
		 * display the invoice
		 * stop the program
		 */
		Scanner hotelanamesacnner = new Scanner(System.in);
		System.out.println("Enter hotel Name : ");
		String hotelname = hotelanamesacnner.next();
		boolean hotelexistornot=FindHotelExistorNot(hotelname);
		HotelExist(hotelexistornot);
		//hotelanamesacnner.close();
		if(hotelexistornot)
		{
			Scanner itemanamesacnner = new Scanner(System.in);
			System.out.println("Enter Item Name : ");
			String itemname = itemanamesacnner.next();
			boolean itemexistornot = FindItemExistorNot(itemname);
			ItemExist(itemexistornot);
			if(itemexistornot)
			{
				Scanner quantitysacnner = new Scanner(System.in);
				System.out.println("Enter required quatity : ");
				int quantity = itemanamesacnner.nextInt();
				int itemprice = FindItemRates(itemname);
				System.out.println(" one piece of "+itemname+" rs. " +itemprice);
				int totalAmount = calcualteAmount(itemprice,quantity);
				System.out.println(" total amount : RS. "+totalAmount);
				
			}
			
		}
	}
	
	public void HotelExist(boolean value)
	{
		if (value)
		{
			System.out.println("The given hotel exist");
		}
		else	
		{
			System.out.println("The given hotel not exist .please try with some other hotel name");
		}
	}
	
	public void ItemExist(boolean value)
	{
		if (value)
		{
			System.out.println("The given Item exist");
		}
		else	
		{
			System.out.println("The given item not exist .please try with some other item name");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swiggy S = new Swiggy();
		S.UI();
	}

}
