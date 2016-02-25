package bai5;

public class Thread2 extends Thread{

	SynThread q;
	
	Thread2(SynThread q){
		this.q = q;
		new Thread(this,"Thread2").start();;
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
