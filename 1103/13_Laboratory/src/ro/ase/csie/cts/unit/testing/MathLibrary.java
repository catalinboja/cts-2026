package ro.ase.csie.cts.unit.testing;

public class MathLibrary {
	
	public static int getSum(int[] values) {
		
		if(values == null || values.length == 0) {
			throw new UnsupportedOperationException();
		}
		
		
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
