public class Minuman extends Makanan {
    private boolean pakaiEs;

    public Minuman(String nama, double harga, int waktuMemasak, boolean pakaiEs) {
        super(nama, harga, waktuMemasak);
        this.pakaiEs = pakaiEs;
        resepBahan.put("Sirup/Sirup Kola", 1);
        resepBahan.put("Es Batu", 1);
    }

    @Override 
    public void tampilkanDetailInfo() {
        System.out.printf("- [Minuman] %s (Pakai Es: %s) | Harga: Rp%.2f | Waktu Masak: %ds\n", 
                nama, (pakaiEs ? "Ya" : "Tidak"), harga, waktuMemasak);
    }
}
