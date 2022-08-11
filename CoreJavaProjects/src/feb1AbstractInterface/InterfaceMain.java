package feb1AbstractInterface;

import java.util.Scanner;

public class InterfaceMain {
	public static void main(String[] args) { 

		Scanner scr = new Scanner(System.in); 

		System.out.println("Enter shapeName"); 
		String shapeName = scr.next(); 

		InterShape shape = InterfaceFactory.getInterShapeObject(shapeName); 

		if(shape != null) { 
		shape.calculateArea(); 
		} 
		else { 
		System.out.println(".. U entered Invalid Shape ...."); 
		} 

		scr.close(); 
		} 


}
