package POO;

public class ObjetoCaneta {
    public static void main(String[] args){
        Caneta caneta1 = new Caneta();

        caneta1.modelo = "Bic Cristal";
        caneta1.cor = "azul";
        caneta1.ponta = 0.5f;
        caneta1.carga =90;
        caneta1.tipo = "Streographic";
        caneta1.marca = "Bic";

        caneta1.estado();
        caneta1.tampar();
        caneta1.rabiscar();

        System.out.println('-'*40);

        Caneta caneta2 = new Caneta();

        caneta2.modelo = "Marca texto";
        caneta2.cor = "amarelo";
        caneta2.ponta = 0.9f;
        caneta2.carga = 20;
        caneta2.tipo = "Hidrografica";
        caneta2.marca = "Faber Castel";

        caneta2.estado();
        caneta2.destampar();
        caneta2.rabiscar();

    }
}
