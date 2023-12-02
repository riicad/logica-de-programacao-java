package exerciciosProgramacaoOrientadaObjetos;

public class Ex003 {
    public static void main(String[] args){
        Livro primeiroLivro = new Livro();

        primeiroLivro.adicionarTitulo("O morro dos ventos uivantes");
        primeiroLivro.adicionarAutor("Emily Bronte");
        primeiroLivro.setNumeroDePaginas(368);

        primeiroLivro.mostrarInformacoes();
    }
}
