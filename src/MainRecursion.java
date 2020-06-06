public class MainRecursion {

    String args[] = new String[10];
    static int i = 0;
    public static void main(String[] args) {

        if (i <= 10){
            return;
        }

        System.out.println("Java" + i++);
        main(args);
    }
}
