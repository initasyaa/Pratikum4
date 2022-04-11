package paketA;

public class Mobil {
    private String nama;
    private String noBM;
    int jmlRoda;
    protected String bahanBakar;
    public boolean fullAC;

    public Mobil(String nama, String noBM){
        this.nama=nama;
    this.noBM=noBM;
    this.jmlRoda=4;
    this.bahanBakar="Bensin";
    this.fullAC=true;
    }
    protected String getInfo(){
        String info="Mobil : " +nama+
                "\nJumlah Roda : "+jmlRoda+
                "\nJenis Bahan Bakar : "+bahanBakar+
                "\nFull AC : "+fullAC;
        retun info;
    }
}
