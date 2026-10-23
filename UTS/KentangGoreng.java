public class KentangGoreng extends Makanan {
    private String ukuran;

    public KentangGoreng(String nama, double harga, int waktuMemasak, String ukuran) {
        super(nama, harga, waktuMemasak);
        this.ukuran = ukuran;
        resepBahan.put("Kentang", 2);
        resepBahan.put("Minyak", 1);
    }

    @Override 
    public void tampilkanDetailInfo() {
        System.out.printf("- [Kentang] %s (Ukuran: %s) | Harga: Rp%.2f | Waktu Masak: %ds\n", 
                nama, ukuran, harga, waktuMemasak);
    }
}
