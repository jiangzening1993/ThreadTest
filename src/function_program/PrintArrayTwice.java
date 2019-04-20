/**
 * 
 */
package function_program;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * @author Zening
 *
 */
public class PrintArrayTwice {
	static int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public static void main(String[] args) {
		IntConsumer outprintln = System.out::println;
		IntConsumer errprintln = System.err::println;
		
		Arrays.stream(arr).forEach(outprintln.andThen(errprintln));
	}

}
