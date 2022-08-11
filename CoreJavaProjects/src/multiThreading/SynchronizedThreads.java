package multiThreading;

public class SynchronizedThreads extends Thread {
	
	
	SynchronizedMethod synchronizedMethod;
	
	public SynchronizedThreads(SynchronizedMethod synchronizedMethod) {
		
		this.synchronizedMethod= synchronizedMethod;
	}

	@Override
	public void run() {
		
		synchronizedMethod.readDateFromFile();
		
	}
	

}
