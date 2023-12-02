package exerciciosProgramacaoOrientadaObjetos;

public class Ex005 {
    public static void main(String[] args){
        Carro primeiroCarro = new Carro();

        primeiroCarro.setModelo("Camaro");
        primeiroCarro.setCor("Amarelo");
        primeiroCarro.setAno(1997);

        primeiroCarro.mostrarInformacoes();
        primeiroCarro.ligarCarro();
    }
}
