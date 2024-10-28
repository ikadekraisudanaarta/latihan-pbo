class Rental{
    private mobil mobil;
    private Pelanggan pelanggan;
    private int lamaSewa; // Lama sewa dalam hari

    public Rental(mobil mobil, Pelanggan pelanggan, int lamaSewa) {
        if (mobil.isTersedia()) {
            this.mobil = mobil;
            this.pelanggan = pelanggan;
            this.lamaSewa = lamaSewa;
            mobil.Sewa(); // Set mobil menjadi tidak tersedia setelah disewa
        } else {
            System.out.println("Mobil tidak tersedia untuk disewa.");
        }
    }

    public double hitungBiaya() {
        return lamaSewa * mobil.getHargaSewaPerHari();
    }

    public String getInfoRental() {
        return pelanggan.getInfoPelanggan() + "\n\n" +
               mobil.getInfoMobil() + "\n\n" +
               "Lama Sewa: " + lamaSewa + " hari\n" +
               "Total Biaya Sewa: " + hitungBiaya();
    }
}