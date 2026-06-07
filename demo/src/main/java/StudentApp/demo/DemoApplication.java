package StudentApp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		/*String currentStudentName="Wejdan";
		String newStudentName="Hoor";
		boolean status=false;

		System.out.println("the current name is: "+currentStudentName);
		if(!currentStudentName.equalsIgnoreCase(newStudentName)){
			currentStudentName=newStudentName;
			status=true;
			System.out.println("Student name UPDATED...");
		}else{
			System.out.println("Student name already existing...");
		}*/

		Student student=new Student("S-01","Wejdan","A+");

		System.out.println(" *** Original Student Details ***");
		System.out.println("Student ID: "+student.getStudentId());
		System.out.println("Student Name: "+student.getStudentName());
		System.out.println("Student Grade: "+student.getGrade());

		System.out.println(" *** Updated Student Details ***");
		student.setStudentId("S1-01");
		System.out.println("Student ID: "+student.getStudentId());
		System.out.println("Student Name: "+student.getStudentName());
		System.out.println("Student Grade: "+student.getGrade());
	}
}
