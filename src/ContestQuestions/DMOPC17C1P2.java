package ContestQuestions;

import java.util.*;

public class DMOPC17C1P2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(), M = in.nextInt();
        int[] psa = new int[N + 1];
        HashMap<Integer, Integer> freq = new HashMap<>();

        long ans = 0;
        for(int i = 0; i <= N; i++){
            if(i >= 1){
                psa[i] = (psa[i - 1] + in.nextInt()) % M;
            }

            if(freq.containsKey(psa[i])){
                ans += freq.get(psa[i]);
                int oldFreq = freq.get(psa[i]);
                freq.put(psa[i], oldFreq + 1);
            }
            else{
                freq.put(psa[i], 1);
            }
        }

        System.out.println(ans);
    }
}