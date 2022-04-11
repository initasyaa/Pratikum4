public class TestOrang4 {
    public static void main(String[] args) {
        Orang1 badu = new Orang1(); //construktor tanpa parameter
        badu.nama = "Badu";
        badu.umur = 12;
        System.out.println("Nama : " + badu.nama);
        System.out.println("Umur : " + badu.umur + "tahun.");
        badu.tertawa();

        System.out.println();

        Orang1 dodo = new Orang1("Dodo", 10);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + "tahun.");
        dodo.menangis();

        System.out.println();
        Orang1 jono = new Orang1("jono", 12, 168, 76);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + "tahun.");
        dodo.menangis();

    }
}
