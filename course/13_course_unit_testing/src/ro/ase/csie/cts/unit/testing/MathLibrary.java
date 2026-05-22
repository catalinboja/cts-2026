package ro.ase.csie.cts.unit.testing;

public class MathLibrary {
	public static int addNumbers(int a, int b) {
		if(a == Integer.MAX_VALUE || b == Integer.MAX_VALUE)
			throw new UnsupportedOperationException();
		return a + b;
	}
	
	public static int getAverage(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum/values.length;
	}
	
	public static int getMinimum(int[] values) {
		int min = values[0];
		for(int i = 0 ; i < values.length; i++) {
			if(min > values[i])
				min = values[i];
		}
		return min;
	}
}







