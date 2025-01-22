package BasicsOfJAva;

public class abstractionimplementation extends BesantTambaram{

	int a=10;
	String[] course = {"java","python","C#"};
	String[] coursefees = {"java-1000","python-2000","C#-3000"};
	//@Override
	public void courses() {
		// TODO Auto-generated method stub
		for(String eachcourse : course)
		{
			System.out.println(eachcourse);
		}
		a=a+10;
		System.out.println(a);
	}
	
	public void fees()
	{
		for(String eachcoursefees : coursefees)
		{
			String[] coursefees = eachcoursefees.split("-");
			System.out.println(coursefees[0]);
			System.out.println(coursefees[1]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantTambaram b = new abstractionimplementation();
		b.courses();
		b.add();
		abstractionimplementation a = new abstractionimplementation();
		a.fees();
		
	}

	

}
