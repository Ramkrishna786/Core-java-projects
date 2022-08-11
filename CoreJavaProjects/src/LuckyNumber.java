
import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) 
	{
	
		System.out.println("enter any three single digit numbers");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum;
		
		do {
			sum =0;
				
			while (num > 0) 
			{
			
			int result=num%10;
		    sum=sum+result;
		    num = num / 10;
		    
		    System.out.println(result +" ,"+sum);
		    
		    }
			num =sum;
		
		   }while(num>9);
	
			System.out.println(sum);
			sc.close();

	}

}
