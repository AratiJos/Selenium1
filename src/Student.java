import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1272082572627303916L; 
	String firstname, lastname, dept;
	int rollno;
	long phone;
	double cgpa;
}
class writeDemo{
	
	
	public static void main(String[] args) throws Exception 
	{
		Student s = new Student();
		s.firstname = "Alexa";
		s.lastname = "Amazon";
		s.dept = "AI";
		s.rollno = 12;
		s.phone = 976854236;
		s.cgpa = 78.00;
		FileOutputStream fos = new FileOutputStream("stude.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(s);
		System.out.println("done");
		os.close();
	}

}
