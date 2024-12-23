package Inheritance;

public class BeantPorur extends BesantMainBranch{
	
	String BranchName = "Besant Porur";
	String[] courseFees = {"Python-19000","Java-17000","testing-12000","C#-22000"};
	
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
		BeantPorur B = new BeantPorur();
		B.CourseEnquiry("testing");
	}

}
