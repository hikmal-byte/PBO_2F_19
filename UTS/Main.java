import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Restoran resto = new Restoran("McFast Food Polinema", 5000000);
        resto.tambahStok("Roti Burger", 10);
        resto.tambahStok("Daging Patty", 10);
        resto.tambahStok("Keju Not The Laughing Cow", 10);
        resto.tambahStok("Kentang", 10);
        resto.tambahStok("Minyak", 10);
        resto.tambahStok("Sirup/Sirup Kola", 10);
        resto.tambahStok("Es Batu", 10);

        Burger burgerCheese = new Burger("Cheese Burger", 25000, 15, "Sapi");
        KentangGoreng frenchFries = new KentangGoreng("French Fries", 15000, 10, "Large");
        Minuman cola = new Minuman("Coca-Cola", 10000, 5, true);

        resto.tambahMenu(burgerCheese);
        resto.tambahMenu(frenchFries);
        resto.tambahMenu(cola);

        Koki kokiBudi = new Koki("Budi", "KOKI-01", 4);
        Kasir kasirSiti = new Kasir("Siti", "KASIR-01", 5);
        resto.tambahKaryawan(kokiBudi);
        resto.tambahKaryawan(kasirSiti);
        resto.tampilkanStatus();

        System.out.println("\n>>> MEMULAI SIMULASI KEDATANGAN PELANGGAN <<<\n");
        String[] namaPelangganList = {"Andi", "Bambang", "Citra"};

        for (int i = 0; i < namaPelangganList.length; i++) {
            int waktuKedatangan = rand.nextInt(5) + 1;
            System.out.println("-------------------------------------------------");
            System.out.println("[Simulasi] Pelanggan ke-" + (i + 1) + " datang setelah jeda " + waktuKedatangan + " detik.");

            int tingkatKesabaran = rand.nextInt(21) + 20; 
            Pelanggan p = new Pelanggan(namaPelangganList[i], tingkatKesabaran);
            System.out.println("Pelanggan " + p.getNama() + " masuk (Tingkat Kesabaran: " + p.getTingkatKesabaran() + "s).");

            int jumlahPesanan = rand.nextInt(2) + 1;
            for (int j = 0; j < jumlahPesanan; j++) {
                Makanan mPilihan = resto.getDaftarMenu().get(rand.nextInt(resto.getDaftarMenu().size()));
                p.tambahPesanan(mPilihan);
            }

            kasirSiti.bekerja();
            double totalHarga = p.hitungTotalHarga();
            System.out.println("Pesanan " + p.getNama() + ":");
            for (Makanan m : p.getDaftarPesanan()) {
                m.tampilkanDetailInfo();
            }

            int totalWaktuMasak = 0;
            boolean pesananBerhasil = true;

            for (Makanan m : p.getDaftarPesanan()) {
                if (resto.cekDanKurangiStok(m)) {
                    kokiBudi.masakMakanan(m);
                    totalWaktuMasak += m.getWaktuMemasak();
                } else {
                    pesananBerhasil = false;
                    System.out.println("   --> Pesanan " + m.getNama() + " dibatalkan karena stok kurang.");
                }
            }

            if (pesananBerhasil) {
                if (totalHarga > 30000) {
                    kasirSiti.prosesPembayaran(totalHarga, 0.10);
                    resto.terimaPendapatan(totalHarga * 0.90);
                } else {
                    kasirSiti.prosesPembayaran(totalHarga);
                    resto.terimaPendapatan(totalHarga);
                }

                double kepuasan = p.hitungKepuasan(totalWaktuMasak);
                resto.updateReputasi(kepuasan);
                System.out.printf("   [Tingkat Kepuasan %s]: %.1f%%\n", p.getNama(), kepuasan);
            } else {
                System.out.println("   [Kepuasan " + p.getNama() + "]: 0% (Kecewa karena pesanan gagal).");
                resto.updateReputasi(20.0);
            }
        }

        resto.tampilkanStatus();
    }
}