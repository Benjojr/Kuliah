public class Student extends Person{
    private String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    void displayInfo() {
        System.out.println("Student Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Student ID: " + studentID);
    }

    

    class Grade {
        private String courseName;
        private double score;
    
        public Grade(String courseName, double score) {
            this.courseName = courseName;
            this.score = score;
        }
    
        void displayGrade(){
            System.out.println("Course: "+courseName+", Score: "+score);
        }
    }
}
