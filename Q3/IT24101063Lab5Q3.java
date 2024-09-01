import java.util.Scanner;
public class IT24101063Lab5Q3
{
	public static void main(String[] args)
	{
		final double CHARGES_PER_DAY = 48000.0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		System.out.print("Enter End Date (1-31): ");
		int endDate = input.nextInt();
		if(startDate<1 || startDate>31|| endDate<1 || endDate>31)
			{
			System.out.print("Error: Days must be between 1 and 31");
			return;
			}

		if(startDate>endDate)
			{
			System.out.print("Error: Start date must be less than End Date");
			return;
			}

		System.out.println();
		System.out.println("Room Charge Per Day: Rs. " +CHARGES_PER_DAY+"/=");
		int noOfDays = endDate-startDate;
		System.out.println("Number of Days Reserved: " +noOfDays);
		
		double amount = noOfDays*CHARGES_PER_DAY;
		if(noOfDays<3)
			{
			//No Discount
			System.out.println("Total Amount to be paid: " +amount);
			}
		else if(3<=noOfDays || noOfDays>=4)
			{
			//10% Discount
			amount = (noOfDays*CHARGES_PER_DAY)*90/100;
			System.out.println("Total Amount to be paid: " +amount);
			}
		else
			{
			//20% Discount
			amount = (noOfDays*CHARGES_PER_DAY)*80/100;
			System.out.println("Total Amount to be paid: " +amount);
			}
	}
}