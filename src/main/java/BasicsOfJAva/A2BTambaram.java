package BasicsOfJAva;

public class A2BTambaram extends A2BRates{

	public void calc(int a1)
	{
		double newcalculation = a1*0.1;
		System.out.println(newcalculation);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2BTambaram a = new A2BTambaram();
		a.calc(1000);
	}

}
