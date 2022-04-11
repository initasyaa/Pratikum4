public class TestEvent {

    public static void main(String[] args) {
        Event even = new Event("Yuk Ngaji", 200);
        even.tglKegiatan = 10;
        even.blnKegiatan = 11;
        even.tahunKegiatan = 2018;
        even.infoEvent();
        System.out.println("=========================");
        System.out.println("Tanggal Kegiatan : " + even.tglKegiatan + "/" + even.blnKegiatan + "/" + even.tahunKegiatan);
        even.jmlPeserta = 100;
        System.out.println("Jumlah Peserta : " +even.jmlPeserta);
    }
}