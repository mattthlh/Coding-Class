package ClassChallenges;

public class PowerFunctionDAndQ {

    public static int power(int x, int n) {
        if(n == 1) {
            return x;
        } else if(n == 0) {
            return 1;
        }
        if(n%2 == 0) {
            return power(x,n/2) * power(x, n/2);
        } else {
            return x * power(x,n/2) * power(x, n/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(power(-3, 4));
    }
}
