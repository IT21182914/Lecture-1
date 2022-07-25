import java.util.Scanner;


public class Main {
	
	public static void main (String[] args)
	{
		
		
		Scanner inputs = new Scanner (System.in);
		
		
		System.out.println("Enter the length of rectangle:");
		Double length = inputs.nextDouble();
		
		System.out.println("Enter the width of rectangle");
		Double width = inputs.nextDouble();
		
		Double perimeter = length*2 + width*2;
		
		System.out.println("The perimeter of the rectangle is: " + perimeter);
		
		
		
		
		
		
		
		
		
	}

}
