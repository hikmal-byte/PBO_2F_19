import java.util.HashMap;
import java.util.Map;

public abstract class Makanan {
    protected String nama;
    protected double harga;
    protected int waktuMemasak;
    protected Map<String, Integer> resepBahan;

    public Makanan(String nama, double harga, int waktuMemasak) {
        this.nama = nama;
        this.harga = harga;
        this.waktuMemasak = waktuMemasak;
        this.resepBahan = new HashMap<>();
    }

    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getWaktuMemasak() { return waktuMemasak; }
    public Map<String, Integer> getResepBahan() { return resepBahan; }

    public abstract void tampilkanDetailInfo();

    public void persiapkan() {
        System.out.println("Mempersiapkan bahan porsi standar untuk " + nama);
    }

    public void persiapkan(String instruksiKhusus) {
        System.out.println("Mempersiapkan " + nama + " dengan catatan: " + instruksiKhusus);
    }
}
