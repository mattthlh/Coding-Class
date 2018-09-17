public class DuplicatorMethod{
    public static void main(String args[]) {
        int[][] twoDArray = {{1, 3, 5, 8},
                             {2, 5, 7, 9},
                             {5, 8, 3, 5},
                             {3, 5, 7, 1}};
        twoDArray = duplicaterows(twoDArray);
        for(int i = 0; i < twoDArray.length; i++){
            for(int j = 0; j < twoDArray[i].length; j++){
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] duplicaterows(int[][] array){
        int count = 0;
        int num;
        while(count < array.length){
            if(count % 2 == 0){
                for(int row  = 0; row < array.length; row++){
                    num = array[count][row];
                    array[count + 1][row] = num;
                }
                count++;
            }
            count++;
        }
        return array;
    }
}