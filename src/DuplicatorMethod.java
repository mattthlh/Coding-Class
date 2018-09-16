public class DuplicatorMethod{
    public static void main(String args[]) {
        int[][] twoDArray = {{1, 3, 5, 8},
                {2, 5, 7, 9},
                {5, 8, 3, 5},
                {3, 5, 7, 1}};
        twoDArray = duplicaterows(twoDArray);
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                System.out.print(twoDArray[j][i]);
            }
        }
    }
    public static int[][] duplicaterows(int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                int num = array[col][row];
                if((col) == (array.length - 1)){
                    return array;
                } else{
                    array[col + 1][row] = num;
                }
            }
        }
        return array;
    }
}