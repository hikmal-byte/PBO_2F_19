abstract class Pembayaran {
    private String idTransaksi;
    private double jumlah;

    public Pembayaran(String idTransaksi, double jumlah) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
    }

    public double getJumlah() { return jumlah; }

    public abstract boolean prosesPembayaran();
}

class PembayaranEWallet extends Pembayaran {
    private String nomorEWallet;

    public PembayaranEWallet(String idTransaksi, double jumlah, String nomorEWallet) {
    super(idTransaksi, jumlah);
    this.nomorEWallet = nomorEWallet;
    }

    @Override
    public boolean prosesPembayaran() {
        System.out.println("Memproses pembayaran E-Wallet sejumlah Rp " + getJumlah() + " ke nomor " + nomorEWallet + "... Sukses!");
        return true;
    }
}
