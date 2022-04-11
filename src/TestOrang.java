public class TestOrang {
    public static void main(String[] args) {
        Orang dido=new Orang();
        dido.nama="dido";
        dido.umur=4;
        System.out.println("Nama: " +dido.nama);
        System.out.println("Umur: "+dido.umur+ " tahun.");
        dido.menangis();

        System.out.println();

        Orang dodo=new Orang("Dodo");
        System.out.println("Nama: "+dodo.nama);
        System.out.println("Umur: "+dodo.umur+ " tahun.");
        dodo.tertawa();}
}
