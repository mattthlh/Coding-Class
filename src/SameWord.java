import java.util.Scanner;
import java.util.ArrayList;

public class SameWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a word");
		ArrayList<String> userWords = new ArrayList<>();
		String userInput = sc.nextLine();
		while(true) {
			if(!userWords.contains(userInput)) {
				userWords.add(userInput);
				userInput = sc.nextLine();
			}
			else {
				break;
			}
		}
	}	
}