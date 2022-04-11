public class TestOrang11 {
    public static void main(String[] args) {
        Orang badu = new Orang(); //construktor tanpa parameter
        badu.nama = "Badu";
        badu.umur = 12;
        System.out.println("Nama : " + badu.nama);
        System.out.println("Umur : " + badu.umur + "tahun.");
        badu.tertawa();

        System.out.println();

        Orang dodo = new Orang("Dodo", 10);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + "tahun.");
        dodo.menangis();

        System.out.println();
        rang jono = new Orang("jono", 12, 168, 76);
        System.out.println("Nama : " + dodo.nama);
        System.out.println("Umur : " + dodo.umur + "tahun.");
        dodo.menangis();

    }
}
