package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class StreamTest6 {
	public static void main(String[] args) {
		
       List<List<Integer>> number = new ArrayList<>();
       
       for(int i=0;i<5;i++) {
    	   number.add(new ArrayList<Integer>());
    	   for(int j=0;j<=i;j++) {
    		   number.get(i).add(j);
    	   }
       }
       
       System.out.println(number);
        List<Integer>  flattedData = number.stream().flatMap(n->n.stream()).distinct().collect(Collectors.toList());  
        System.out.println(flattedData);
     
	}
}
