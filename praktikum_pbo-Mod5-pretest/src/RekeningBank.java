public class RekeningBank {
    private String nomorRekening;
    private int saldo = 0;


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo){
         if (saldo < -1){
            System.out.println("Saldo yang diisi tidak boleh negatif!");
        }
        else {
            this.saldo += saldo;
            System.out.println("Saldo berhasil ditambah dengan total = " + saldo);
        }
    }
}
