
import java.util.Scanner;

public class TwoDimention {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row of First 2D array");
		int arr1Row=sc.nextInt();
		System.out.println("Enter the coloumn of First 2D array");
		int arr1Coloumn=sc.nextInt();
		
		System.out.println("Enter the row of Second 2D array");
		int arr2Row=sc.nextInt();
		System.out.println("Enter the coloumn of Second 2D array");
		int arr2Coloumn=sc.nextInt();
	
		if(arr1Row==arr2Row&&arr1Coloumn==arr2Coloumn)
		{
			int arr1[][]=new int[arr1Row][arr1Coloumn];
			System.out.println("enter the value of first array");
			for(int i=0;i<arr1Row;i++)
			{
				System.out.println();
				for(int j=0;j<arr1Coloumn;j++)
				{
					arr1[i][j]=sc.nextInt();
				}	
		
			}
			
			int arr2[][]=new int[arr2Row][arr2Coloumn];
			System.out.println("enter the value of second array");
			for(int i=0;i<arr2Row;i++)
			{
				for(int j=0;j<arr2Coloumn;j++)
				{
					arr2[i][j]=sc.nextInt();
				}
				System.out.println();
			}
			
			int arr3[][]=new int[arr2Row][arr2Coloumn];
			for(int i=0;i<arr2Row;i++)
			{
				for(int j=0;j<arr2Coloumn;j++)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			
			for(int i=0;i<arr2Row;i++)
			{
				for(int j=0;j<arr2Coloumn;j++)
				{
					System.out.print(arr3[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
			
			
			
			
		}
		else
		{
			System.out.println("ERROR");
			System.out.println("Invalid size of array"); 
		}	
		sc.close();
	}

}
