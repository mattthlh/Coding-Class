public class NewmanConway {

    public static void main(String args[]) {
        System.out.println(p(10));

    }

    public static int p(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return p(p(n - 1)) + p(n - p(n - 1));
    }
}
