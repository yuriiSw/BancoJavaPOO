
package exemplodeclasses;

public class ContaPoupanca extends Conta{
    
    String datasAniversarios;
    
    @Override //Abaixo � a reescrita de m�todo, isso � um tipo de Polimorfismo
    void saqueConta(double valor){
        if ( (saldo - valor) <0)
            System.out.println("SALDO INSUFICIENTE!");
        else
            saldo-=valor;
    }
    
}
