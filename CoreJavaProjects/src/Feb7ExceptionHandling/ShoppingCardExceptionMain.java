package Feb7ExceptionHandling;

import java.util.Scanner;

public class ShoppingCardExceptionMain {
	

	

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the login id");
		String id=sc.next();
		
		System.out.println("enter the password");
		int password=sc.nextInt();
		
		System.out.println("enter the card number");
		int cardNumber=sc.nextInt();
		
		ShoppingLogin scem= new ShoppingLogin();
		ShoppingPayment sp= new ShoppingPayment();
		try 
		{
		scem.login(id,password);
		sp.DoPayment(cardNumber);
		}
		catch(ShoppingCardException e)
		{
			e.printStackTrace();
		}
		
		sc.close();
	}

}
