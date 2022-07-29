package lab1;

import java.util.ArrayList;

public class EvenNumber_lab {

	private ArrayList<Integer> A1 = new ArrayList<Integer>();
	public ArrayList<Integer> storeEvenNumbers(int N) {
        A1 = new ArrayList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) A1.add(i);
		}
		return A1;
	}
	public ArrayList<Integer> retreiveEvenNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		
		for (int item : A1) {
			A2.add(item * 2);
			System.out.println(item * 2);
		}
		
		return A2;
	}
	public static void main(String[] args) {
		EvenNumber_lab a = new EvenNumber_lab();
		a.storeEvenNumbers(10);
		a.retreiveEvenNumbers();	

	}

}
