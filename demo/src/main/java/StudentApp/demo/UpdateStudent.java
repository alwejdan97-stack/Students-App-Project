package StudentApp.demo;

public class UpdateStudent {
    public static void main(String[] args){
        Student student=new Student("S-01","Wejdan","A+");

        System.out.println("*** Student Original Information ***");
        System.out.println("Student ID: "+student.getStudentId());
        System.out.println("Student Name: "+student.getStudentName());
        System.out.println("Student Grade: "+student.getGrade());

        student.setStudentName("Ali");
        System.out.println("*** Student Updated Information ***");
        System.out.println("Student ID: "+student.getStudentId());
        System.out.println("Student Name: "+student.getStudentName());
        System.out.println("Student Grade: "+student.getGrade());
    }
}
