import java.util.HashMap;
import java.util.Scanner;

public class Main 
{

	static HashMap<String, String> loginInfo = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loginInfo.put("matthe","lambo");
		loginInfo.put("kelvin","ferarri");
		loginInfo.put("bob", "mercedes");
		System.out.println("USERNAME:");
		String username = sc.nextLine();
		System.out.println("Password:");
		String password = sc.nextLine();
		checkLogin(username, password);
	}
	
	private static void checkLogin(String username, String password) {
		if(loginInfo.containsKey(username)) {
			if(loginInfo.get(username).equals(password)) {
				System.out.println("Successfully logged in");
			} else {
				System.out.println("Invalid Password");
			}
		} else {
			System.out.println("Invalid UserName");
		}
	}
}
