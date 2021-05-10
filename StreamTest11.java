package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamTest11 {
	public static void main(String[] args) throws Exception {	
		List<String> names = Arrays.asList("Aditya","Sooraj","Harshit","Bruce","Amit");
		
		//	Optional<String> optionalReference = names.stream().findAny();
		
		//	Optional<String> optionalReference = Optional.empty();
				
		//	System.out.println(" optionalReference  : "+optionalReference.get());
			
		//	System.out.println(" optionalReference  : "+optionalReference.hashCode());
			
		//	System.out.println(" optionalReference  : "+optionalReference.orElse("List is empty"));
			
		//	Supplier<String> optionalElseGet = ()->"The List<String> data is empty";
		//	System.out.println(" optionalReference  : "+optionalReference.orElseGet(optionalElseGet));
			
			//or 
			
		//	System.out.println(" optionalReference  : "+optionalReference.orElseGet(()->"The List<String> data is empty"));
			
		//	System.out.println(" OptionalReference  :  "+optionalReference.map(s->s.toUpperCase()).get());
			
		        
			
			// and in the last instead of one name you can save all the names to optional
			
		//	Optional<List<String>> optionalReference =  Optional.of(names);
			
		//	System.out.println(optionalReference.get().get(2));		


	}
}
