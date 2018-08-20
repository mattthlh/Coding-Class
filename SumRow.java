import java.util.Scanner;

public class SumRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDArray = {{1, 2, 3},
							 {4, 5, 6},
							 {7, 8, 9}};
		System.out.println("Row 0, 1, or 2?");
		sum(twoDArray);
	}

	private static void sum(int[][] twoDArray) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println(twoDArray[0][0] + " + " + twoDArray[0][1] + " + " + twoDArray[0][2] + " = " + (twoDArray[0][0] + twoDArray[0][1] + twoDArray[0][2]));
		}
		else if(input == 1) {
			System.out.println(twoDArray[1][0] + " + " + twoDArray[1][1] + " + " + twoDArray[1][2] + " = " + (twoDArray[1][0] + twoDArray[1][1] + twoDArray[1][2]));
		}
		else if(input == 2) {
			System.out.println(twoDArray[2][0] + " + " + twoDArray[2][1] + " + " + twoDArray[2][2] + " = " + (twoDArray[2][0] + twoDArray[2][1] + twoDArray[2][2]));
		}
		else {
			System.out.println("0, 1 or 2, it's not hard!");
		}
	}
}