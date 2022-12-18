package codingtest;

public class CodeTest01_MPS {

	public static void main(String[] args) {
		int absolutes[]= {4,7,12};
		boolean signs[] = {true, false, true};
		int sum = 0;
		for(int i=0; i<absolutes.length; i++) {
		if(signs[i]) {
			sum += absolutes[i];
		}else {
			sum -= absolutes[i];
		}
		}
		
		
	}
	

}

