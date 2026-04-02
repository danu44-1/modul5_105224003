public class main {
    public static void main(String[] args) throws Exception {
        Barang barang = new Barang("10522", "Ulekan");

        // barang.stok = 50; Ini error karena atribut stok merupakan atribut yang privat dan diharuskan menggunakan setStok()/setter dari stok untuk mengakses atribut secara publik

        barang.setHargaSatuan(-1000);
        barang.kurangiStok(100);

        barang.setKategori("Kebutuhan Dapur");
        barang.setStok(50);
        barang.setHargaSatuan(10000);

        barang.tampilkanDetailBarang();
    }
}
