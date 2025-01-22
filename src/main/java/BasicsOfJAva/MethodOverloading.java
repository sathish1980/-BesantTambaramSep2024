package BasicsOfJAva;

public class MethodOverloading {
	
	public void add(int a , int b)
	{
		int c= a+b;
		System.out.println("adding 2 number: "+c);
	}
	public void add(double a , int b)
	{
		double c= a+b;
		System.out.println("adding 2 number with decimal: "+c);
	}
	public void add(double a , double b)
	{
		double c= a+b;
		System.out.println("adding 2 number with both decimal: "+c);
	}
	
	public void add(int a , int b,int d)
	{
		int c= a+b+d;
		System.out.println("adding 3 number: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M = new MethodOverloading();
		M.add(4.6, 5.6);
	}

}
