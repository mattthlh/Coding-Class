import java.util.Scanner;
import java.util.Random;
public class testHangman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int guess = 0;
		String[] hangmanWords = {"awkward", "bagpipes", "banjo", "bungler", "croquet", "crypt", "dwarves", "fervid", "fishhook", "unknown"};
		int numWord = rand.nextInt(9);
		int len = hangmanWords[numWord].length(); //Store the length which will be used to see if puzzle was solved.
		char[] temp = new char[len]; //Store a temp array which will be displayed to the user
		int wrongGuess = 0;
		for(int i = 0; i < temp.length; i++) //initialize the array
		{
		    temp[i] = '*';
		}
		System.out.print("Welcome to hangman");
		System.out.println("  +---+\n" + 
				   "  |   |\n" + 
				   "      |\n" + 
				   "      |\n" + 
				   "      |\n" + 
				   "========\n");
		while (wrongGuess <= 6 && wrongGuess >= 0)
		{
		    System.out.print("Enter a letter: ");
		    String test = sc.nextLine();
		    if(test.length() != 1) 
		    {
		        System.out.println("Please enter 1 character");
		    }

		    char testChar = test.charAt(0);

		    //Find matches
		    int foundPos = -2;
		    int foundCount = 0; //How many matches did we find
		    while((foundPos = hangmanWords[numWord].indexOf(testChar, foundPos + 1)) != -1)
		    {
		        temp[foundPos] = testChar; //Update the temp array from * to the correct character
		        foundCount++;
		        len--; //Decrease overall counter
		    }

		    if(foundCount == 0)
		    {
		        System.out.println("Sorry, didn't find any matches for " + test);
		        wrongGuess = wrongGuess + 1;
		    }
		    else
		    {
		        System.out.println("Found " + foundCount + " matches for " + test);
		    }
		    if(wrongGuess == 1)
		    {
		    	System.out.println("  +---+\n" + 
						   "  |   |\n" + 
						   "  o   |\n" + 
						   "      |\n" + 
						   "      |\n" + 
				   		   "========\n");
		    }
		    else if(wrongGuess == 2)
		    {
		    	System.out.println("  +---+\n" + 
						   "  |   |\n" + 
						   "  o   |\n" + 
						   "  |   |\n" + 
						   "      |\n" + 
				   		   "========\n");
		    }
		    else if(wrongGuess == 3)
		    {
		    	System.out.println("  +---+\n" + 
						   "  |   |\n" + 
						   "  o   |\n" + 
						   " /|   |\n" + 
						   "      |\n" + 
				   		   "========\n");
		    }
		    else if(wrongGuess == 4)
		    {
		    	System.out.println("  +---+\n" + 
						   "  |   |\n" + 
						   "  o   |\n" + 
						   " /|\\  |\n" + 
						   "      |\n" + 
				   		   "========\n");
		    }
		    else if(wrongGuess == 5)
		    {
		    	System.out.println("  +---+\n" + 
						   "  |   |\n" + 
						   "  o   |\n" + 
						   " /|\\  |\n" + 
						   "  /   |\n" + 
				   		   "========\n");
		    }
		    else
		    {
		    	System.out.println("  +---+\n" + 
						   "  |   |\n" + 
						   "  o   |\n" + 
						   " /|\\  |\n" + 
						   "  /\\  |\n" + 
				   		   "========\n");
		    	break;
		    }
		    //Print 
		    for(int i = 0; i < temp.length; i++)
		    {
		        System.out.print(temp[i]);
		    }
		    System.out.println();

		    if(len == 0)
		    {
		        break; //Solved!
		    }

		}

		if(len == 0)
		{
		    System.out.println("\n---------------------------");
		    System.out.println("Solved!");
		}
		else
		{
		    System.out.println("\n---------------------------");
		    System.out.println("Sorry you didn't find the mystery word!");
		    System.out.println("It was \"" + hangmanWords[numWord] + "\"");
		}
	}

}
