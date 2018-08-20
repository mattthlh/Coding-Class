
public class Looping2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twoDArray = {{1, 2, 3},
			                {4, 5, 6},
			                {7, 8, 9, 10}}; 
		int len = twoDArray.length;

		for(int i = 0; i < twoDArray.length; i++) {
	        for(int j = 0; j < twoDArray[i].length; j++) {
	            System.out.println(twoDArray[i][j]);
	        }

		}
		}
			
	}


