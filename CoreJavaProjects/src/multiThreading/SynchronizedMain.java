package multiThreading;

public class SynchronizedMain {
	
	public static void main(String args[]) {
		
		SynchronizedMethod sm = new SynchronizedMethod();
		
		SynchronizedThreads st1= new SynchronizedThreads(sm);
		SynchronizedThreads st2= new SynchronizedThreads(sm);
		SynchronizedThreads st3= new SynchronizedThreads(sm);
		
		st1.setName("First");
		st2.setName("Second");
		st3.setName("Third");
		
		st1.start();
		st2.start();
		st3.start();
	}

}
