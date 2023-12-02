package exerciciosProgramacaoOrientadaObjetos;

public class Circulo {
    private double area;
    private double raio;
    private double pi = Math.PI;
    private double comprimento;

    public void calcularArea(int raioCirculo){
        this.raio = raioCirculo;
        this.area = (raio*raio)*pi;
    }

    public void Ponto(){
        this.comprimento = 2*pi*raio;
        System.out.println("O tamanho do comprimento é: "+comprimento);
    }

    public void mostrarArea(){
        System.out.println("A área do circulo é: "+area);
    }


}
