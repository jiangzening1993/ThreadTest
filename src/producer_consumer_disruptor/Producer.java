/**
 * 
 */
package producer_consumer_disruptor;

import java.nio.ByteBuffer;

import com.lmax.disruptor.RingBuffer;


/**
 * @author Zening
 *
 */
public class Producer {
	private final RingBuffer<PCData> ringBuffer;
	
	public Producer(RingBuffer<PCData> ringBuffer) {
		this.ringBuffer = ringBuffer;
	}
	
	public void pushData(ByteBuffer bb) {
		long sequence = ringBuffer.next();
		try {
			PCData event = ringBuffer.get(sequence);
			event.set(bb.getLong(0));
		}finally {
			ringBuffer.publish(sequence);
		}
	}

}
