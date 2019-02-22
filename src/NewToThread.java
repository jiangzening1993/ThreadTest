/**
 * 
 */

/**
 * @author Zening
 *
 */
public class NewToThread implements Runnable{
	
	public static void main(String args[]) {
		Thread t1 = new Thread(new NewToThread());
		t1.start();
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("I am runnable");
		
	}
	

}
