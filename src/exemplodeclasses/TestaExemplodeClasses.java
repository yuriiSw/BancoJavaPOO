package exemplodeclasses;

public class TestaExemplodeClasses {
    public static void main(String[] args) {
        
        ContaPoupanca cp  = new ContaPoupanca();// Objeto Cp para conta poupan�a
        cp.saqueConta(30.00);
        System.out.println("Saldo em Poupan�a:" +cp.saldo);
        
        ContaCorrente cr = new ContaCorrente();
        cr.saqueConta(500.00); //Objeto CR para conta corrente
        System.out.println("Saldo em Conta Corrente: " +cr.saldo);
        
        
    }
}
