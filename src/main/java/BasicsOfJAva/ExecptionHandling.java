package BasicsOfJAva;

import java.io.IOException;

public class ExecptionHandling {
	
	public void add(int a, int b) throws ArithmeticException,IOException
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void div(int a, int b)
	{
		try
		{
		int c= a/b;
		System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You have enterd incorrect input please check your input");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally");
		}
		
	}
	
	public void ageCalculator(int age)
	{
		//try
		//{
		if(age>18)
		{
			System.out.println("Wlcome to teenage");
		}
		else
		{
			throw new ArithmeticException("hi wait for few more years to become teenage");
		}
		/*}
		catch(Exception e)
		{
			//System.out.println(e);
		}*/
	}
	
	public void data() 
	{
		try {
			add(3,5);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
		ExecptionHandling E = new ExecptionHandling();
		
		E.ageCalculator(17);
		E.div(5, 0);
		E.add(4, 5);
	}

}
