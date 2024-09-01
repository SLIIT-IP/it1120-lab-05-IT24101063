import java.util.Scanner;
public class IT24101063Lab5Q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of new members introduced: ");
		int noOfMembers = input.nextInt();
		if(noOfMembers<0)
		{
		System.out.print("Input must be a number 0 or greater");
		return;
		}
		

		switch(noOfMembers)
		{
			case 0 : System.out.print("No Prize");
				break;
			case 1 : System.out.print("Prize is a: Pen");
				break;
			case 2 : System.out.print("Prize is a: Umbrella");
				break;
			case 3 : System.out.print("Prize is a: Bag");
				break;
			case 4 : System.out.print("Prize is a: Travellig Chair");
				break;
			default : System.out.print("Prize is a: Headphone");
		}
	}
}
			