public class Smartphone extends Elektronik {
    private int KapasitasBaterai;
    private int jumlahKamera;

    public void setKapasitasBaterai(int baterai) {
        this.KapasitasBaterai = baterai;
    }

    public void setJumlahKamera(int kamera) {
        this.jumlahKamera = kamera;
    }

    public void panggil(String nomorTujuan) {
        System.out.println("Menghubungi nomor " + nomorTujuan + "...");
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Baterai         : " + KapasitasBaterai + " mAh");
        System.out.println("Jumlah Kamera   : " + jumlahKamera);
        System.out.println("Kategori            : Handphone (Elektronik)");
    }
}
