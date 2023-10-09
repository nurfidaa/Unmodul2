public class Bank {
    private double saldo;
    public Bank(double saldo){
        this.saldo = saldo;
    }
    public void simpanuang(double uang){
        saldo = saldo + uang;
    }
    public void ambiluang(double uang){
        saldo = saldo - uang;
    }
    public double getSaldo(){
        return saldo;
    }
}