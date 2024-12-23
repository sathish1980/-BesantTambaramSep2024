package Inheritance;

public class BesantTambaram extends BesantMainBranch {
	
	String BranchName = "Besant Tambaram";
	String[] courseFees = {"Python-20000","Java-15000","testing-10000","C#-25000"};
	
	
	public String CourseEnquiry(String Course)
	{

		if(GetCourseExist(Course)) {
			System.out.println("Hi "+Course+" course is exist");
			String fees =GetCourseFees(Course);
			System.out.println("You have to pay Rs. "+fees +" to pursue this course");
			return fees;
		}
		else
		{
			System.out.println("The requested course is not exist at the moment");
		}
		return null;
	}
	
	
	public String GetCourseFees(String course)
	{
		for(String eachcourseFees: courseFees)
		{
			//System.out.println(eachcourseFees);
			String[] courseandcourseFees = eachcourseFees.split("-");
			if(courseandcourseFees[0].equalsIgnoreCase(course))
				return courseandcourseFees[1];
			
		}
		return "0";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantTambaram B = new BesantTambaram();
		B.CourseEnquiry("testing");
		//B.GetCourseExist("Testing");
	}

}
