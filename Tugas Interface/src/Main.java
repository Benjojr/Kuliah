public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen(123456, "Pak Tri", "RPL");
        Mahasiswa mahasiswa = new Mahasiswa(123456, "Keenan");
        Asisten_dosen asisten_dosen = new Asisten_dosen("Mas Hamdan", "RPL");

        //Dosen
        System.out.println("Dosen");
        dosen.teaching();
        dosen.correcting();
        
        //Mahasiswa
        System.out.println("Mahasiswa");
        mahasiswa.study();
        mahasiswa.submit();
        
        //Asisten Dosen
        System.out.println("Asisten");
        asisten_dosen.study();
        asisten_dosen.submit();
        asisten_dosen.teaching();
        asisten_dosen.correcting();
        
    }
}
