public class Demo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.setNama("HP VICTUS Gaming 15");
        laptop1.setDayaListrik(200);
        laptop1.setUkuranLayar(15.6);
        laptop1.setKapasitasRam(16);

        Smartphone hp1 = new Smartphone();
        hp1.setNama("Xiaomi Redmi Note 14 Pro 8/256");
        hp1.setDayaListrik(45);
        hp1.setKapasitasBaterai(5010);
        hp1.setJumlahKamera(4);

        SmartTV tv1 = new SmartTV();
        tv1.setNama("Samsung AU7002 43 Inch");
        tv1.setDayaListrik(120);
        tv1.setUkuranLayar(43);
        tv1.setSistemOperasi("Tizen OS by Samsung");

        KipasAngin kipas1 = new KipasAngin();
        kipas1.setMerk("National");
        kipas1.setKecepatan(2);

        System.out.println("=== INFORMASI LAPTOP ===");
        laptop1.nyalakan();
        laptop1.bukaAplikasi("Unity Game Engine");
        laptop1.cetakInformasi();

        System.out.println("\n=== INFORMASI SMARTPHONE ===");
        hp1.nyalakan();
        hp1.panggil("08814384467");
        hp1.cetakInformasi();

        System.out.println("=== INFORMASI SMART TELEVISION ===");
        tv1.nyalakan();
        tv1.konekInternet("MNC_Vision/Indovision");
        tv1.bukaStreaming("Twitch");
        tv1.cetakInformasi();
        
        System.out.println("\n=== INFORMASI KIPAS ANGIN ===");
        kipas1.tengokKananKiri();
        kipas1.ubahKecepatan(3);
        kipas1.cetakInformasi();
    }
}
