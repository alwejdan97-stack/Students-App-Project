package StudentApp.demo;

public class UpdateDemo {
    private String currentStudentName;
    private String newStudentName;
    private boolean status;

    public UpdateDemo(String currentStudentName, String newStudentName, boolean status) {
        this.currentStudentName = currentStudentName;
        this.newStudentName = newStudentName;
        this.status = status;
    }

    public String getCurrentStudentName() {
        return currentStudentName;
    }

    public void setCurrentStudentName(String currentStudentName) {
        this.currentStudentName = currentStudentName;
    }

    public String getNewStudentName() {
        return newStudentName;
    }

    public void setNewStudentName(String newStudentName) {
        this.newStudentName = newStudentName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
