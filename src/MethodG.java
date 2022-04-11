public class MethodG {
    public static void main(String[] args) {
        Orang1 dosen = getOrang1("Depandi Enda", 29);
        cetakOrang1(dosen);
    }

    private static void cetakOrang1(Orang1 orang){
        System.out.println("Nama = " + orang1.nama);
        System.out.println("Umur = " + orang1.umur + " tahun");
    }

    private static Orang1 getOrang1(String nama, int umur) {
        Orang1 orang = new Orang1(nama, umur);
        return orang;
    }
}
