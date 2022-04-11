import paketA.Mobil;

public class TestMobil {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Innova", "BM3210");
        avanza.jmlRoda = 4;
        avanza.bahanBakar = "Solar";
        avanza.fullAC = true;
        System.out.println(avanza.getInfo());
    }
}