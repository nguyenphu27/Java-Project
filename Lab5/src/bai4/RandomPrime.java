package bai4;

import java.util.Random;

public class RandomPrime extends Thread{

	SynThread q;
	Random rand = new Random();
	
	RandomPrime(SynThread q) {
		// TODO Auto-generated constructor stub
		this.q = q;
		new Thread(this,"RandomPrime").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		while(true){
			q.put(rand.nextInt(100));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
