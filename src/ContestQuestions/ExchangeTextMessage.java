package ContestQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class ExchangeTextMessage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> counts = new ArrayList<>();

        for(int i = 0; i < m; i ++) {
            list.add(sc.nextLine());
        }

        for(int i = 0; i < list.size(); i ++) {
            if(!list.get(i).split(" ")[0].equals("W")) {
                String a = list.get(i).split(" ")[1];
                int b = Integer.parseInt(a);
                if(!list1.contains(b)) {
                    list1.add(b);
                }
            } else {
                String a = list.get(i).split(" ")[1];
                int b = Integer.parseInt(a);
                counts.add(b);
            }
        }

        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
