package exerciciosMetodos;

public class Ex006 {

     static String trocarValores(int valor1, int valor2){
        System.out.println("Antes da troca: valor 1 = "+ valor1 +", valor = "+ valor2);

        int valor3 = valor1;
        valor1 = valor2;
        valor2 = valor3;

        return "valor 1: "+valor1+" valor 2: "+valor2;
    }

    public static void main(String[] args){
         int numero = 2;
         int numero2 = 10;

         System.out.println(trocarValores(2,10));
    }
}
