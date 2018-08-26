
public class Average {

	public static void main(String[] args) {
		
		float a = 1;
		float b = 2;
		float c = 3;
		float d = 4;
		float average = average(a , b,  c, d);
		System.out.println((float)average);
	
		
	}

	private static float average(float a, float b, float c, float d) {
		// TODO Auto-generated method stub
		float sum = sum(a, b, c, d);
		sum = sum / 4;
		return sum;
		
		
	}

	private static float sum(float a, float b, float c, float d) {
		// TODO Auto-generated method stub
		return a + b + c + d;
		
	}
	}
