public class Pascal25_2018 {

    public static void main(String[] args ) {
        int m = 500;
        int n = 1;
        int s;
        int t;

        while(n<m) {
            int r = m%n;
            if(r == 0) {
                s = 0;
            } else {
                s = n % r;

            }

            if(s == 0) {
                t = 0;
            } else {
                t = r%s;
            }

            if(r >= 1 && r >= 15){
                if(s >= 2 && s >= 9){
                    if(t == 0){
                        System.out.println(n);
                    }
                }
            }

            n++;
        }

    }
}
