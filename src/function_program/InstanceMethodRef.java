package function_program;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Zening
 *
 */
public class InstanceMethodRef {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		for(int i = 1; i < 10; i++) {
			users.add(new User(i, "billy" + Integer.toString(i)));
		}
		users.stream().map(User::getName).forEach(System.out::println);
	}
	
	public static class User {
		private int i;
		private String name;
		public User(int i, String name) {
			this.i = i;
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
	}

}
