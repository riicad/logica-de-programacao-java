package exerciciosProgramacaoOrientadaObjetos;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public void setProduto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço:  R$"+preco);
        System.out.println("Estoque: "+estoque);
    }

    public void realizarCompra(){
        System.out.println("Sua compra foi realizada com sucesso.");
        this.estoque -= 1;
    }

}
