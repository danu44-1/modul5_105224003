//Danu Dimas Putra 105224003

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        KamarHotel kamar = new KamarHotel("105", "Premium", 3);
        KamarHotel kamar2 = new KamarHotel("224", "Suite", 2, 51000);

        kamar.setTipeKamar("Presidential");
        kamar.setHargaPerMalam(-10000);

        kamar2.pesanKamar(4);
        kamar2.pesanKamar(2);

        kamar2.pesanKamar();

        kamar.hitungTotalBayar(2,"PROMO");
        kamar2.hitungTotalBayar(4,"PROMO");

        kamar.display();
        kamar2.display();



    }
}
