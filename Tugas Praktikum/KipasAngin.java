public class KipasAngin extends Elektronik{
    private String merk;
    private int kecepatan;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void ubahKecepatan(int kecepatanBaru) {
        this.kecepatan = kecepatanBaru;
        System.out.println("Kecepatan diputar ke tingkat " + kecepatanBaru);
    }

    public void tengokKananKiri() {
        System.out.println("Kipas angin berputar ke kanan dan kiri.");
    }

    public void cetakInformasi() {
        System.out.println("Merk Kipas         : " + merk);
        System.out.println("Kecepatan Saat Ini :  " + kecepatan);
        System.out.println("Kategori            : Kipas Angin");
    }
}
