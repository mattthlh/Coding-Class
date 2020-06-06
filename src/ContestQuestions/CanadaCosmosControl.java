package ContestQuestions;

import java.util.Scanner;

public class CanadaCosmosControl {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many antennas?");

        int antennas = sc.nextInt();

        System.out.println("How many eyes?");

        int eyes = sc.nextInt();

        if (antennas >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        } else if (antennas <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        } else if (antennas <= 2 && eyes <= 3) {
            System.out.println("GracmcMercurian");
        }
    }
}
