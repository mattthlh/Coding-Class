import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PrintLongest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a sentence:");
		String input = sc.nextLine();
		String [] parts = input.split(" ");
		 System.out.println(Arrays.stream(input.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));

	}

}
