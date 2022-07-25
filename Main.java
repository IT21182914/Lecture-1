import java.util.Scanner;
public class Max {
	
	public static void main (String [] args) {
		
		
		Scanner inputs = new Scanner (System.in);
		
		
		System.out.println("Enter First integer:");
		int num1 = inputs.nextInt();
		
		
		System.out.println("Enter Second integer:");
		int num2 = inputs.nextInt();
		
		
		
		System.out.println("Enter Third integer:");
		int num3 = inputs.nextInt();
		
		int largest = 0;
		int smallest = 0;
		
		if(num1>num2 && num1>num3)
		{
			largest = num1;
			
			if(num2<num3)
			{
				
				smallest = num2;
				
			}
			else {
				smallest= num3;
				
			}
		}
		
		else if(num2>num1 && num2>num3)
		{
			largest=num2;
			
			if(num1<num3)
			{
				smallest = num1;
			}
			else {
				smallest = num3;
			}
		}
		else
		{
			largest = num3;
			
			if(num1<num3)
			{
				smallest = num1;
			}
			else {
				smallest = num3;
			}
			
		}
		
		System.out.println("Max is: "+ largest);
		System.out.println("Min is: "+ smallest);
		
		 
	}

}
