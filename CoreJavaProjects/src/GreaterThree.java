import java.util.Scanner;

public class GreaterThree 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the 1st value");
		int value1=sc.nextInt();
		
		System.out.println("Enter the 1st value");
		int value2=sc.nextInt();
		
		System.out.println("Enter the 1st value");
		int value3=sc.nextInt();
		
		System.out.println("The value we have are "+value1+" , "+value2+" , "+value3);
		
		
		if(value1 == value2 && value2 == value3) 
		{
			System.out.println("All Nmbers are same");
		}
		else if(value1>value2&&value1>value3)
		{
			System.out.println("The greater value is"+value1);
		}
		else if(value2>value1&&value2>value3)
		{
			System.out.println("The greater value is"+value2);
		}
		else 
		{
			System.out.println("The greater value is   "+value3);
		}
		
		sc.close();
		
	}

}
