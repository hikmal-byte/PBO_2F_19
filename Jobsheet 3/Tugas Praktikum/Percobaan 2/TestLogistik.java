import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner hikmal14 = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double beratTambah = hikmal14.nextDouble();
        kontainerAlfa.tambahMuatan(beratTambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan berat muatan yang ingin diturunkan (kg): ");
        double beratTurun = hikmal14.nextDouble();
        kontainerAlfa.turunkanMuatan(beratTurun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        hikmal14.close();
    }
}