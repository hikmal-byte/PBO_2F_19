public class Laptop extends Elektronik {
    private double ukuranLayar;
    private int kapasitasRam;

    public void setUkuranLayar(double ukuran) {
        this.ukuranLayar = ukuran;
    }

    public void setKapasitasRam(int ram) {
        this.kapasitasRam = ram;
    }

    public void bukaAplikasi(String namaAplikasi) {
        System.out.println("Membuka aplikasi " + namaAplikasi + " di laptop.");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Ukuran Layar    : " + ukuranLayar + " inci");
        System.out.println("Kapasitas RAM   : " + kapasitasRam + " GB");
        System.out.println("Kategori        : Laptop (ELektronik)");
    }
}
