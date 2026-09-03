public class SmartTV extends Elektronik{
    private double ukuranLayar;
    private  String sistemOperasi;

    public void setUkuranLayar(double ukuran) {
        this.ukuranLayar = ukuran;
    }

    public void setSistemOperasi(String os) {
        this.sistemOperasi = os;
    }

    public void konekInternet(String namaWifi) {
        System.out.println("Smart TV berhasil terhubung ke WiFi: " + namaWifi);
    }

    public void bukaStreaming(String namaAplikasi) {
        System.out.println("Membuka aplikasi streaming " + namaAplikasi + " di TV.");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Ukuran Layar    : " + ukuranLayar + " inch");
        System.out.println("Sistem Operasi  : " + sistemOperasi);
        System.out.println("Kategori     : Smart Television (Elektronik)");
    }
}
