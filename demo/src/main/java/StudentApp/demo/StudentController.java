package StudentApp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
    Student student=new Student("S-01","Wejdan","A+");

    @PutMapping("updateStudent")
    public Student updateStudent(@RequestParam String studentId){
        System.out.println("The current student id is: "+student.getStudentId());
        if(!student.getStudentId().equals(studentId)){
            student.setStudentId(studentId);
            System.out.println("Student ID Updated SUCCESSFULLY...");
        }else{
            System.out.println("Student ID Is Matching Old ID, Updated FAILD...");
        }
        return student;
    }
}
