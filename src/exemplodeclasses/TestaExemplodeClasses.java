package exemplodeclasses;

public class TestaExemplodeClasses {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println("O valor do atributo saldo é: " + conta.saldo);
        System.out.println("O valor do atributo numeroConta é: " + conta.numeroConta);
        conta.depositoConta(1000000);
        conta.saqueConta(5000000);
        System.out.println("O valor do saldo é: " + conta.saldo); 
    }
}
