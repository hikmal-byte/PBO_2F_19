import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restoran {
    private String namaRestoran;
    private double keuangan;
    private double reputasi;
    private Map<String, Integer> inventori;
    private List<Karyawan> daftarKaryawan;
    private List<Makanan> daftarMenu;

    public Restoran(String namaRestoran, double modalAwal) {
        this.namaRestoran = namaRestoran;
        this.keuangan = modalAwal;
        this.reputasi = 80.0;
        this.inventori = new HashMap<>();
        this.daftarKaryawan = new ArrayList<>();
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahStok(String bahan, int jumlah) {
        inventori.put(bahan, inventori.getOrDefault(bahan, 0) + jumlah);
    }

    public boolean cekDanKurangiStok(Makanan makanan) {
        for (Map.Entry<String, Integer> entry : makanan.getResepBahan().entrySet()) {
            String bahan = entry.getKey();
            int butuh = entry.getValue();
            if (inventori.getOrDefault(bahan, 0) < butuh) {
                System.out.println("   [Stok Habis!] Bahan '" + bahan + "' tidak cukup untuk membuat " + makanan.getNama());
                return false;
            }
        }

        for (Map.Entry<String, Integer> entry : makanan.getResepBahan().entrySet()) {
            String bahan = entry.getKey();
            int butuh = entry.getValue();
            inventori.put(bahan, inventori.get(bahan) - butuh);
        }
        return true;
    }

    public void tambahKaryawan(Karyawan k) { daftarKaryawan.add(k); }
    public void tambahMenu(Makanan m) { daftarMenu.add(m); }
    public List<Makanan> getDaftarMenu() { return daftarMenu; }
    public void terimaPendapatan(double jumlah) { this.keuangan += jumlah; }

    public void updateReputasi(double kepuasanPelanggan) {
        this.reputasi = (this.reputasi * 0.7) + (kepuasanPelanggan * 0.3);
    }

    public void tampilkanStatus() {
        System.out.println("\n================ STATUS RESTORAN ================");
        System.out.println("Restoran   : " + namaRestoran);
        System.out.printf("Keuangan   : Rp%.2f\n", keuangan);
        System.out.printf("Reputasi   : %.1f / 100\n", reputasi);
        System.out.println("Inventori  : " + inventori);
        System.out.println("=================================================");
    }
}