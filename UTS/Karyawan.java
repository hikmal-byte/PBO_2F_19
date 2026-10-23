public abstract class Karyawan {
    protected String nama;
    protected String idKaryawan;
    protected int skillLevel;

    public Karyawan(String nama, String idKaryawan, int skillLevel) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.skillLevel = skillLevel;
    }

    public String getnama() { return nama; }

    public abstract void bekerja();
}
