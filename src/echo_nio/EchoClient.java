/**
 * 
 */
package echo_nio;

import java.nio.ByteBuffer;
import java.util.LinkedList;

/**
 * @author Zening
 *
 */
public class EchoClient {
	private LinkedList<ByteBuffer> outq;

	EchoClient() {
		outq = new LinkedList<ByteBuffer>();
	}

	public LinkedList<ByteBuffer> getOutputQueue() {
		return outq;
	}

	public void enqueue(ByteBuffer bb) {
		outq.addFirst(bb);
	}

}
