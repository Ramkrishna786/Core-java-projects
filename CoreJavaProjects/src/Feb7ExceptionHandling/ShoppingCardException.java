package Feb7ExceptionHandling;

public class ShoppingCardException extends Exception 
{
	private String message;
	
	//default constructor
	public ShoppingCardException()
	{
		message="customezed shopping card exception";
	}
	
	//parametrized constructor
	public ShoppingCardException(String message)
	{
		this.message=message;
	}
	

	public String getMessage()
	{
		return message;
	}

	
	
	
}
