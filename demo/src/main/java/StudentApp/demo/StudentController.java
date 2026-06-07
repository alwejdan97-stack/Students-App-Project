package StudentApp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
    private Student student=new Student("S-01","Wejdan","A+");

    @PutMapping("updateStudent")
    public String updateStudent(@RequestParam String studentId){
        System.out.println("The current student id is: "+student.getStudentId());
        if(!student.getStudentId().equals(studentId)){
            student.setStudentId(studentId);
            System.out.println("Student ID Updated SUCCESSFULLY...");
            return "Student ID After Updating is: "+student.getStudentId();
        }else{
            return "Student ID Is Matching Old ID, Updating FAILD...";

        }
    }
}
