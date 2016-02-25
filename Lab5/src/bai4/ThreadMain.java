package bai4;

public class ThreadMain {
	
	public static void main(String args[]) {
       
		SynThread q = new SynThread();
		new RandomPrime(q);		
		new TestPrime(q);
    }
}
