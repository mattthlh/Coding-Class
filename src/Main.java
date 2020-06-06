import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] array = new double[n];
        String idk = sc.nextLine();

        for(int I = 0; I < n; I++) {
            String line = sc.nextLine();
            double a = Double.parseDouble(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);

            double answer = Math.pow(a, b);

            array[I] = answer;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.printf("%.2f", array[i]);
            System.out.println();
        }
    }
}