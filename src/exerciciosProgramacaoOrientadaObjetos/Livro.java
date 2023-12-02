package exerciciosProgramacaoOrientadaObjetos;

public class Livro {
    private String autor;
    private String titulo;
    private int numeroDePaginas;

    public void adicionarAutor(String nomeAutor){
        this.autor = nomeAutor;
    }

    public void adicionarTitulo(String titutoLivro){
        this.titulo = titutoLivro;
    }
    public void setNumeroDePaginas(int paginas){
        this.numeroDePaginas = paginas;
    }
    public void mostrarInformacoes(){
        System.out.println("O autor do livro é: "+this.autor);
        System.out.println("O titulo do livro é: "+this.titulo);
        System.out.println("O numero de páginas que ele tem é: "+this.numeroDePaginas);
    }
}
