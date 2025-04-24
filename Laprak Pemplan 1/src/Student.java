public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlah_objek=0;

    public Student() {
        name = "";
        address = "";
        age = 0;
        jumlah_objek++;
    }

    public Student(double mathGrade, double englishGrade, double scienceGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        jumlah_objek++;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlah_objek++;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }
    public void jumlahObjek() {
        System.out.println("Jumlah objek : "+jumlah_objek);
    }

    public boolean statusAkhir(double average) {
        if (average >= 61) {
            return true;
        } else {
            return false;
        }
    }

    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beralamat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.println("Status akhir " + (statusAkhir(getAverage())==true?"Lolos":"Remedial"));
    }
}
