package StudentApp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		String currentStudentName="Wejdan";
		String newStudentName="Hoor";
		boolean status=false;

		System.out.println("the current name is: "+currentStudentName);
		if(!currentStudentName.equalsIgnoreCase(newStudentName)){
			currentStudentName=newStudentName;
			status=true;
			System.out.println("Student name UPDATED...");
		}else{
			System.out.println("Student name already existing...");
		}
	}
}
