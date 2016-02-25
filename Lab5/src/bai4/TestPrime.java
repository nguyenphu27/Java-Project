package bai4;

public class TestPrime extends Thread{

	SynThread q;
	TestPrime(SynThread q){
		this.q = q;
		new Thread(this,"TestPrime").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
