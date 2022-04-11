public class Event {
    int tglKegiatan;
    int blnKegiatan;
    int tahunKegiatan;
    protected int maxPeserta;
    protected int jmlPeserta;
    public String namaEvent;
    final int biayaPendaftaran = 50000;
    String tempatEvent;

    public Event(String nama, int m) {
        namaEvent = nama;
        maxPeserta = m;
    }

    void infoEvent() {
        System.out.println("Nama event : " + namaEvent);
        System.out.println("Maksimal Peserta : " + maxPeserta);
        System.out.println("Biaya Pendaftaran : " + biayaPendaftaran);
    }
}