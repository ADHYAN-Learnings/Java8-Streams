package streams;

import java.util.Optional;

public class StreamTest10 {
	public static void main(String[] args) {
		  String data = null;
		  Optional<String> checkData = Optional.ofNullable(data);
		  
		  // if else condition : use isPresent
		  
		  if(checkData.isPresent()) {
			  System.out.println(" data  : "+data);
		  } else {
			  System.out.println(" The data variable is empty. ");
		  }
		  
		  
		  // or you can directly pass with the help of ifPresent
		  
		  checkData.ifPresent(System.out::println);
      
	}		 
}
