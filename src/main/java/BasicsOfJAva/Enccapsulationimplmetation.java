package BasicsOfJAva;

public class Enccapsulationimplmetation extends Encapsulation{
	
	public void Myage()
	{
		System.out.println(getMyAge());	
	}
	
	public void setAge(int newage)
	{
		setMyAge(newage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enccapsulationimplmetation E = new Enccapsulationimplmetation();
		E.setAge(70);
		E.Myage();
	}

}
