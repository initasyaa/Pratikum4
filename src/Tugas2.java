import akun_bank.Tabungan;

public class Tugas2 {
    public static void main(String[] args) {
        Tabungan tabungan=new Tabungan(1,5000);
        System.out.println("Saldo awal : "+tabungan.getSaldo());
        System.out.println("\nJumlah uang yang disimpan : 3000");
        tabungan.debit(3000);
        System.out.println("\nJumlah uang yang diambil : 6000");
        tabungan.kredit(6000);
        System.out.println("\nJumlah uang yang disimpan : 3500");
        tabungan.debit(3500);
        System.out.println("\nJumlah uang yang diambil : 4000");
        tabungan.kredit(4000);
        System.out.println("\nJumlah uang yang diambil : 1600");
        tabungan.kredit(1600);
        System.out.println("\nJumlah uang yang disimpan : 2000");
        tabungan.debit(2000);
        System.out.println("\nSisa saldo sekarang = "+tabunganget.Saldo);
    }
}
