public class Manager extends Karyawan {
    public int tunjangan;

    public Manager() {

    }

    public void tampilDataManager() {
        System.out.println("Tunjangan       ="+tunjangan);
        System.out.println("Total Gaji      ="+(super.gaji+tunjangan));
    }
}
