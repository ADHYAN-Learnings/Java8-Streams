package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

class StudentData {
	public int id;
	public String studentName;
	public int studentMarks;
	
	public StudentData(int id, String studentName, int studentMarks) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
}

public class StreamTest8 {
	public static void main(String[] args) {
		
       List<StudentData> studentDetails = new ArrayList<StudentData>();
		
		studentDetails.add(new StudentData(1,"Steve",67));
		studentDetails.add(new StudentData(2,"Matthew", 34));
		studentDetails.add(new StudentData(3,"Rohan",25));
		studentDetails.add(new StudentData(4,"Priya",84));
		studentDetails.add(new StudentData(5,"Neha",98));
		
		//allMatch
		//	boolean studentInformation = studentDetails.stream().allMatch(student->student.studentMarks>20);
		//	System.out.println(" studentInformation  : "+studentInformation);
			
			//anyMatch
		//	boolean studentInformation = studentDetails.stream().anyMatch(student->student.studentMarks>20);
		//	System.out.println(" studentInformation  : "+studentInformation);
				
			//NoneMatch
		//	boolean studentInformation = studentDetails.stream().noneMatch(student->student.studentMarks>98);
		//	System.out.println(" studentInformation  : "+studentInformation);
			
			//length
		//	long length =   studentDetails.stream().count();
		//	System.out.println(" length :"+length);
			

			//sorted
		/**	List<String> names = Arrays.asList("Aditya","Sooraj","Amit","Bruce","Harshit");
			List<String> studentData = names.stream().sorted().collect(Collectors.toList());
			
			for(String student : studentData) {
				System.out.println(student);
			} **/
			
			//or
			// forEach
		//	names.stream().sorted().forEach(System.out::println);
			
			// custom sort in string
	/**		studentDetails
			.stream()
			.sorted((student_1,student_2)->student_1.studentName.compareTo(student_2.studentName))
			.forEach(student->System.out.println(student.id+" : "+student.studentName+" : "+student.studentMarks));
		**/
			
			  // custom Sort in int 
	/**  	studentDetails
			.stream()
			.sorted(Comparator.comparingInt(student->student.studentMarks))
			.forEach(student->System.out.println(student.id+" : "+student.studentName+" : "+student.studentMarks));
		**/
			
			//peek used for debugging . works only if it is used in the intermediate operation not in the terminal operation
			
			//terminal operation
		//	studentDetails.stream().peek(student->System.out.println(student.id+" : "+student.studentName+" : "+student.studentMarks));
			
			//intermediate operation
		//	studentDetails.stream().peek(student->System.out.println(student.id+" : "+student.studentName+" : "+student.studentMarks)).count();
			
			//limit - value should not be above than this
		/**  List<StudentData> student =	 studentDetails.stream().sorted(Comparator.comparingInt(s->s.studentMarks)).filter(s->s.studentMarks>40).limit(2).collect(Collectors.toList());
		  
		   for(StudentData details : student) {
			   System.out.println(details.id+" : "+details.studentName+" : "+details.studentMarks);
		   }
		   **/
			
			//skip - skip (number of elements you want to skip)
			//studentDetails.stream().skip(2).forEach(s->System.out.println(s.id+" : "+s.studentName+" : "+s.studentMarks));
	    		       		
	   
	    	
	}
}
