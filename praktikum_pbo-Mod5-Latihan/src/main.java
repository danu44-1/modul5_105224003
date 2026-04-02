public class main {
    public static void main(String[] args) throws Exception {
        Karyawan karyawan1 = new Karyawan("12312321", "danu", 10.0, "IT");
        Karyawan karyawan2 = new Karyawan("10522400", "Sulthon Doe", 15.0, "IT");

    //    System.out.println(""+ karyawan1.getId() + "\n" + karyawan1.getNama()); 
    //    karyawan1.setNama("sulthon");
    //    karyawan1.setId("105224");

    //    System.out.println(karyawan1.getId() + "\n" + karyawan1.getNama() + "\n" + karyawan1.getGaji()); 

    System.out.println("Test Soal no 4\n"); // Soal No 4
       karyawan1.tampilkanDataKaryawan();
      
       karyawan2.setGaji(-100.0);
       karyawan2.setDepar("Produksi");
       karyawan2.tampilkanDataKaryawan();


       karyawan2.setGaji(100.0);
       karyawan2.tampilkanDataKaryawan();
    }
}
