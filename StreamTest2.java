package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest2 {
	public static void main(String[] args) {
		
	List<String> names = Arrays.asList("Steve","Matthew","Rohan","Priya","Neha");
	 
	List<String> processedData = names.stream().filter(s->s.length()==5).collect(Collectors.toList());
	
	for(String data : processedData) {
		System.out.println("Data  :"+data);
	}
	

	}
}
