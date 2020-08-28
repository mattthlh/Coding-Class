//package ContestQuestions;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Stack;
//
//public class CCC2020J5_Bill {
//
//    static BufferedReader in;
//    static int row, col;
//    static int fin = row * col;
//    static HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
//    static HashSet<Integer> hasVisited  = new HashSet<>();
//    static Stack<Integer> productToVisit = new Stack<>();
//
//    public static void main(String[] args) throws IOException {
//
//        // init
//        in = new BufferedReader(new InputStreamReader(System.in));
//        row = Integer.parseInt(in.readLine());
//        col = Integer.parseInt(in.readLine());
//        readInput();
//
//        // base
//        productToVisit.push(1);
//        hasVisited.add(1);
//
//        // iter
//        iterations();
//    }
//
//    private static void readInput() throws IOException {
//
//        for (int x=0; x<row; x++) {
//            String[] rowInputs = (in.readLine()).split(" ");
//            for (int y=0; y<col; y++) {
//                int input = Integer.parseInt(rowInputs[y]);
//                if (input <= fin) {
//                    int product = (x+1) * (y+1);
//
//                    if (!first.containsKey(product)) {
//                        first.put(product, input);
//                    } else {
//                        second.put(product, input);
//                    }
//                }
//            }
//        }
//    }
//
//    private static void iterations() {
//        while(!productToVisit.isEmpty()) {
//            // read from stack
//            int product;
//            if ((product = productToVisit.pop()) == fin) {
//                System.out.println("yes");
//                System.exit(0);
//            }
//
//            // get factors, check if not visited then add them to stack at the same time
//            getFactors(product);
//        }
//        System.out.println("no");
//        System.exit(0);
//    }
//
//    private static void getFactors(int num) {
//        int dest = first.getOrDefault(num, 1);
//        if (!hasVisited.contains(dest)) {
//            productToVisit.push(dest);
//        }
//        dest = second.getOrDefault(num, 1);
//        if (!hasVisited.contains(dest)) {
//            productToVisit.push(dest);
//        }
//        hasVisited.add(num);
//    }
//}