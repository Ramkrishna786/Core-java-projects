import java.util.Scanner;

public class SingleDimention
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please enter the size of array 1");
		int size1=sc.nextInt();
		System.out.println("please enter the size of array 2");
		int size2=sc.nextInt();
		System.out.println("please enter the size of array 3");
		int size3=sc.nextInt();
		
		if(size1==size2&&size2==size3)
		{	
		int arr1[]=new int[size1];
		System.out.println("Enter the value for the First array");
		for(int i=0;i<size1;i++)
		{	
			arr1[i]=sc.nextInt();
		}	
		
		int arr2[]=new int[size2];
		System.out.println("Enter the value for the second array");
		for(int i=0;i<size1;i++)
		{	
			arr2[i]=sc.nextInt();
		}
		
		int arr3[]=new int[size3];
		
		for(int i=0;i<size3;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println("the sum of arr1 and arr2 is");
		for(int i=0;i<size3;i++)
		{	
			System.out.print(arr3[i]);
			System.out.print("\t");
		}
		}
		else
		{
			System.out.println("ERROR");
			System.out.println("please enter equal size for array");
		}	
		
		sc.close();
	}

}
