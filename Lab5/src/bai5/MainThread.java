package bai5;

public class MainThread {

	public static void main(String args[]){
		
		SynThread q = new SynThread();
		new Thread1(q);
		new Thread2(q);
	}
}
