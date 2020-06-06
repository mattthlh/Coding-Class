package ContestQuestions;

import java.util.Scanner;

public class DMOPCDeforestation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] treeMass = new int[n];

        String idk = sc.nextLine();

        for(int i = 0; i < n; i++) {
            int mass = sc.nextInt();

            treeMass[i] = mass;
        }

        int q = sc.nextInt();
        int[] queries = new int[q];

        String idkTheSequel = sc.nextLine();

        for(int i = 0; i < q; i++) {
            String query = sc.nextLine();

            String a = query.split(" ")[0];
            String b = query.split(" ")[1];

            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            for(int j = num1; j <= num2; j++) {
                queries[i] += treeMass[j];
            }
        }

        for(int mass: queries) {
            System.out.println(mass);
        }
    }
}
