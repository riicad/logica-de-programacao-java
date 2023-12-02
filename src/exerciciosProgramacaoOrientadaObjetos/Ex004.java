package exerciciosProgramacaoOrientadaObjetos;

public class Ex004 {
    public static void main(String[] args){
        ContaBancaria novaConta = new ContaBancaria();

        novaConta.defNumeroConta(1337);
        novaConta.depositar(12000);
        novaConta.mostrarSaldo();

        novaConta.sacar(500);
        novaConta.mostrarSaldo();
    }
}
