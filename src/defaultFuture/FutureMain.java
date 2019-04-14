/**
 * 
 */
package defaultFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author Zening
 *
 */
public class FutureMain {
	public static void main(String[] args) throws InterruptedException, ExecutionException{
		FutureTask<String> future = new FutureTask<String>(new RealData("a"));
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		executor.submit(future);
		
		System.out.println("Done");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("data = " + future.get());
	}
}
