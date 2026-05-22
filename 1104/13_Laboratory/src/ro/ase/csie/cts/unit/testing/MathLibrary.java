package ro.ase.csie.cts.unit.testing;

public class MathLibrary {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int getMinimum(int[] values) {
		if(values.length == 0)
		{
			throw new UnsupportedOperationException();
		}
		int minimum = values[0];
		for(int i = 0; i < values.length; i++) {
			if(minimum > values[i])
				minimum = values[i];
		}
		return minimum;
	}
}
