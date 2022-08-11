package feb1AbstractInterface;

import java.util.Scanner;

public class AbstractMain 
{
	public static void main(String[] args) { 

		Scanner scr = new Scanner(System.in); 

		System.out.println("Ennter shape to calculate Area"); 
		String shapeName= scr.next(); 

		Shape shape = AbstractFactory.getShapeObject(shapeName); //crating circle class object 

		if(shape != null) 
		{ 
		shape.calculateArea(); 
		}
		else
		{ 
		System.out.println(" You Entered Invalid shape...."); 
		} 

		scr.close(); 
		} 


}
