package Inheritance;

public class BesantMainBranch {
	
	String name = "MAin Branch";
	
	String[] courses = {"Python","Java","testing","C#"};
	
	public boolean GetCourseExist(String coursename)
	{
		for(String eachcourse : courses)
		{
			if(coursename.equalsIgnoreCase(eachcourse))
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantMainBranch B = new BesantMainBranch();
		System.out.println(B.GetCourseExist("SQL"));
	}

}
