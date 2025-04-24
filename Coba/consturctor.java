abstract class consturctor{
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("7728992");
        mahasiswa mhs2 = new mahasiswa("012345", "Anjay");
        mahasiswa mhs3 = new mahasiswa("012345");

        System.out.println(mhs2.nama);//print 1
        new mahasiswa();//print 2
        System.out.println(mhs1.puqi());//print 3

        mhs1.set("keren sekali");
        System.out.println(mhs1.nama);//print 4
    }
}