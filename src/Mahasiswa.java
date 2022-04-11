public class Mahasiswa {
    public int nrp;
    public String nama;
    public void info(){
        System.out.println("Ini Mahasiswa RPL Polbeng");
    }

    public static void main(String[] args) {
        Mahasiswa it=new Mahasiswa();
        it.nrp=5;
        it.nama="tasya";
        it.info();
    }

    public static class Mahasiswa1 {

        private String nama;
        private int nrp;

        public String getNama(){
            return nama;
        }

        public void setNama(String nama){
            this.nama=nama;
        }
        public int getNrp(){
            return nrp;
        }
        public void setNrp(int nrp){
            this.nrp=nrp;
        }

        public Mahasiswa1(String nama, int nrp){
            this.nama=nama;
            this.nrp=nrp;
        }
        public void info(){
            System.out.println(nama+", "+nrp);
        }
        public String toString(){
            System.out.println("Data Mahasiswa\n"+nama+"\n"+nrp);
            return null;
        }
    }
}
