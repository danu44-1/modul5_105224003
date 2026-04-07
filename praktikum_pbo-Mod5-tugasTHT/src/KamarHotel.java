public class KamarHotel {
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    KamarHotel(String nomKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0;
        this.isTersedia = true;
    }

    KamarHotel(String nomorK, String tipe, int kapasitas, double hargaPM) {
        this.nomorKamar = nomorK;
        this.tipeKamar = tipe;
        this.kapasitasMaksimal = kapasitas;
        this.hargaPerMalam = hargaPM;
        this.isTersedia = true;
    }


    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }

    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getHargaPerMalam() {
        return hargaPerMalam;
    }

    public boolean isTersedia() {
        return isTersedia;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar == "Reguler") {
            this.tipeKamar = tipeKamar;

        }
        else if (tipeKamar == "Premium") {
            this.tipeKamar = tipeKamar;

        }
        else if (tipeKamar == "Suite") {
            this.tipeKamar = tipeKamar;
        }
        else {
            this.tipeKamar = "Reguler";
            //System.out.println("Tipe kamar akan dipaksa ke reguler!");
        }
    }

    public void setKapasitasMaksimal(int kapasitasMaksimal) {
        this.kapasitasMaksimal = kapasitasMaksimal;
    }

    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("Tidak boleh dibawah 50000! Harga akan diset secara paksa: " + 50000);
            this.hargaPerMalam = 50000;
        }
        else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    public void pesanKamar() {
        if (isTersedia == true) {
            this.isTersedia = false;
            System.out.println("Kamar berhasil diisi!");
        }
        else {
            System.out.println("Kamar telah terisi!");
        }
        
    }

    public void pesanKamar(int jumlahTamu) {
        if (isTersedia == true && jumlahTamu <= kapasitasMaksimal) {
            this.isTersedia = false;
            System.out.println("Kamar berhasil diisi!");
        }
        else {
            this.isTersedia = true;
            System.out.println("Kapasitas tidak mencukupi, Silahkan pesan kamar tambahan");
        }
    }

    public void batalPesan() {
        this.isTersedia = true;
    }

    public void hitungTotalBayar(int jumlahMalam) {
        this.hargaPerMalam *= jumlahMalam;
    }

    public void hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        if (kodeVoucher == "PROMO" && jumlahMalam >= 3) {
            this.hargaPerMalam *= jumlahMalam;
            double diskon = this.hargaPerMalam * 0.20;
            //double total = this.hargaPerMalam - diskon;
            this.hargaPerMalam -= diskon;
        }
        else {
            this.hargaPerMalam *= jumlahMalam;
            System.out.println("Penggunaan Voucher ditolak");
        }
    }

    public void display() {
        System.out.println("Nomor Kamar : " + this.nomorKamar);
        System.out.println("Tipe Kamar : " + this.tipeKamar);
        System.out.println("Kapasitas : " + this.kapasitasMaksimal);
        System.out.println("Harga Tagihan : " + this.hargaPerMalam);
        System.out.println("Status Kamar Terisi : " + this.isTersedia + "\n");
    }



    
}


