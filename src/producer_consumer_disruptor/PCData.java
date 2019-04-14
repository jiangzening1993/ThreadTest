/**
 * 
 */
package producer_consumer_disruptor;

/**
 * @author Zening
 *
 */
public class PCData {
	private long value;
	public void set(long value) {
		this.value = value;
	}
	
	public long get() {
		return value;
	}

}
