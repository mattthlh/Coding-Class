public class CombinationFromKeypad {

    public static void main(String[] args) {
        int input[] = {2, 3, 4};


        String one[] = {"A", "B", "C"};
        String two[] = {"D", "E", "F"};
        String three[] = {"G", "H", "I"};

        for(int i = 0; i < 3; i++) {
            String a = one[i];
            for(int j = 0; j < two.length; j++) {
                String b = two[j];
                for(int k = 0; k < three.length; k++){
                    String c = three[k];
                    System.out.println(a + b + c);
                }
            }
        }
    }
}
