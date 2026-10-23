import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private String nama;
    private List<Makanan> daftarPesanan;
    private int tingkatKesabaran;
    public Pelanggan(String nama, int tingkatKesabaran) {
        this.nama = nama;
        this.tingkatKesabaran = tingkatKesabaran;
        this.daftarPesanan = new ArrayList<>();
    }

    public String getNama() { return nama; }
    public List<Makanan> getDaftarPesanan() { return daftarPesanan; }
    public int getTingkatKesabaran() { return tingkatKesabaran; }
    public void tambahPesanan(Makanan makanan) {
        daftarPesanan.add(makanan);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Makanan m : daftarPesanan) {
            total += m.getHarga();
        }
        return total;
    }

    public double hitungKepuasan(int totalWaktuTunggu) {
        if (totalWaktuTunggu <= tingkatKesabaran) {
            double kepuasan = 100.0 - (((double) totalWaktuTunggu / tingkatKesabaran) * 15.0);
            return Math.max(85.0, kepuasan);
        } else {
            double keterlambatan = totalWaktuTunggu - tingkatKesabaran;
            double kepuasan = 75.0 - (keterlambatan * 5.0);
            return Math.max(0.0, kepuasan);
        }
    }
}