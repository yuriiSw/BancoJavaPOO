package exemplodeclasses;

public class Conta {
    // Atributos
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    // Métodos
    void saqueConta(double valor) {
        saldo-=valor; // equivale saldo=saldo-valor
    }
    
    void depositoConta(double valor) {
        saldo+=valor ; // saldo=saldo+valor
    }
    Conta(){
        saldo = 100;
        
    }
}
