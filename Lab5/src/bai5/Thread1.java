package bai5;

import java.util.Calendar;

public class Thread1 extends Thread{
	
	SynThread q;
	Calendar now;
	
	Thread1(SynThread q){
		this.q = q;
		new Thread(this,"Thread1").start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			//get seconds 
			now = Calendar.getInstance();
			int h = now.get(Calendar.HOUR);
			int m = now.get(Calendar.MINUTE);
			int s = now.get(Calendar.SECOND);
			
			q.put(h,m,s);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
