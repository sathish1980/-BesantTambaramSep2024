package BasicsOfJAva;

public class Loops {
	
	/*
	 * loops:
	 * for loop
	 * while loop
	 * do while loop
	 */
	
	public void Print10Number(int number,int secondnumber)
	{
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);*/
		
		/*
		 * for(intialization;condition;increment/decement){}
		 */
		for(int firsnumber=1;firsnumber<=10;firsnumber++)
		{
			for(int j=10;j>1;j--)
			{
			System.out.println("j value : "+j);
			}
			if(number==firsnumber||secondnumber==firsnumber)
			{
				//break;
				continue;
			}
			System.out.println("i value: "+firsnumber);
		}
		
	}
	
	
	public void whileloop(int i)
	{
		/*
		 * while(condition){}
		 */
		
		while(i<10)
		{
			
			System.out.println(i);
			i=i+1;
		}
	}
	
	public void dowhileloop(int i)
	{
		/*
		 * do{}while(condition);
		 */
		
		do
		{
			
			System.out.println(i);
			i=i+1;
		}while(i<10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.Print10Number(3,5);
		L.dowhileloop(5);
	}

}
