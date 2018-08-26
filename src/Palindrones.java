import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Palindrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> arrayList = new ArrayList<>();
		ArrayList<Character> reversed = new ArrayList<>();
		System.out.println("Type a word:");
		String input = sc.nextLine();
		char[] charInput= input.toCharArray();
		for(int i = 0; i < charInput.length;i ++) {
			arrayList.add(charInput[i]);
			reversed.add(charInput[i]);
		}
		Collections.reverse(reversed);
		if(arrayList.equals(reversed)) {
			System.out.println("Yes, it is a palindrone");
		} else {
			System.out.println("No, it is not a palindrone");
		}
	}

}
