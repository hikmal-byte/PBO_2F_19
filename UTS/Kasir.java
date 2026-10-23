public class Kasir extends Karyawan implements IPembayaran {
    public Kasir(String nama, String idKaryawan, int skillLevel) {
        super(nama, idKaryawan, skillLevel);
    }

    @Override
    public void bekerja() {
        System.out.println("[Kasir " + nama + "] Siap melayani pemesanan dan transaksi pelanggan.");
    }

    @Override
    public boolean prosesPembayaran(double totalBayar) {
        System.out.printf("[Kasir %s] Menerima pembayaran sebesar Rp%.2f\n", nama, totalBayar);
        return true;
    }

    @Override
    public boolean prosesPembayaran(double totalBayar, double diskon) {
        double totalSetelahDiskon = totalBayar - (totalBayar * diskon);
        System.out.printf("[Kasir %s] Menerima pembayaran (Diskon %.0f%%). Total Akhir: Rp%.2f\n", 
                nama, (diskon * 100), totalSetelahDiskon);
        return true;
    }
}