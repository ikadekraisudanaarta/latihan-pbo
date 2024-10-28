public class main {
    public class SistemRentalMobil {
        public static void main(String[] args) {
            // Membuat beberapa objek Mobil
            mobil mobil1 = new mobil("B1234XYZ", "Toyota Avanza", 2020, 300000.0);
            mobil mobil2 = new mobil("D5678ABC", "Honda Brio", 2019, 250000.0);
    
            // Membuat objek Pelanggan
            Pelanggan pelanggan1 = new Pelanggan("P001", "Budi", "123456789", "08123456789");
            Pelanggan pelanggan2 = new Pelanggan("P002", "Siti", "987654321", "08234567890");
    
            // Membuat objek Rental untuk transaksi penyewaan
            rental rental1 = new rental(mobil1, pelanggan1, 3);
            rental rental2 = new rental(mobil2, pelanggan2, 5);
    
            // Menampilkan informasi rental
            System.out.println("Info Rental 1:");
            System.out.println(rental1.getInforental());
    
            System.out.println("\nInfo Rental 2:");
            System.out.println(rental2.getInforental());
    
            // Mengembalikan mobil setelah selesai disewa
            mobil1.kembalikan();
            mobil2.kembalikan();
        }
    }
}
    
