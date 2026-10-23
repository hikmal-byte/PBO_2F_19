public class Burger extends Makanan{
    private String jenisDaging;
    public Burger(String nama, double harga, int waktuMemasak, String jenisDaging) {
        super(nama, harga, waktuMemasak);
        this.jenisDaging = jenisDaging;
        resepBahan.put("Roti Burger", 1);
        resepBahan.put("Daging Patty", 1);
        resepBahan.put("Keju Not The Laughing Cow", 1);
    }
    @Override 
    public void tampilkanDetailInfo() {
        System.out.printf("- [Burger] %s (%s) | harga: Rp%.2f | Waktu Masak: %s\n", nama, jenisDaging, harga, waktuMemasak);
    }
}
