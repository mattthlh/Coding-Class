package ContestQuestions;

import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nikky = 0;
        int nc = 0;
        int bc = 0;
        int bryon = 0;
        boolean fOR = true;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();

        while(nikky + nc < s) {
            if(fOR) {
                nikky += a;
                nc += a;
                fOR = false;
            } else {
                nikky -= b;
                nc += b;
                fOR = true;
            }
        }

        if(fOR) {
            nikky += s - nc;
        } else {
            nikky -= s - nc;
        }

        fOR = true;


        while(bryon + bc < s) {
            if(fOR) {
                bryon+= a;
                bc += a;
                fOR = false;
            } else {
                nikky -= b;
                bc += b;
                fOR = true;
            }
        }

        System.out.println(bryon);
        System.out.println();

        if(fOR) {
            System.out.println(bc);
            bryon += s - bc;
        } else {
            bryon -= s - bc;
        }

        if(nikky > bryon) {
            System.out.println("Nikky");
        } else if(bryon > nikky) {
            System.out.println("Bryon");
        } else {
            System.out.println("Tied");
        }
    }
}
