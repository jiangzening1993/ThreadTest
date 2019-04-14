/**
 * 
 */
package producer_consumer_disruptor;

import com.lmax.disruptor.WorkHandler;

/**
 * @author Zening
 *
 */
public class Consumer implements WorkHandler<PCData> {
	public void onEvent(PCData event) throws Exception {
		System.out.println(Thread.currentThread().getId() + ":Event: --" + event.get() * event.get() + "--");
	}

}
