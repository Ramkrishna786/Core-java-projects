package Feb7ExceptionHandling;

public class ShoppingPayment 
{
	void DoPayment(int card_Number) throws ShoppingCardException
	{
		if(card_Number==12345)
		{	
			System.out.println();
			System.out.println("Your payment is in process");	
		}
		else
		{
			throw new ShoppingCardException("Invalid car number");
			
		}
		
		
	}

}
