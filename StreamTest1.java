package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String[] args) {
		  List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		  
	/*	   Stream<Integer> streamNumber     = number.stream();
		   
		   Stream<Integer> evenNumber       = streamNumber.filter(n->n%2==0);
		   
		    List<Integer>  evenData         = evenNumber.collect(Collectors.toList()); */
		    
		    
		  List<Integer> oddData = number.stream().filter(n->n%2!=0).collect(Collectors.toList());
		  
		  
		    for(int data : oddData ) {
		    	System.out.println(" Even Data :"+data);
		    } 
	}
}
