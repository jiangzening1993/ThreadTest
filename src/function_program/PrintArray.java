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
public class PrintArray {
	static int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};
	
	
	public static void main(String[] args) {
		
		//classic in Java 7
		/*for(int i : arr) {
			System.out.println(i);
		}*/
		
		
		//use steam in Java 8
		/*Arrays.stream(arr).forEach(new IntConsumer() {
			public void accept(int value) {
				System.out.println(value);
			}
		});*/
		
		
		//Simplify
		/*Arrays.stream(arr).forEach((final int x)->{
			System.out.println(x);
		});*/
		
		
		//Simplest
		Arrays.stream(arr).forEach((x)->System.out.println(x));
	}
}
