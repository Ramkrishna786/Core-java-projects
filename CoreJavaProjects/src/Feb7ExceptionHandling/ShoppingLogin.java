package Feb7ExceptionHandling;

public class ShoppingLogin 
{

	void login(String id,int password) throws ShoppingCardException
	{
		if(id.equalsIgnoreCase("ram")&& password == 12345)
		{
			System.out.print("Successfully login ");
		}
		else
		{
			throw new ShoppingCardException("invalid id and password");
		}
	}


}
