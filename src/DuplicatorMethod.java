public class DuplicatorMethod{
    public static void main(String args[]) {
        int[][] twoDArray = {{1, 5, 4, 8, 7, 3},
                             {2, 4, 3, 5, 7, 6},
                             {2, 4, 3, 3, 6, 0},
                             {9, 8, 9, 9, 4, 1}};
        twoDArray = duplicateRows(twoDArray);
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] duplicateRows(int[][] array) {
        int row = 0;
        int num;
        while (row < array.length) {
            if (row % 2 == 0) {
                for (int col  = 0; col < array[row].length; col++) {
                    num = array[row][col];
                    array[row + 1][col] = num;
                }
            }
            row++;
        }
        return array;
    }
}