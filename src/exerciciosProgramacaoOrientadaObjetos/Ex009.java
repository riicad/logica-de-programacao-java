package exerciciosProgramacaoOrientadaObjetos;

public class Ex009 {
    public static void main(String[] args){
        Produto computador = new Produto();

        computador.setProduto("Ryze5300", 3244, 20);
        computador.mostrarInformacoes();
        computador.realizarCompra();
        computador.realizarCompra();
        computador.mostrarInformacoes();

    }
}
