import java.util.Scanner;

public class TaxTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double taxPerc = 0.12;
		double num = sc.nextDouble();
		double tax = (taxPerc * num);
		System.out.println("Tax is:" + tax  + "%");
		System.out.println("Total is " + (num + tax));
	}

}
