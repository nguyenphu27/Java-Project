package bai5;

public class SynThread {
	int hour;
	int minute;
	int second;
	
    boolean valueSet = false;
    synchronized int get() {
        if(!valueSet)
        try {
            wait();
        } catch(InterruptedException e) {
        System.out.println("InterruptedException caught");
        }
        if(second %2 == 0){
        	System.out.println("Current second is " +second+" (even)");
        }else{
        	System.out.println("Current second is " +second+" (odd)");
        }
        valueSet = false;
        notify();
        return second;
    }
    
    synchronized void put(int h, int m, int s) {
        if(valueSet)
        try {
            wait();
        } catch(InterruptedException e) {
            System.out.println("InterruptedException caught");
        }      
        this.hour = h;
        this.minute = m;
        this.second = s;     
        valueSet = true;
        System.out.println("Current time: " + hour +":"+ minute);
        notify();
    }
}
