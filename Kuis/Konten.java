abstract class Konten {
    private String idKonten;
    private String judul;

    public Konten(String idKonten, String judul) {
        this.idKonten = idKonten;
        this.judul = judul;
    }

    public String getJudul() { return judul; }

    public abstract void tampilkanKonten();
}

class VideoKonten extends Konten {
    private int durasiMenit;

    public VideoKonten(String idKonten, String judul, int durasiMenit) {
        super(idKonten, judul);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public void tampilkanKonten() {
        System.out.println("  -> [Video] Memutar Video: " + getJudul() + " (" + durasiMenit + " menit)");
    }
}

class ArtikelKonten extends Konten {
    private int jumlahHalaman;
    public ArtikelKonten(String idKonten, String judul, int jumlahHalaman) {
        super(idKonten, judul);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanKonten() {
        System.out.println("  -> [Artikel] Membaca Artikel: " + getJudul() + " (" + jumlahHalaman + " halaman)");
    }
}

class KuisKonten extends Konten {
    private int jumlahSoal;

    public KuisKonten(String idKonten, String judul, int jumlahSoal) {
        super(idKonten, judul);
        this.jumlahSoal = jumlahSoal;
    }

    @Override
    public void tampilkanKonten() {
        System.out.println("  -> [Kuis] Mengerjakan Kuis: " + getJudul() + " (" + jumlahSoal + " soal)");
    }
}