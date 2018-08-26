import java.util.Scanner;

public class NumberSequence {
	public static void main(String[] args) {
		boolean arithmetic = false;
		boolean geometric = false;
		boolean none = false;
		Scanner sc = new Scanner(System.in);
		String sequence = sc.nextLine();
		String[] stringSeqeunce = sequence.split(",");
		int[] numbers = new int[stringSeqeunce.length];
		for(int i = 0; i < stringSeqeunce.length; i++) {
			String one = stringSeqeunce[i];
			int number = Integer.parseInt(one);
			numbers[i] = number;
		}
		int constant = numbers[1] - numbers[0];
		int multiplier = numbers[1] / numbers[0];
		for(int i = 2; i < numbers.length; i++) {
			if((numbers[i] - numbers[i - 1]) == constant) {
				arithmetic = true;
			}
			else if((numbers[i] / numbers[i - 1]) == multiplier) {
				geometric = true;
			}
			else {
				none = true;
			}
		}
		if(arithmetic == true && geometric == false && none == false) {
			System.out.println("This sequence is an arithmetic sequence");
		}
		else if(arithmetic == false && geometric == true && none == false) {
			System.out.println("This sequence is an geometric sequence");
		}
		else if(arithmetic == true && geometric == true && none == false) {
			System.out.println("It is neither geometric nor arthmetic");
		}
		else {
			System.out.println("It is neither geometric nor arthmetic");
		}
	}

}
