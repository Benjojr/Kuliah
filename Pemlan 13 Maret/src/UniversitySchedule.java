public class UniversitySchedule {
    private String universityName = "Universitas USU";
    private static int totalCourses = 0;

    // Non-static inner class :Mengelola jadwal perkuliahan spesifik untuk mahasiswa
    // tertentu
    class StudentSchedule {
        private String studentID;

        StudentSchedule(String studentID) {
            this.studentID = studentID;
        }

        void displaySchedule() {
            // Mengakses field kelas luar (university)
            System.out.println("Jadwal perkuliahan untuk mahasiswa " + studentID + " di " + universityName);
            System.out.println("Mata Kuliah: Pemrograman Berorientasi Objek, Hari: Senin, Jam: 08:00-10:00");
        }
    }

    // Static nested class : Mengelola informasi mata kuliah secara umum (tidak bergantung pada instance)
    static class CourseInfo {
        private String courseCode;

        CourseInfo(String courseCode) {
            this.courseCode = courseCode;
            totalCourses++; // Mengakses field statis dari kelas lar
        }

        void displayCourseDetails() {
            System.out.println("Kode Mata Kuliah: " + courseCode);
            System.out.println("Total Mata Kuliah yang terdaftar: " + totalCourses);
        }
    }

    // Local Inner Class: Digunakan dalam metode untuk menghitung jadwal sementara
    public void calculateTemporarySchedule(String day) {
        final String tempday = day;

        class TempScheduleCalculator {
            void calculate() {
                System.out.println("Menghitung jadwal sementara di " + universityName + " untuk hari: " + tempday);
                System.out.println("Hasil: 3 slot perkuliahan tersedia.");
            }
        }
        TempScheduleCalculator calculator = new TempScheduleCalculator();
        calculator.calculate();
    }

    // Anonymous Inner Class: Digunakan untuk menangani notifikasi jadwal
    interface Notification {
        void notifySchedule();
    }

    public void notifyStudentSchedule() {
        Notification notification = new Notification() {
            @Override
            public void notifySchedule() {
                System.out.println("Notifikasi dari " + universityName + ": Jadwal Anda telah diperbarui!");
            }
        };
        notification.notifySchedule();
    }
}
class Utama {
    public static void main(String[] args) {
        UniversitySchedule scheduleSystem = new UniversitySchedule();
        //1. Menggunakan non-satic inner class
        System.out.println("=== Non-Static Inner Class ===");
        UniversitySchedule.StudentSchedule studentSchedule = scheduleSystem.new StudentSchedule("12345");
        studentSchedule.displaySchedule();

        //2. Menggunakan Static Nested Class
        System.out.println("\n=== Static Nested Class ===");
        UniversitySchedule.CourseInfo course1 = new UniversitySchedule.CourseInfo("CS101");
        UniversitySchedule.CourseInfo course2 = new UniversitySchedule.CourseInfo("CS102");
        course1.displayCourseDetails();

        //3. Menggunakan Local Inner Class
        System.out.println("\n=== Local Inner Class ===");
        scheduleSystem.calculateTemporarySchedule("Selasa");

        //4. Menggunakan Anonymous Inner Class
        System.out.println("\n=== Anonymous Inner Class ===");
        scheduleSystem.notifyStudentSchedule();
    }
}