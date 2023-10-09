public class BankBeraksi {
    public static void main(String[] args) {
        Bank bankku = new Bank(50000);
        System.out.println("Selamat datang di bank Telkom");
        System.out.println("Saldo saat ini : Rp." +
        bankku.getSaldo());
        System.out.println();
        bankku.simpanuang(700000);
        System.out.println("Simpan uang Rp.700000");
        System.out.println("Saldo saat ini : Rp. " + bankku.getSaldo());
        System.out.println();
        bankku.ambiluang(175000);
        System.out.println("Ambil uang Rp. 175000");
        System.out.println("Saldo saat ini : Rp. " + bankku.getSaldo());
    }
}
