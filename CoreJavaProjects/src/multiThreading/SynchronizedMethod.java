package multiThreading;

public class SynchronizedMethod {
	
	public synchronized void readDateFromFile() { 

		System.out.println("--Started--"); 

		for (int i = 1; i <= 3; i++) { 

		System.out.println(Thread.currentThread().getName()+" --"+ i); 
		try { 
			Thread.sleep(500); 
			} catch (InterruptedException e) { 
			e.printStackTrace(); 
		} 

		} 
		System.out.println("--End--"); 
		} 


}
