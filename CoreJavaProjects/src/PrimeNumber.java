
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter any number to check prime numbers");
		 
		 int value1=sc.nextInt();
		 int temp=0;
		 
		 for(int i=2;i<=value1/2;i++)
		 {
			 if(value1%i==0)
			 {
				 temp=temp+1;
				 break;
			 }
		 }
		 
		 if(temp>0)
		 {
			 
			 System.out.println("the given number is not a prime number");
		 }
		 else
		 {
			 System.out.println("The given number is a prime number");
		 }
		 
		 sc.close();

	}

}
