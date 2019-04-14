/**
 * 
 */
package future;

/**
 * @author Zening
 *
 */
public class Main {
	public static void main(String[] args) {
		Client client = new Client();
		Data data = client.request("name");
		System.out.println("Done");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Data = " + data.getResult());
	}

}
