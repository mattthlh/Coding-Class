public class Main{
    public static void main(String args[]) {
        int[][] twoDArray = {{1, 3, 5, 8},
                {2, 5, 7, 9},
                {5, 8, 3, 5},
                {3, 5, 7, 1}};
        twoDArray = duplicaterows(twoDArray);

        for(int row = 0; row < twoDArray[row].length; row++){
            for(int col = 0; col < twoDArray[row].length; col++){
                System.out.println(twoDArray[row][col]);
            }
        }
    }
    public static  int[][]duplicaterows(int[][] array){
        for(int row = 0; row < array[row].length - 1; row++){
            for(int j = 0; j < array[j].length - 1; j++){
                int col = 0;
                int num = array[row][col];
                array[row][col + 1] = num;
            }
        }
        return array;
    }
}