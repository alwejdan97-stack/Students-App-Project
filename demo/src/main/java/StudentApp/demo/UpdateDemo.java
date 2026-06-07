package StudentApp.demo;

public class UpdateDemo {
    public static void main(String[] args){
        String currentStudentName="Wejdan";
        String newStudentName="Hoor";
        boolean status=false;

        System.out.println("the current name is: "+currentStudentName);
        if(!currentStudentName.equals(newStudentName)){
            currentStudentName=newStudentName;
            status=true;
            System.out.println("Student name UPDATED...");
        }else{
            status=false;
            System.out.println("Student name already existing...");
        }

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

        System.out.println("UPDATING SUCCESSFULLY...");
    }
}
