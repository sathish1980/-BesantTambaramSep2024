package BasicsOfJAva;

public class Interfaceimplementation implements Interface1 {

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("1000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface2 I = new Interfaceimplementation();
		Interface1 I1 = new Interfaceimplementation();
		I1.discount();
		Interface1.amount();
	}

	
}
