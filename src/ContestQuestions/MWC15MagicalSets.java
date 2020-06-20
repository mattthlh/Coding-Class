package ContestQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MWC15MagicalSets {

    static BufferedReader in;
    private static long[] magicalSets;
    private static int numberOfMergesQ;
    private static long[] finalSets;

    public static void main(String[] args) throws IOException {

        in = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = in.readLine().split(" ");

        int numberOfSetsN = Integer.parseInt(firstLine[0]); // number of sets
        int numberOfMergesQ = Integer.parseInt(firstLine[1]); // number of merges

        // each long is a magicalSet, ie 1,2,3,5 -> 0000000000000000010111x
        // where the 1's digit is unused
        magicalSets = new long[numberOfSetsN];
        finalSets = new long[numberOfMergesQ];

        // 1. parse the inputs: putting the initial magical sets into longs
        parseInputForMagicalSets(numberOfSetsN);

        // 2. parse the inputs and merge: directions for merging
        parseInputForDirectionsAndMerge(numberOfMergesQ);


        // 4. Have a function to translate the magical sets back so you can print it as output
        translateSetsAndPrint();
    }

    private static void translateSetsAndPrint() {
        for(int i = 0; i < finalSets.length; i++) {
            long longToTranslate = finalSets[i];
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < 64; j++) {
                long shiftedBit = (long) 1 << (long) j;
//                System.out.println(Long.toBinaryString(longToTranslate));
//                System.out.println(Long.toBinaryString(1 << j));
//                System.out.println(Long.toBinaryString(shiftedBit));

                if ((longToTranslate & shiftedBit) != 0) {
//                    System.out.println(j);
                    list.add(j - 30);
                }
            }

            System.out.print(list.size() + " ");
            for(int a : list) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    private static void parseInputForDirectionsAndMerge(int numberOfMergesQ) throws IOException{
        for(int i = 0; i < numberOfMergesQ; i++) {
            String s = in.readLine();

            String[] currentSetWithSizeAsFirstElement = s.split(" ");

            int numberOfSetsToMerge = Integer.parseInt(currentSetWithSizeAsFirstElement[0]);
            long setToBeMerged = 0;

            for(int j = 0; j < numberOfSetsToMerge; j++) {

                // +1 to skip the first element (which is the size)
                long b = magicalSets[Integer.parseInt(currentSetWithSizeAsFirstElement[j+1]) - 1];
//                System.out.println(Long.toBinaryString(b) + " (b)");
//                System.out.println(Long.toBinaryString(setToBeMerged) + " (setToBeMerged)");

                setToBeMerged = setToBeMerged ^ b;
//                System.out.println(Long.toBinaryString(setToBeMerged) + " (after Merge)\n");

            }
            finalSets[i] = setToBeMerged;
//            System.out.println(Long.toBinaryString(setToBeMerged) + " added to finalSet \n\n\n");
        }
    }


    private static void parseInputForMagicalSets(int numberOfSetsN) throws IOException {

        // for each line
        for (int i = 0; i < numberOfSetsN; i++) {
            String s = in.readLine();

            String[] currentSetWithSizeAsFirstElement = s.split(" ");

            magicalSets[i] = convertLineIntoALong(currentSetWithSizeAsFirstElement);
        }
    }

    private static long convertLineIntoALong(String[] currentSetWithSizeAsFirstElement) {
        int sizeOfSet = Integer.parseInt(currentSetWithSizeAsFirstElement[0]);

        // {5,2,1,3} -> 0000000000000000010111

        long magicalSet = 0;

        // sequentially add each number in:
        for (int i = 0; i < sizeOfSet; i++) {
            // for each number a, magicalSet += 2^a (+1 to skip first element)
            int num = Integer.parseInt(currentSetWithSizeAsFirstElement[i+1]);
            long bitToAdd = (long) Math.pow(2, num + 30);
            // Puts everything into positive
            magicalSet += bitToAdd;
//            System.out.println("current num to put: " + (num + 30));
//            System.out.println("current bitToAdd: " + bitToAdd);
//            System.out.println("current magicalSet: " + Long.toBinaryString(magicalSet));
        }

//        System.out.println("magicalSet added: " + Long.toBinaryString(magicalSet));
        return magicalSet;
    }
}




// see that the size of the input set is bounded with elements less between -30 <= x <= 30
// therefore you can use a long to represent the magical sets

// furthermore, you can use bitwise operations XOR to merge the sets

// Step: (k is length of longest set, n is number of sets; but we know, k is constrained to 60 or less)
// 1. parse the inputs: putting the initial magical sets into longs                     O(kn)
// 2. parse the inputs: directions for merging                                          O(kn)
// 3. Have a function to merge the sets together                                        O(k^2n) > O(kn)
// 4. Have a function to translate the magical sets back so you can print it as output  O(kn)