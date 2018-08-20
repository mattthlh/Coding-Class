import java.util.ArrayList;

public class Stylish {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(4);
		numbers.add(3);
		numbers.add(7);
		numbers.add(3);
		
		System.out.println("The numbers in the beginning:");
		
		print(numbers);
		
		remove(numbers, 4);
		
		System.out.println("The numbers after removal:");
		
		print(numbers);
	}

	private static void print(ArrayList<Integer> numbers) {
		// TODO Auto-generated method stub
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	private static void remove(ArrayList<Integer> numbers, int num) {
		while (numbers.contains(Integer.valueOf(num))) {
			numbers.remove(Integer.valueOf(num));
		}
	}

}
