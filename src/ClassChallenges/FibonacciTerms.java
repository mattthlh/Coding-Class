package ClassChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciTerms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> fibNums = new ArrayList<>();
        int k = sc.nextInt();

        int a = 1;
        int b = 0;
        int filler;
        while(a < k) {
            fibNums.add(a);

            filler = a;
            a+=b;
            b=filler;
        }
        fibNums.add(a);

        for(int i = 0; i < fibNums.size(); i++) {
            if(fibNums.get(i) > k) {
                list.add(fibNums.get(i-1));
                k -= fibNums.get(i-1);
                i = 0;
            } else if(fibNums.get(i) == k) {
                list.add(fibNums.get(i));
                k -= fibNums.get(i);
                i = 0;
            }
            if(k == 0) {
                i = fibNums.size();
                System.out.println("Output : " + list.size());
            }
        }
    }
}
