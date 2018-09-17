import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AverageCalculator {
    public static void main(String args[]){
        double mean = 0;
        double median;
        int mode = 0;
        int count = 0;

        ArrayList<Integer> name = new ArrayList<>();

        System.out.println("Example 2,4");
        System.out.println("Enter Numbers:");

        Scanner sc = new Scanner(System.in);
        String sequence = sc.nextLine();
        String[] array = sequence.split(",( *)");

        for(int i = 0; i < array.length; i++){
            name.add(Integer.parseInt(array[i]));
        }
        Collections.sort(name);

        for(int i = 0; i < name.size(); i++){
            mean += name.get(i);
        }
        mean = mean / name.size();

        int index = name.size() / 2;

        if (name.size() % 2 == 0) {
            // even # of terms
            int number1 = name.get(index - 1);
            int number2 = name.get(index);
            median = (number1 + number2) / 2.0; // if even, take mean of middle numbers
        } else {
            median = name.get(index);
        }

        for (int i = 0; i < name.size(); i++ ){
            int x = name.get(i);
            int tempCount = 1;

            for(int j = 0; j < name.size(); j++){
                int x2 = name.get(j);

                if( x == x2)
                    tempCount++;

                if( tempCount > count){
                    count = tempCount;
                    mode = x; //doesn't return all values if there are multiple modes
                }
            }
        }

        System.out.println("The mean is: " + mean + "\nThe median is: " + median + "\nThe mode is: " + mode);
    }
}
