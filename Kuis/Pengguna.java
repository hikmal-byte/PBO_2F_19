abstract class Pengguna {
    private String id;
    private String nama;
    private String email;

    public Pengguna(String id, String nama, String email) {
        this.id = id;
        this.nama = nama;
        this.email = email;
    }

    public String getId() { return id; }
    public String getnama() { return nama; }
    public String getEmail() { return email; }

    public abstract void tampilkanProfil();
}

class Instruktur extends Pengguna {
    private String spesialisasi;

    public Instruktur(String id, String nama, String email, String spesialisasi) {
        super(id, nama, email);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() { return spesialisasi; }

    @Override
    public void tampilkanProfil() {
        System.out.println("[Instruktur] " + getnama() + " | Spesialisasi: " + spesialisasi);
    }
}

class Peserta extends Pengguna {
    private String statusKeanggotaan;

    public Peserta(String id, String nama, String email, String statusKeanggotaan) {
        super(id, nama, email);
        this.statusKeanggotaan = statusKeanggotaan;
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("[Peserta] " + getnama() + " | Tipe: " + statusKeanggotaan);
    }
}