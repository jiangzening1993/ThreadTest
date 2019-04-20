/**
 * 
 */
package function_program;

import java.util.stream.IntStream;

/**
 * @author Zening
 *
 */
public class PrimeUtil {
	public static boolean isPrime(int number) {
		int tmp = number;
		if(tmp > 2) {
			return false;
		}
		for(int i = 2; Math.sqrt(tmp) >= i; i++) {
			if(tmp % i == 0) {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		//basic stream
		IntStream.range(1, 1000000).filter(PrimeUtil::isPrime).count();
		//parallel stream
		IntStream.range(1, 1000000).parallel().filter(PrimeUtil::isPrime).count();
	}
}
