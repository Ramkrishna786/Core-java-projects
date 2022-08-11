package MethodsImplemention;
import java.util.Scanner;

public class PartFullEmployeeMain 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of  employee");
		int empNo=sc.nextInt();
		
		FullTimeEmployee fullArray[]=new FullTimeEmployee[empNo];
		PartTimeEmployee partArray[]=new PartTimeEmployee[empNo];
		
		for(int i=0;i<fullArray.length;i++)
		{
			fullArray[i]= new FullTimeEmployee();
			
			System.out.println("enter the fulltime employee id ");
			int empId=sc.nextInt();
			fullArray[i].seteId(empId);
			
			System.out.println("enter the fulltime employee name ");
			String eName=sc.next();
			fullArray[i].seteName(eName);
			
			System.out.println("ente the fulltime employee designation");
			String eDesignation=sc.next();
			fullArray[i].seteDesignation(eDesignation);
			
			System.out.println("enter the fulltime employee slary");
			int eSalary=sc.nextInt();
			fullArray[i].setFullTimeSalary(eSalary);
			
			System.out.println("enter the fulltime employee bonus");
			int eBonus=sc.nextInt();
			fullArray[i].setFullTimeBonus(eBonus);
			
			partArray[i]=new PartTimeEmployee();
			System.out.println("enter the part time employee id");
			int partId=sc.nextInt();
			partArray[i].seteId(partId);
			
			System.out.println("enter the part time employee name ");
			String partName=sc.next();
			partArray[i].seteName(partName);
			
			System.out.println("ente the part tiem employee designation");
			String partDesignation=sc.next();
			partArray[i].seteDesignation(partDesignation);
			
			System.out.println("enter the part time employee total work hour");
			int partHours=sc.nextInt();
			partArray[i].setPartTimeHour(partHours);
			
			System.out.println("enter the part time hour rate");
			int partRates=sc.nextInt();
			partArray[i].setPartTimeRate(partRates);	
		}
		
		System.out.println("full time employee Details is");
		System.out.println("empId\tempName\tempDesignation\tempSalary\tempBonus");
		System.out.println("=========================================================");
		for(int i=0;i<fullArray.length;i++)
		{
			System.out.println(fullArray[i].geteId()+"\t"+fullArray[i].geteName()+"\t"+fullArray[i].geteDesignation()+"\t"+fullArray[i].getFullTimeSalary()+"\t"+fullArray[i].getFullTimeBonus());
		}
		System.out.println();
		System.out.println();
		System.out.println("Part time employee Details is");
		System.out.println("empId\tempName\tempDesignation\tempHour\tempRate\tPayment");
		System.out.println("=========================================================");
		for(int i=0;i<partArray.length;i++)
		{
			int total=partArray[i].getPartTimeHour()*partArray[i].getPartTimeRate();
			System.out.println(partArray[i].geteId()+"\t"+partArray[i].geteName()+"\t"+partArray[i].geteDesignation()+"\t"+partArray[i].getPartTimeHour()+"\t"+"$"+partArray[i].getPartTimeRate()+"\t"+"$"+total);
		}
		
		sc.close();
	}

}
