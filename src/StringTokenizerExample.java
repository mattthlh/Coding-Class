import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordCount = 0, characterCount = 0;
        String line, word;
        StringTokenizer tokenizer;
        System.out.println("Please enter text (type DONE to quit):");
        line = sc.nextLine();
        while(!line.equals("DONE")) {
            tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()){
                word = tokenizer.nextToken();
                wordCount++;
                characterCount += word.length();
            }
            line = sc.nextLine();
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + characterCount);
    }
}
