package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmpg17s2 {

    static int[] par;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = in.readLine().split(" ");

        int n = Integer.parseInt(firstLine[0]);
        int q = Integer.parseInt(firstLine[1]);

        par = new int[n];

        for(int i = 0; i < q; i++) {

        }

//        if(type.equals("A")) {
//            int fin1 = find(node1);
//            int fin2 = find(node2);
//
//            if(fin1 != fin2) {
//                par[fin1] = fin2;
//            } else {
//                int fin1 = find(node1);
//
//            }
//        }
    }
}
