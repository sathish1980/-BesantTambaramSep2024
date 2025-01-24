package BasicsOfJAva;

public class Stringsconcepts {
	
	String name = "Besant techs . R *";
	String name1= "besant techs";
	
	int age =10;
	
	public void myName()
	{
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('s'));
		System.out.println(name.lastIndexOf('s'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name==name1);// boolean
		System.out.println(name.compareTo(name1)); //return int
		System.out.println(name.equals(name1)); // return boolean
		System.out.println(name.equalsIgnoreCase(name1)); // return boolean
		System.out.println(name.contains("tec"));
		System.out.println(name.startsWith("Be"));
		System.out.println(name.endsWith("ch"));
		System.out.println(name.concat(name1));
		System.out.println(name+name1);
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,5));
		char[] c = name.toCharArray();// ['B','e','s','a','n','t',' ','t','e','c','h','s',' ','.',' R',' ','*']
		System.out.println(c);
		for (char eachchar : c)
		{
			System.out.println(eachchar);
		}
		System.out.println(name.replace("Z", "A"));
		
		System.out.println(name);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringsconcepts s = new Stringsconcepts();
		s.myName();
	}

}
