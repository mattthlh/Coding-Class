import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("choose your difficulty");
		System.out.println( 
				"- easy: 1-100\n" + 
				"- medium: 1-1000\n" + 
				"- difficult: 1-10,000");
		String difficulty = sc.nextLine();
		int userInput = Integer.parseInt(sc.nextLine());
		Random rand = new Random();
		
		if (difficulty.equals("easy"))
		{
			int randNum = rand.nextInt(100) + 1;
			while(userInput != randNum)
			{
				if(userInput > randNum)
				{
					System.out.println("Too high");
					userInput = Integer.parseInt(sc.nextLine());
				}
				else if(userInput < randNum)
				{
					System.out.println("Too low");
					userInput = Integer.parseInt(sc.nextLine());
				}
			}
			System.out.println("Nice guess, good job");
		}
		if (difficulty.equals("medium"))
		{
			int randNum = rand.nextInt(1000) + 1;
			while(userInput != randNum)
			{
				if(userInput > randNum)
				{
					System.out.println("Too high");
					userInput = Integer.parseInt(sc.nextLine());
				}
				else if(userInput < randNum)
				{
					System.out.println("Too low");
					userInput = Integer.parseInt(sc.nextLine());
				}
			}
			System.out.println("Nice guess, good job");
		}
		if (difficulty.equals("hard"))
		{
			int randNum = rand.nextInt(10000) + 1;
			while(userInput != randNum)
			{
				if(userInput > randNum)
				{
					
					System.out.println("Too high");
					userInput = Integer.parseInt(sc.nextLine());
				}
				else if(userInput < randNum)
				{
					System.out.println("Too low");
					userInput = Integer.parseInt(sc.nextLine());
				}
			}
			System.out.println("Nice guess, good job");
		}
	}

}
