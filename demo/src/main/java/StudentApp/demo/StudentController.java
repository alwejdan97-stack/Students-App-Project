package StudentApp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
    Student student=new Student("S-01","Wejdan","A+");

    @PutMapping("updateStudent")
    public String updateStudent(@RequestParam String studentName){
        String previousName=student.getStudentName();
        System.out.println("The current student id is: "+previousName);
        if(!previousName.equals(studentName)){
            student.setStudentName(studentName);
            System.out.println("Student Name Updated SUCCESSFULLY...");
            return "Previous Name is: "+ previousName+ ", After Updating is: "+student.getStudentName();
        }else{
            return "Student Name Is Matching Old Name, Updating FAILED...";

        }
    }
}
