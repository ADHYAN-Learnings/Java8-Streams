package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest7 {
	public static void main(String[] args) {
       List<String> boySection = Arrays.asList("Steve","Matthew","Rohan");
       List<String> girlSection = Arrays.asList("Priya","Neha");
       
       List<List<String>> section = Arrays.asList(boySection,girlSection);
       System.out.println(section);
       
       List<String>  flattedSection =  section.stream().flatMap(n->n.stream()).collect(Collectors.toList());
       System.out.println(flattedSection);
	}
}
