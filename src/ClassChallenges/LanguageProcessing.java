package ClassChallenges;

import java.util.Scanner;

public class LanguageProcessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sCount = 0;
        int tCount = 0;

        for(int i = 0; i < n; i ++) {
            String lines = sc.nextLine();
            char[] chars = lines.toCharArray();

            for(int j = 0;j < chars.length; j++) {
                if(chars[j] == 's' || chars[j] == 'S') {
                    sCount++;
                } else if(chars[j] == 't' || chars[j] == 'T') {
                    tCount++;
                }
            }
        }

        if(sCount < tCount) {
            System.out.println("English");
        } else if(sCount > tCount) {
            System.out.println("French");
        } else {
            System.out.println("French");
        }
    }
}
