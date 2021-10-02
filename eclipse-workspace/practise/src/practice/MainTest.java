package practice;

public class MainTest {

	public static void main(String[] args) {
		MultiThread ob = new MultiThread();
		new Thread(()->{
			try {
				ob.printOne();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Thread-one").start();
		
		new Thread(()->{
			try {
				ob.printOther();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Thread-Other").start();
	}

}

class MultiThread {
	
	int sequence = 1;
	public void printOne() throws InterruptedException {
		synchronized (this) {
			while(sequence < 100) {
				while(sequence % 2 == 0) {
					wait();
				}
				System.out.println(sequence + " ::: printed by " + Thread.currentThread().getName());
				sequence++;
				notify();
			}
		}
	}
	
	public void printOther() throws InterruptedException {
		synchronized (this) {
			while(sequence < 100) {
				while(sequence % 2 != 0) {
					wait();
				}
				System.out.println(sequence + " ::: printed by " + Thread.currentThread().getName());
				sequence++;
				notify();
			}
		}
	}
}