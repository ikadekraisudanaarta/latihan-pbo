public class mobil {
    protected String platNomor;
    protected String merek;
    protected int tahun;
    protected double hargaSewaPerHari;
    protected boolean Status;       //true jika tersedia false jika masih disewa
    
 public mobil (String platNomor, String merek, int tahun, double hargaSewaPerHari) {
    this.platNomor = platNomor;
    this.merek = merek;
    this.tahun = tahun;
    this.hargaSewaPerHari = hargaSewaPerHari;
    this.Status = true; // mobil tersedia  

 } 

 public void Sewa(){
    Status = false;
 }
 public void kembalikan(){
    Status = true;  
 } 
 public boolean isTersedia() {
    return Status; 
 }
 public double getHargaSewaPerHari() {
    return hargaSewaPerHari;
}

public String getInfoMobil() {
    return "Plat Nomor: " + platNomor + "\n" +
           "Merk: " + merek + "\n" +
           "Tahun: " + tahun + "\n" +
           "Harga Sewa Per Hari: " + hargaSewaPerHari + "\n" +
           "Status: " + (Status ? "Tersedia" : "Sedang Disewa");
}
}