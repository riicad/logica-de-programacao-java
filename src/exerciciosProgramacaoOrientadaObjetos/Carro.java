package exerciciosProgramacaoOrientadaObjetos;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;

    public void setModelo(String nomeModelo){
        this.modelo = nomeModelo;
    }

    public void setCor(String nomeCor){
        this.cor = nomeCor;
    }

    public void setAno(int anoCarro){
        this.ano = anoCarro;
    }

    public void mostrarInformacoes(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ano do  Carro: "+this.ano);
    }

    public void ligarCarro(){
        System.out.println("O carro está sendo ligado!");
    }

    public void desligarCarro(){
        System.out.println("O carro está sendo desligado.");
    }
}
