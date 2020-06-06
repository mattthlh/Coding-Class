package ContestQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DmojistanWar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int question = sc.nextInt();
        int n = sc.nextInt();
        String dmojistanC = sc.nextLine();
        String peglandC = sc.nextLine();
        String[] converter = dmojistanC.split(" ");
        String[] converter2 = peglandC.split(" ");
        int[] dmojistan = new int[n];
        int[] pegland = new int[n];
        for(int i = 0; i < n; i++) {
            dmojistan[i] = Integer.parseInt(converter[i]);
            pegland[i] = Integer.parseInt(converter2[i]);
        }

        Arrays.sort(dmojistan);
        Arrays.sort(pegland);

        if(question == 1) {
            
        } else {

        }
    }
}
