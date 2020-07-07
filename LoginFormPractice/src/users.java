import java.util.ArrayList;

public class users {
	private static ArrayList<ArrayList<String>> users = new ArrayList<ArrayList<String>>();
	
	public static void addUser(ArrayList<String> up) {
		users.add(up);
		System.out.println(users);
	}

	public static boolean checker(ArrayList<String> up) {
		if (users.contains(up)) {
			return true;
		} return false;
		
	}
}
