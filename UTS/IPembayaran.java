public interface IPembayaran {
    boolean prosesPembayaran(double totalBayar);
    boolean prosesPembayaran(double totalBayar, double diskon);
}
