package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest3 {
	public static void main(String[] args) {
		 List<String> number = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
		 
		 List<Integer> evenNumber = number.stream().map(s-> Integer.valueOf(s)).filter(n->n%2==0).collect(Collectors.toList());
		 
		 for(int data : evenNumber) {
			 System.out.println("Data :"+data);
		 }

	}
}
