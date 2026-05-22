package ro.ase.csie.cts.unit.testing;

public class MathLibrary {
	
	public static int getMinimum(int[] values) {
		if(values == null || values.length == 0)
		{
			throw new UnsupportedOperationException();
		}
		int minimum = values[0];
		for(int i = 0;i < values.length; i++) {
			if(minimum > values[i])
				minimum = values[i];
		}
		return minimum;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
}
