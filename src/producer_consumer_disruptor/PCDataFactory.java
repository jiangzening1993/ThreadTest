/**
 * 
 */
package producer_consumer_disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * @author Zening
 *
 */
public class PCDataFactory implements EventFactory<PCData>{
	public PCData newInstance() {
		return new PCData();
	}

}
