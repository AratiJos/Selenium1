import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadDemo {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("stude.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		Student s = null;
		if(o instanceof Student)
		{
			s = (Student) o;
		}
		System.out.println(s.firstname + " " + s.lastname + " " + s.dept + " " + s.rollno + " " + s.phone + " " + s.cgpa);
		ois.close();
	}

}
