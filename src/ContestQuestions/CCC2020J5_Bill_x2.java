package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class CCC2020J5_Bill_x2 {

    static BufferedReader in;
    static int row, col, fin;
    static HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
    static HashSet<Integer> hasVisited  = new HashSet<>();
    static Stack<Integer> productToVisit = new Stack<>();

    public static void main(String[] args) throws IOException {

        // init
        in = new BufferedReader(new InputStreamReader(System.in));
        row = Integer.parseInt(in.readLine());
        col = Integer.parseInt(in.readLine());
        fin = row * col;
        readInput();

        // base
        productToVisit.push(1);
        hasVisited.add(1);

        // iter
        iterations();
    }

    private static void readInput() throws IOException {

        for (int x=0; x<row; x++) {
            String[] rowInputs = (in.readLine()).split(" ");
            for (int y=0; y<col; y++) {
                int input = Integer.parseInt(rowInputs[y]);
                if (input <= fin) {
                    int product = (x+1) * (y+1);
                    HashSet<Integer> numSet = map.getOrDefault(product, new HashSet<>());
                    numSet.add(input);
                    map.put(product, numSet);
                }
            }
        }
    }

    private static void iterations() {
        while(!productToVisit.isEmpty()) {
            // read from stack
            int product;
            if ((product = productToVisit.pop()) == fin) {
                System.out.println("yes");
                System.exit(0);
            }

            // get factors, check if not visited then add them to stack at the same time
            getFactors(product);
        }
        System.out.println("no");
        System.exit(0);
    }

    private static void getFactors(int num) {
        for(int dest : map.getOrDefault(num, new HashSet<>())) {
            if (!hasVisited.contains(dest)) {
                productToVisit.push(dest);
            }
        }
        hasVisited.add(num);
    }
}

/*

3
4
3 10 8 14
1 11 12 12
6 2 3 9

 */