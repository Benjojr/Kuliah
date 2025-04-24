public class Mathematics implements Course {
    private String courseName;

    public Mathematics(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void enroll(Student student) {
        System.out.println(student.getName() + " Mengambil MK "+courseName);   
    }
    @Override
    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
    }
}
