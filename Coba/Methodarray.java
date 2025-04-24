public class Methodarray {
    public static void main(String[] args) {
        String array = "Cara membuat nasi goreng ";
        System.out.println("Sebelum modifikasi: ");
            System.out.println(array);
        
        // Memanggil method modifikasiArray untuk mengubah array
        modifikasiArray(array);
        System.out.println("Setelah modifikasi: ");
            System.out.println(array);
    }

    public static void modifikasiArray(String array) {
            array = array+"tanpa ribet";
    }
}