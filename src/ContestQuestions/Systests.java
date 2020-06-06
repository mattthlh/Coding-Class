package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Systests {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(in.readLine());

        int[] start = new int[b];
        int[] end = new int[b];
        int[] points = new int[b];

        for(int i = 0; i < b; i++){
            String[] tokens = in.readLine().split(" ");
            start[i] = Integer.parseInt(tokens[0]);
            end[i] = Integer.parseInt(tokens[1]);
            points[i] = Integer.parseInt(tokens[2]);
        }

        int f = Integer.parseInt(in.readLine());
        Integer[] failed = new Integer[f];
        for(int i = 0; i < f; i++)
            failed[i] = Integer.parseInt(in.readLine());

        Arrays.sort(failed);

        int sum = 0;

        for(int i = 0; i < b; i++){
            int target = start[i];

            int left = 0, right = f, mid;
            while(left < right){
                mid = (left + right) / 2;

                if(failed[mid] >= target){
                    right = mid;
                }
                else{
                    left = mid + 1;
                }
            }

            if(left == f || failed[left] > end[i]){
                sum += points[i];
            }
        }

        System.out.println(sum);
    }
}
