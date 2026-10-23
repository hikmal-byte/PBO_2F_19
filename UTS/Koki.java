public class Koki extends Karyawan {
    public Koki(String nama, String idKaryawan, int skillLevel) {
        super(nama, idKaryawan, skillLevel);
    }

    @Override
    public void bekerja() {
        System.out.println("[Koki " + nama + "] Sedang menyiapkan dan memasak pesanan di dapur.");
    }

    public void masakMakanan(Makanan makanan) {
        System.out.println("[Koki " + nama + "] Memasak " + makanan.getNama() + " (Estimasi waktu: " + makanan.getWaktuMemasak() + " detik).");
    }
}