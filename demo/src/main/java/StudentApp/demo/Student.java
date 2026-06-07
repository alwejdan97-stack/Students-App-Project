package StudentApp.demo;

public class Student {
    private String studentId;
    private String studentName;
    private String grade;

    public Student(String studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
