public class AcademicSystem {
    public static void main(String[] args) {
        // Student
        String ageInput = "20";
        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            System.out.println("Masukkan angka bukan alfabet");
            return;
        }

        Student student1 = new Student("Susi", age, "S12345");
        student1.displayInfo();

        // Course
        Course mathematics = new Mathematics("Mathematics 101");
        mathematics.enroll(student1);
        mathematics.displayInfo();

        // Grade
        String scoreInput = "Keren";
        double score;
        try {
            score = Double.parseDouble(scoreInput);
        } catch (NumberFormatException e) {
            System.out.println("Nilai harus berupa angka");
            return;
        }
        Student.Grade grade1 = student1.new Grade("Mathematics 101", score);
        grade1.displayGrade();
    }
}