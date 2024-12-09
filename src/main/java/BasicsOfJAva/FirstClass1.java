package BasicsOfJAva;

/*
 * accessmodifier class classname{}
 */
public class FirstClass1 {

	/*
	 * syntax: accessmodifier returntype methodname(arguments/parameters){}
	 */
	public void MyName() {
	System.out.println("sathish");
	}
	
	/*
	 * this method is use to run the java program
	 */
	public static void main(String[] a)
	{
		System.out.println("first");
		/* System.out.println("Besant TEchnology");
		System.out.println("2024");*/
		
		FirstClass1 F = new FirstClass1();
		F.MyName();
		// System.out.println("besant");
		System.out.println("second");
	}
}
