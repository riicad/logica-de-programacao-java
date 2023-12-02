package exerciciosMetodos;

//Crie um método chamado calcularMedia que recebe um array de números como parâmetro e retorna a média deles.
public class Ex003 {

    static int media(int[] numeros){
        int somaTotal = 0;
        for(int i : numeros){
            somaTotal += i;
        }
        return somaTotal/numeros.length;
    }

    public static void main(String[] args){
        int[] listaNotas = {10, 5, 6, 7};
        System.out.println("A média das suas notas é: "+media(listaNotas));
    }
}
