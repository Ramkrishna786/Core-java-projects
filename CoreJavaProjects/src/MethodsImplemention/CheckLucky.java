package MethodsImplemention;

import java.util.Scanner;

public class CheckLucky 
{

	public void lucky(int num)
	{
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

	}
	
	
	public static void main(String[] args) 
	{
		CheckLucky cl = new CheckLucky();
		System.out.println("Enter any number to check lucky number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		cl.lucky(num);
		sc.close();
	}

}
