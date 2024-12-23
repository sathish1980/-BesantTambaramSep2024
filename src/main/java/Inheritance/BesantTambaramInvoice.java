package Inheritance;

public class BesantTambaramInvoice extends BesantTambaram{
	
	double taxpercentage=0.25;
	double discountpercentage=0.05;
	
	public double CalculateTax(int amount)
	{
		double taxamount = taxpercentage*amount;
		System.out.println("Tax amount is : "+taxamount);
		return taxamount;
	}
	
	public double CalculateDiscount(int amount)
	{
		double discountamount = discountpercentage*amount;
		System.out.println("dis amount is : "+discountamount);
		return discountamount;
	}
	
	public void finalBilling(int amount)
	{
		double tax= CalculateTax(amount);
		double discount = CalculateDiscount(amount);
		double finalamount=0;
		if(tax>0 && discount>=0)
		{
			finalamount=amount+tax-discount;
		}
		System.out.println("You have to pay finaly: Rs . "+finalamount);
	}
	
	public void sutdentenquiryandFeesDetails(String course)
	{
		String amount = CourseEnquiry(course);
		int actualmount = Integer.parseInt(amount);
		finalBilling(actualmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantTambaramInvoice B = new BesantTambaramInvoice();
		B.sutdentenquiryandFeesDetails("testing");
		B.CourseEnquiry(null);
		B.GetCourseExist(null);
	}

}
