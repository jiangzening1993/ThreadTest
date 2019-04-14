import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 */

/**
 * @author Zening
 *
 */
public class FairLock implements Runnable {
	public static ReentrantLock fairLock = new ReentrantLock(true);
	// public static ReentrantLock fairLock = new ReentrantLock();

	public void run() {
		while (true) {
			try {
				fairLock.lock();
				System.out.println(Thread.currentThread().getName() + "get Lock");
			} finally {
				fairLock.unlock();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		FairLock rl = new FairLock();
		Thread t1 = new Thread(rl, "Thread_t1");
		Thread t2 = new Thread(rl, "Thread_t2");
		t1.start();
		;
		t2.start();
	}

}
