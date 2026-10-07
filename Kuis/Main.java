public class Main {
    public static void main(String[] args) {
        Instruktur driven = new Instruktur("INS-01", "Dr.Aris", "aris@edutech.id", "Object-Oriented Programming");
        Peserta siswa = new Peserta("PST-101", "Budi Santoso", "budi@mail.com", "Reguler");

        Kursus pboKursus = new Kursus("KRS-01", "Pemrograman Berbasis Objek Lanjutan", 150000, driven);

        pboKursus.tambahKonten(new VideoKonten("KNT-01", "Pengenalan Class & Object", 15));
        pboKursus.tambahKonten(new ArtikelKonten("KNT-02", "Panduan Design Pattern", 5));
        pboKursus.tambahKonten(new KuisKonten("KNT-03", "Evaluasi Konsep Polymorphism", 10));

        System.out.println("--- PROSES PENDAFTARAN KURSUS ---");
        siswa.tampilkanProfil();
        Pembayaran bayar = new PembayaranEWallet("TRX-9901", pboKursus.getHarga(), "08110988547");

        if (bayar.prosesPembayaran()) {
            System.out.println("\n--- TAMPILAN MATERI KURSUS SELESAI DIBAYAR ---");
            pboKursus.tampilkanDetailKursus();
        }
    }
}
