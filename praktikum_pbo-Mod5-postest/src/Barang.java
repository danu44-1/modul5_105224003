public class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private int hargaSatuan;
    private String kategori;

    Barang(String idBar, String namaBar){
        this.idBarang = idBar;
        this.namaBarang = namaBar;
        this.stok = 0;
        this.hargaSatuan = 0;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }



    public void setIdBarang(String idBar) {
        this.idBarang = idBar;
    }

    public void setNamaBarang(String namaBar) {
        this.namaBarang = namaBar;
    }

    public void setStok(int stok) {
        if (stok < 0){
            System.out.println("Stok tidak boleh negatif!");
        }
        else {
            this.stok = stok;
            System.out.println("Stok berhasil diset!");
        }
    }

    public void setHargaSatuan(int hargaSatuan) {
        if (hargaSatuan <= 0){
            System.out.println("Harga tidak boleh diset kurang dari = 0!");
        }
        else {
            this.hargaSatuan = hargaSatuan;
            System.out.println("Harga berhasi diset!");
        }

       
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void tambahStok(int tStok){
        if (tStok > 0){
            this.stok += tStok;
        }
        else {
            System.out.println("Harus ditambah lebih dari nol!");
        }
    }

    public void kurangiStok(int kStok){
        if (kStok > 0 && stok >= kStok){
            this.stok -= kStok;
        }
        else {
            System.out.println("Harus dikurang lebih dari nol! dan stok gudang mencukupi");
        }
    }

    public void tampilkanDetailBarang(){
        System.out.println("ID : " + this.idBarang);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("kategori : " + this.kategori);
        System.out.println("Stok : " + this.stok);
        System.out.println("Harga : " + this.hargaSatuan);
    }




    
}
