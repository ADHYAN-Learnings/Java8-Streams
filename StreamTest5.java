package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest5 {
	public static void main(String[] args) {
		
		List<String> numbers = Arrays.asList("1","2","3","4","5");
		
		double[] integerNumber = numbers.stream().mapToDouble(Double::parseDouble).toArray();
		
		for(double n : integerNumber) {
			System.out.println(" Data :"+n);
		}

	}
}
