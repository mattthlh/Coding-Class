package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DMOPC_APhotographyProblem{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = in.readLine();

        int n = Integer.parseInt(firstLine.split(" ")[0]);
        int m = Integer.parseInt(firstLine.split(" ")[1]);

        double num = 0.0;
        int total = n * m;
        for (int i = 0; i < n; i++) {

            String[] nextLine = in.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                num = Double.parseDouble(nextLine[j]);
            }
        }

        if (num/total == 0.48) {
            System.out.println("correctly exposed");
            System.exit(0);
        } else if (num/total > 0.48) {
            System.out.println("overexposed");
        } else {
            System.out.println("underexposed");
        }
    }
}
