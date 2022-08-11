
import java.util.Scanner;
public class DownStars {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number between 1 to 20 to genrate Stars");
		
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		
		for(int i=1;i<=value;i++)
		{
			System.out.println();
			
			for(int j=value;j>=i;j--)
			{
				System.out.print("* ");
			}
			
		}
		
		sc.close();

	}

}
