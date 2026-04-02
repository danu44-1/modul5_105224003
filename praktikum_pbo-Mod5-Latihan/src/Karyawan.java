// soal 1
public class Karyawan {
    private String idKaryawan;
    private String nama;
    private double gajiPokok;
    private String departemen;

   public Karyawan(String idKarya, String nama, double gaji, String depar) {
        this.idKaryawan = idKarya;
        //    setId(idKaryawan);
        //    setNama(nama);
        this.nama = nama;
        this.gajiPokok = gaji;
        this.departemen = depar;
    }

    public String getId() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji(){ // soal no 2
       return gajiPokok;
    }

    public String getDepar(){
        return departemen;
    }

    public void setId(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setGaji(double gaji){ // soal no 2
        if (gaji < 0){
            System.out.println("Perubahan tidak bisa kurang dari nol!");
        }
        else {
            this.gajiPokok = gaji;
            System.out.println("Berhasil!");
        }
    }
    
    public void setDepar(String depar){
        this.departemen = depar;
    }

    public void tampilkanDataKaryawan() {
        // this.idKaryawan = idKarya;
        // this.nama = nama;
        // this.gajiPokok = gaji;
        // this.departemen = departemen;

        System.out.println("ID : " + this.idKaryawan);
        System.out.println("Nama : " + this.nama);
        System.out.println("Gaji : " + this.gajiPokok);
        System.out.println("Departemen : " + this.departemen);
        
    }






}
