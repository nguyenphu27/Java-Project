package bai4;

public class SynThread {
	int n;
    boolean valueSet = false;
    synchronized int get() {
        if(!valueSet)
        try {
            wait();
        } catch(InterruptedException e) {
        System.out.println("InterruptedException caught");
        }
        if(isPrime(n)){
        	System.out.println(n + ": is Prime!");
        }else{
        	System.out.println(n + ": Not is Prime!");
        }       
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n) {
        if(valueSet)
        try {
            wait();
        } catch(InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        this.n = n;
        valueSet = true;
        //System.out.println("Random: " + n);
        notify();
    }
    
    public static boolean isPrime(int i) {
        int c;
        for (c = 2; c < i; c++) {
            if (i % c == 0) {
                return false;
            }
        }
        return true;
    }
}
