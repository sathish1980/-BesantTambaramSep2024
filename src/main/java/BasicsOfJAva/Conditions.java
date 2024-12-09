package BasicsOfJAva;

import java.util.Scanner;

public class Conditions {
	
	/*
	 * Conditions / Statements
	 * 2 types
	 * 1.If conditions
	 * 		if condition
	 * 		if else
	 * 		if elseif
	 * 		nested if
	 * syntax : if(condition){}
	 * 2.Switch Conditions
	 */
	
	public void Signal(String colorOfSignal,String vehicleType,boolean patient)
	{
		if(colorOfSignal.equals("Green"))
		{
			System.out.println("You are good to go");
		}
		else if(colorOfSignal.equals("Red"))
		{
			if(vehicleType.equals("ambulance") && patient)
			{
				//if(patient)
				//{
				System.out.println("Hey i am ambulance give me a way");
			
				/*}
				else
				{
				System.out.println("You have to stop");
				}*/
			}
			else
			{
			System.out.println("You have to stop");
			}
		}
		else if(colorOfSignal.equals("Yellow"))
		{
			System.out.println("You are about to start / Stop");
		}
		else
		{
			System.out.println("Please provide valid color");
		}
		
		
		
	}
	
	public static boolean ConvertStringToBooelan(String value)
	{
		/*if(value.equals("Yes"))
		{
			return true;
		}
		else
		{
			return false;
		
		}*/
		
		switch(value)
		{
		case "Yes":
			return true;
		case "No":
			return false;
		default:
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions C = new Conditions();
		//C.Signal("Red","ambulance",false);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter color:");
		String color = s.nextLine();
		System.out.println("Enter vehicletype:");
		String vehicleType = s.nextLine();
		System.out.println("Enter patient Exist or not (Give Yes /No):");
		String patient = s.nextLine();
		boolean actualPatentStatus =ConvertStringToBooelan(patient);
		C.Signal(color,vehicleType,actualPatentStatus);
		s.close();
	}

}
