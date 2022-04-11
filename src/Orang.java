public class Orang {
    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggBadan;
    int beratBadan;

    public  Orang(){

    }

    public Orang(String nama){
        this.nama=nama;
    }
    public void menangis(){
        System.out.println("hu...huu..");
    }

    public void tertawa(){
        System.out.println("haa...hahah");
    }

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
        dodo.tertawa();
    }
}
