public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0.0;
    }

    public void tambahMuatan(double berat) {
        if (this.beratMuatanSaatIni + berat > this.kapasitasMaksimal) {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        } else {
            this.beratMuatanSaatIni += berat;
        }
    }

public void turunkanMuatan(double berat) {
        if (berat > (this.beratMuatanSaatIni * 0.5)) {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        } else if (this.beratMuatanSaatIni - berat < 0) {
            System.out.println("Maaf, jumlah barang yang diturunkan melebihi muatan saat ini.");
        } else {
            this.beratMuatanSaatIni -= berat;
        }
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }
}
