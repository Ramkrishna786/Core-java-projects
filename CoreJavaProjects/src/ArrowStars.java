import java.util.Scanner;

public class ArrowStars {

	public static void main(String[] args) 
	{
		System.out.println("enter any number in between 1 to 20 to generate Stars");
		Scanner sc=new Scanner(System.in);
		
		int value=sc.nextInt();
		
		for(int i=1;i<=value;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		
		}
		
		for(int i=1;i<=value;i++)
		{
			System.out.println();
			
			for(int j=value-1;j>=i;j--)
			{
				System.out.print("* ");
			}
			
		}
		
		
		sc.close();

	}

}
