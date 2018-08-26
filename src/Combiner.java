import java.util.ArrayList;

public class Combiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		b.add(4);
		b.add(5);
		b.add(6);
		ArrayList<Integer> list = combine(a, b);
		System.out.println(list);
	}
	private static ArrayList<Integer> combine(ArrayList<Integer> input1, ArrayList<Integer> input2){
		for(Integer num : input2) {
			input1.add(num);
		}
		return input1;	
	}
}

