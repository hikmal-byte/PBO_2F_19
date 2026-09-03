public class Elektronik {
    private String nama;
    private int dayaListrik;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDayaListrik(int daya) {
        this.dayaListrik = daya;
    }

    public void nyalakan() {
        System.out.println(nama + " sedang dinyalakan.");
    }

    public void matikan() {
        System.out.println(nama + " telah dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("Nama Perangkat  : " + nama);
        System.out.println("Daya Listrik    : " + dayaListrik + " Watt");
    }
}
