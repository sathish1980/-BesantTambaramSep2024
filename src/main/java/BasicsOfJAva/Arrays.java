package BasicsOfJAva;

public class Arrays {
	
	String name = "Sathish";
	String[] courses = {"java","python","c#","sql","testing"}; // String array
	int[] ages = {30,50,25,67,29};
	String[][] datas= {{"a1","a2","a3","a4"},
						{"b1","b2","b3","b4"},
						{"c1","c2","c3","c4"}};
	
	String[] items = new String[10];
	
	public void Myname()
	{
		System.out.println(name);
		System.out.println(courses.length);
		int totalLength = courses.length;
		for(int i=0;i<totalLength;i++)
		{
		System.out.println(courses[i]);
		}
		for(String value :courses)
		{
			System.out.println(value);
		}
		for(String v :items)
		{
			System.out.println(v);
		}
		items[0]="rice";
		items[9]= "tomato";
		items[9]=null;
		for(String v :items)
		{
			System.out.println(v);
		}
		
		int totalRows = datas.length;
		int totalcolumn= datas[0].length;
		System.out.println(totalRows);
		System.out.println(totalcolumn);
		System.out.println(datas[0][0]);
		for(int i=0;i <totalRows;i++)
		{
			for(int j=0;j<totalcolumn;j++)
			{
				System.out.print(datas[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.Myname();
	}

}
