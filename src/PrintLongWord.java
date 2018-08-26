import java.util.Scanner;

public class PrintLongWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a sentence:");
		String input = sc.nextLine();
		String [] parts = input.split(" ");
		String longestWord = "";
		for(int i = 0; i < parts.length; i++) {
			int len = parts[i].length();
			if(len > longestWord.length()) {
				longestWord = parts[i];
			}
		}
		System.out.println("The longest first word in that sentence is " + longestWord);
	}
}


