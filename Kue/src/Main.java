public class Main {
    public static void main(String[] args) {
        Kue[] ArrayKue = new Kue[20];

        ArrayKue[0] = new KuePesanan("Brownies", 50000, 1.5);
        ArrayKue[1] = new KueJadi("Donat", 3000, 10);
        ArrayKue[2] = new KuePesanan("Lapis", 45000, 2);
        ArrayKue[3] = new KueJadi("Kue Cubit", 2000, 15);
        ArrayKue[4] = new KuePesanan("Kastengel", 60000, 0.5);
        ArrayKue[5] = new KueJadi("Lemper", 2500, 12);
        ArrayKue[6] = new KuePesanan("Nastar", 70000, 1);
        ArrayKue[7] = new KueJadi("Bika Ambon", 10000, 4);
        ArrayKue[8] = new KuePesanan("Onde-onde", 20000, 1.2);
        ArrayKue[9] = new KueJadi("Risoles", 3500, 10);
        ArrayKue[10] = new KuePesanan("Kue Lumpur", 30000, 1.1);
        ArrayKue[11] = new KueJadi("Serabi", 2500, 8);
        ArrayKue[12] = new KuePesanan("Bolu", 45000, 1.8);
        ArrayKue[13] = new KueJadi("Pancong", 3000, 9);
        ArrayKue[14] = new KuePesanan("Pie Susu", 55000, 1.3);
        ArrayKue[15] = new KueJadi("Pastel", 4000, 6);
        ArrayKue[16] = new KuePesanan("Martabak", 85000, 0.8);
        ArrayKue[17] = new KueJadi("Sosis Solo", 5000, 7);
        ArrayKue[18] = new KuePesanan("Getuk", 15000, 2);
        ArrayKue[19] = new KueJadi("Kue Lumpur", 3000, 11);

        double totalBerat = 0;
        double totalHargaKJ = 0;
        double totalHargaKP = 0;
        double totalHargaAll = 0;
        double totalJumlah = 0;
        Kue kueTermahal = null;

        for(Kue kue : ArrayKue){
            if(kue instanceof KueJadi){
                totalHargaKJ += kue.hitungHarga();
                totalJumlah += ((KueJadi)kue).getJumlah();
                totalHargaAll += kue.hitungHarga();
            }else if(kue instanceof KuePesanan){
                totalHargaKP += kue.hitungHarga();
                totalBerat += ((KuePesanan)kue).getBerat();
                totalHargaAll += kue.hitungHarga();
            }
            if(kueTermahal == null || kue.hitungHarga() > kueTermahal.hitungHarga()){
                kueTermahal = kue;
            }
        }

        //a. Tampilkan semua kue dan harus ditampilkan jenis kuenya
        for(Kue kue : ArrayKue){
            System.out.println(kue.toString());
            System.out.println("Jenis: "+(kue instanceof KueJadi ? "Kue Jadi" : "Kue Pesanan")+"\n");  
        }

        //b. Hitung total harga yang didapat dari semua jenis kue
        System.out.println("Total harga semua kue: Rp" + totalHargaAll);
        System.out.println();

        //c. Hitung total harga dan total berat dari KuePesanan
        System.out.println("Total harga Kue Pesanan: Rp" + totalHargaKP);
        System.out.printf("Total berat Kue Pesanan: %.2f kg \n", totalBerat);
        System.out.println();

        //d. Hitung total harga dan total jumlah dari KueJadi
        System.out.println("Total harga Kue Jadi: Rp" + totalHargaKJ);
        System.out.println("Total jumlah Kue Jadi: " + (int)totalJumlah);
        System.out.println();

        //e. Tampilkan informasi kue dengan harga (harga akhir) terbesar
        System.out.println("Kue termahal: \n" + kueTermahal.toString());
        System.out.println("Jenis: "+(kueTermahal instanceof KueJadi ? "Kue Jadi" : "Kue Pesanan"));
    }
}
