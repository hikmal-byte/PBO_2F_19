import java.util.ArrayList;
import java.util.List;

public class Kursus {
    private String idKursus;
    private String namaKursus;
    private double harga;
    private Instruktur instruktur;
    private List<Konten> daftarKonten;

    public Kursus(String idKursus, String namaKursus, double harga, Instruktur instruktur) {
        this.idKursus = idKursus;
        this.namaKursus = namaKursus;
        setHarga(harga);
        this.instruktur = instruktur;
        this.daftarKonten = new ArrayList<>();
    }

    public String getNamaKursus() { return namaKursus; }
    public double getHarga() { return harga; }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }

    public void tambahKonten(Konten konten) {
        daftarKonten.add(konten);
    }

    public void tampilkanDetailKursus() {
        System.out.println("==========================================");
        System.out.println("KURSUS: " + namaKursus + " (Rp " + harga + ")");
        System.out.print("Pengajar: ");
        instruktur.tampilkanProfil();
        System.out.println("MAteri Pembelajaran:");
        for (Konten k : daftarKonten) {
            k.tampilkanKonten();
        }
        System.out.println("==========================================");
    }
}
