import java.util.Scanner;
public class IT24101063Lab5Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first digit: ");
		int no1 = input.nextInt();
		System.out.print("Enter the second digit: ");
		int no2 = input.nextInt();
		System.out.print("Enter the third digit: ");
		int no3 = input.nextInt();	
		System.out.println();
		System.out.println("User entered numbers are : " +no1+" "+no2+" "+no3+" ");
	
		int smallestNumber = no1;	
		int largestNumber = no1;
	
		if(smallestNumber>no2)
		{smallestNumber = no2;}
		if(smallestNumber>no3)
		{smallestNumber = no3;}
		
		if(largestNumber<no2)
		{largestNumber = no2;}
		if(largestNumber<no3)
		{largestNumber = no3;}
		
		System.out.println("The Smallest number is: " +smallestNumber);
		System.out.println("The Largest number is: " +largestNumber);
	}
}
