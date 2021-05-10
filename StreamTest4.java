package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	public int id;
	public String studentName;
	public int studentMarks;
	
	public Student(int id, String studentName, int studentMarks) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
}

public class StreamTest4 {
	public static void main(String[] args) {
	  List<Student> studentDetails = new ArrayList<Student>();
	  
	  studentDetails.add(new Student(1,"Steve",30));
	  studentDetails.add(new Student(2,"Matthew",55));
	  studentDetails.add(new Student(3,"Rohan",45));
	  studentDetails.add(new Student(4,"Priya",36));
	  studentDetails.add(new Student(5,"Neha",38));
	  
	  List<String> passedStudents = studentDetails.stream().filter(marks->marks.studentMarks>=40).map(s->s.studentName).collect(Collectors.toList());
	  
	  for(String name :passedStudents ) {
		  System.out.println("Name : "+name);
	  }
	}
}
