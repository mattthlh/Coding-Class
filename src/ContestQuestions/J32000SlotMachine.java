package ContestQuestions;

import java.util.Scanner;

public class J32000SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int count1 = sc.nextInt();
        int count2 = sc.nextInt();
        int count3 = sc.nextInt();
        int count = 0;

        count1++;
        count2++;
        count3++;

        while(money > 0) {
            money--;
            if(count1 == 35) {
                count1 = 0;
                money += 30;
            }
            count++;
            if(money == 0) {
                break;
            }
            money--;
            if(count2 == 100) {
                count2 = 0;
                money += 60;
            }
            count++;
            if(money == 0) {
                break;
            }
            money--;
            if(count3 == 10) {
                count3 = 0;
                money += 9;
            }
            count++;

            count1++;
            count2++;
            count3++;
        }
        System.out.println("Martha plays " + count + " times before going broke.");
        int a = 'A';
        int c = 'C' % 65;
        System.out.println(c);
    }
}