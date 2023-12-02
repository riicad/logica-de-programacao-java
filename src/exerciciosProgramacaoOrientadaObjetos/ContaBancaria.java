package exerciciosProgramacaoOrientadaObjetos;

public class ContaBancaria {
    private double saldo;
    private int numeroDaConta;


    public void defNumeroConta(int num){
        this.numeroDaConta = num;
    }
    public void depositar(double valorDeposito){
        this.saldo +=valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
    }

    public void mostrarSaldo(){
        System.out.println("O saldo da conta "+this.numeroDaConta+" é: R$"+saldo);
    }
}
