   class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noKTP;
    private String noHP;

    public Pelanggan(String idPelanggan, String nama, String noKTP, String noHP) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noKTP = noKTP;
        this.noHP = noHP;
    }

    public String getInfoPelanggan() {
        return "ID Pelanggan: " + idPelanggan + "\n" +
               "Nama: " + nama + "\n" +
               "No KTP: " + noKTP + "\n" +
               "No HP: " + noHP;
    }
}