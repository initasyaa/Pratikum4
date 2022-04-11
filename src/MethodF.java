public class MethodF {
    public static void main(String[] args) {
        Orang1 daru = new Orang1("Daru Nugroho", 20);
        cetakOrang(daru);
    }

    private static void cetakOrang(Orang1 orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur = " + orang.umur + " tahun");
    }
}
