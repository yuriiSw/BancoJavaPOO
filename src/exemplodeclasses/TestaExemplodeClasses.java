package exemplodeclasses;

public class TestaExemplodeClasses {
    public static void main(String[] args) {
        Conta conta = new Conta();
     
        conta.depositoConta(5.00);
        conta.saqueConta(1);
        
        System.out.println("O valor do saldo é: " + conta.saldo);
    }
}
